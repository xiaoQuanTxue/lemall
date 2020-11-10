//根据sessionstroryge里的userid加载购物车

$.ajax({
    url: 'http://localhost:8080/cart/display/' + 1 + '',
    dataType: 'json',
    success: function(carts) {
        alert(carts);
        var item = "";
        if (carts === undefined) {
            $(".item-content").replaceWith(item);
        }
        for (var i = 0; i < carts.length; i++) {
            var checkbox = '<ul class="item-content" data-id="' + carts[i].cartId + '" data-gid="' + carts[i].good.goodId + '" clearfix"><li class="td td-chk"><div class="cart-checkbox "><input class="check" id="" name="item" value="170037950254" type="checkbox"><label for="J_CheckBox_170037950254"></label></div></li>';

            var imgName = '<li class="td td-item"><div class="item-pic"><a href="#" target="_blank" data-title="美康粉黛醉美东方唇膏口红正品 持久保湿滋润防水不掉色护唇彩妆" class="J_MakePoint" data-point="tbcart.8.12">';
            var img = '<img src="' + carts[i].good.pictureLocation.goodDetailsIgm + '" class="itempic J_ItemImg"></a></div>';

            var info = '<div class="item-info"><div class="item-basic-info"><a href="#" target="_blank" title="美康粉黛醉美唇膏 持久保湿滋润防水不掉色" class="item-title J_MakePoint" data-point="tbcart.8.11">' + carts[i].good.goodName + '</a></div></div></li>';

            var size1 = '<li class="td td-info"><div class="item-props item-props-can">';
            var size2 = '';
            for (var j = 0; j < carts[i].sizes.length; j++) {
                size2 += '<span class="sku-line" data-sizeid="' + carts[i].sizes[j].sizeId + '">' + carts[i].sizes[j].property.propName + ' : ' + carts[i].sizes[j].value.valContent + '</span></br>';

            }
            var size3 = '<span tabindex="0" class="btn-edit-sku theme-login">修改</span><i class="theme-login am-icon-sort-desc"></i></div></li>';
            var price1 = '<li class="td td-price"><div class="item-price price-promo-promo"><div class="price-content">';
            var price2 = '<div class="price-line"><em class="price-original">' + carts[i].good.goodOriginalPrice + '</em></div><div class="price-line"><em class="J_Price price-now" tabindex="0">' + carts[i].good.goodCurrentPrice + '</em></div></div></div></li>';
            var add1 = '<li class="td td-amount"><div class="amount-wrapper "><div class="item-amount "><div class="sl"><input class="min am-btn" name="" type="button" value="-" />';
            var add2 = '<input class="text_box" name="" type="text" readonly value="1" style="width:30px;" /><input class="add am-btn" name="" type="button" value="+" /></div></div></div></li>';
            var sumprice = '<li class="td td-sum"><div class="td-inner"><em tabindex="0" class="J_ItemSum number">' + carts[i].good.goodCurrentPrice + '</em></div></li>';
            var collect = '<li class="td td-op"><div class="td-inner"><a title="移入收藏夹" class="btn-fav" href="#">移入收藏夹</a><a href="javascript:;" data-point-url="#" class="delete">删除</a></div></li></ul>';
            item += (checkbox + imgName + img + info + size1 + size2 + size3 + price1 + price2 + add1 + add2 + sumprice + collect);
        }

        $(".item-content").replaceWith(item);
    }
});
//全选
validChecked();

$(document).on("click", ".check-all", function() {

        var state = this.checked;
        $(".check").prop("checked", state);
        addfunc();
        addGoodNum();
    }

);

//点击普通checkbox


$(document).on("click", "input[name='item']", function() {


        addfunc();

        validChecked();
        addGoodNum();
    }

);
//减号键


$(document).on("click", ".min", function() {

    var a = $(this).next().val();
    var num = parseInt(a);
    num -= 1;
    if (num >= 1) {
        $(this).next().val(num);
        var ad = $(this).parents(".td-amount").prev().find(".price-now").text();
        var adf = parseFloat(ad);
        var mount = num * adf;
        $(this).parents(".td-amount").next().find(".number").text(mount);
    }


    addfunc();
    addGoodNum();
});

//加号键
/** 
 * 点加号的同时计算总价
 * */
$(document).on("click", ".add", function() {

    var a = $(this).prev().val();
    var num = parseInt(a);
    if (num >= 1) {
        num += 1;
    }
    $(this).prev().val(num);


    //同类商品总价变化

    var ad = $(this).parents(".td-amount").prev().find(".price-now").text();
    var adf = parseFloat(ad);
    var mount = num * adf;
    $(this).parents(".td-amount").next().find(".number").text(mount);
    addfunc();
    addGoodNum();
});
/**
 * 删除购物车中商品
 * 1.删除页面商品栏内容
 * 2.ajax请求后端删除数据库中购物车内容
 * 3.调解页面件数，价钱数目
 */

$(document).on("click", ".delete", function() {
    $(this).parents(".item-content").remove();
    var cartId = $(this).parents(".item-content").attr("data-id");

    $.ajax({
        url: 'http://localhost:8080/cart/delete/' + cartId,
        dataType: 'text',
        success: function(data) {
            if (data === "success") {
                addGoodNum();
                addfunc();
                validChecked();
                // alert("删除成功");
            }
        }
    });
});
/**
 * 移入收藏夹
 * 删除页面该商品项
 * 
 */
$(document).on("click", ".btn-fav", function() {
    var cartId = $(this).parents(".item-content").attr("data-id");
    $(this).parents(".item-content").remove();
    $.ajax({
        url: 'http://localhost:8080/cart/move/' + cartId,
        dataType: 'text',
        success: function(data) {


            if (data === "success") {

                addGoodNum();
                addfunc();
                validChecked();
                // alert("移入收藏夹成功");
            }
        }
    });
});

/**
 * 全选删除
 */
$(document).on("click", ".deleteAll", function() {
    var state = $(".check-all").prop("checked");
    // var$(".item-content").attr("data-id");

    if (state) {
        var a = [];
        // alert($(".bundle-main .item-content").attr("data-id"));
        $(".item-content").each(function() {
            a.push(parseInt($(this).attr("data-id")));
        });
        // alert(JSON.stringify(a));
        $.ajax({
            type: "DELETE",
            url: "http://localhost:8080/cart/deleteAll",
            contentType: "application/json;charset=utf-8",
            data: JSON.stringify(a),
            dataType: "text",
            success: function(message) {
                $(".item-content").remove();
                // alert(message);
                addGoodNum();
                addfunc();
                validChecked();
            },
            error: function(message) {
                alert("提交失败" + JSON.stringify(message));
            }
        });
    }
});

/**
 * 全部移入收藏夹
 */

$(document).on("click", ".J_BatchFav", function() {
    var state = $(".check-all").prop("checked");
    // var$(".item-content").attr("data-id");

    if (state) {
        var a = [];
        // alert($(".bundle-main .item-content").attr("data-id"));
        $(".item-content").each(function() {
            a.push(parseInt($(this).attr("data-id")));
        });
        alert(JSON.stringify(a));
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/cart/moveAll",
            contentType: "application/json;charset=utf-8",
            data: JSON.stringify(a),
            dataType: "text",
            success: function(message) {
                $(".item-content").remove();
                // alert(message);
                addGoodNum();
                addfunc();
                validChecked();
            },
            error: function(message) {
                alert(message);
            }
        });
    }
});
/**
 * 提交购物车商品到订单
 *
 */
$(document).on("click", "#J_Go", function() {
    // var orders = new Map();
    // orders.set("userId", 1);
    // var good = new Map();
    // var a = {
    //     cartid: 0,
    //     sizeIds: []
    // };
    var carts = [];
    // alert($(".bundle-main .item-content").attr("data-id"));
    var cart = $("input[name='item']:checked").parents(".item-content");
    for (var k = 0; k < cart.length; k++) {
        var a = {
            cartid: 0,
            sizeIds: []
        };
        a.cartid = parseInt($(cart[k]).attr("data-id"));
        var ss = $(cart[k]).find(".sku-line");
        for (var j = 0; j < ss.length; j++) {
            // a.sizeIds.push(parseInt($(ss[j]).attr("data-sizeid")));
            a.sizeIds[j] = $(ss[j]).attr("data-sizeid");
        }
        // carts.push(a);
        carts[cart.length - k - 1] = a;
    }
    var orders1 = {
        userId: 1,
        total_price: parseInt($("#total").text()),
        goods: [],
        carts: carts
    };


    var items = $("input[name='item']:checked");
    for (var i = 0; i < items.length; i++) {
        var goodId = $(items[i]).parents(".item-content").attr("data-gid");
        var goodNum = $(items[i]).parents(".item-content").find(".text_box").prop("value");
        // good.set(parseInt(goodId), parseInt(goodNum));
        var good = {
            goodId: 0,
            orderitemNumber: 0
        };
        good.goodId = parseInt(goodId);
        good.orderitemNumber = parseInt(goodNum);
        // orders1.goods.push(good);
        orders1.goods[i] = good;
    }
    // alert(orders1);
    // orders.set("goods", good);
    console.log(JSON.stringify(orders1));
    $.ajax({
        url: "http://localhost:8080/cart/submit",
        type: "post",
        data: JSON.stringify(orders1),
        contentType: "application/json",
        dataType: "text",
        success: function(msg) {
            alert(msg);
            // if () {
            window.location.href = "pay.html?orderId=" + msg;
            // } else {
            //     alert("出错了");
            // }

        }
    });

});


/**
 * 将所有被选中的商品的价格相加
 */

function addfunc() {
    var sums = $("input[name='item']:checked").parents(".td").siblings(".td-sum").find(".J_ItemSum");
    var sum = 0.0;

    for (var i = 0; i < sums.length; i++) {
        // alert(sums[i].innerHTML);

        sum += parseFloat(sums[i].innerHTML);

    }

    // $("#J_SelectedItemsCount").text(sums.length);
    $("#total").text(sum);
}
/**
 * 如果普通复选框被选中的数量等于普通复选的数量，
 * 全选选中，
 * 反之如果复选框被选中的数量不等于普通复选框的数量全，全选取消
 */
function validChecked() {
    var num = $("input[name='item']:checked").length;
    if (num < $("input[name='item']").length) {
        $(".check-all").attr("checked", false);
    } else if (num == $("input[name='item']").length) {
        $(".check-all").attr("checked", true);
    }
}
/**
 * 计算商品件数
 * 将被选中的商品的件数相加
 */
function addGoodNum() {
    var s = $("input[name='item']:checked").parents(".td-chk").siblings(".td-amount").find(".text_box");

    var sum = 0;
    for (var i = 0; i < s.length; i++) {

        sum += parseInt(s[i].value);
    }
    $("#J_SelectedItemsCount").text(sum + '');
}
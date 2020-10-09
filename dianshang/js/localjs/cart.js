//根据sessionstroryge里的userid加载购物车
$.ajax({
    url: 'http://localhost:8080/cart/display/' + 1 + '',
    dataType: 'json',
    success: function(carts) {
        var item = "";

        for (var i = 0; i < carts.length; i++) {
            var checkbox = '<ul class="item-content clearfix"><li class="td td-chk"><div class="cart-checkbox "><input class="check" id="" name="item" value="170037950254" type="checkbox"><label for="J_CheckBox_170037950254"></label></div></li>';

            var imgName = '<li class="td td-item"><div class="item-pic"><a href="#" target="_blank" data-title="美康粉黛醉美东方唇膏口红正品 持久保湿滋润防水不掉色护唇彩妆" class="J_MakePoint" data-point="tbcart.8.12">';
            var img = '<img src="' + carts[i].good.pictureLocation.goodDetailsIgm + '" class="itempic J_ItemImg"></a></div>';

            var info = '<div class="item-info"><div class="item-basic-info"><a href="#" target="_blank" title="美康粉黛醉美唇膏 持久保湿滋润防水不掉色" class="item-title J_MakePoint" data-point="tbcart.8.11">' + carts[i].good.goodName + '</a></div></div></li>';





            var size1 = '<li class="td td-info"><div class="item-props item-props-can">';
            var size2 = '';
            for (var j = 0; j < carts[i].sizes; j++) {
                size2 += '<span class="sku-line">' + carts[i].sizes[j].property.propName + ':' + carts[i].sizes[j].value.valContent + '</span>';

            }
            var size3 = '<span tabindex="0" class="btn-edit-sku theme-login">修改</span><i class="theme-login am-icon-sort-desc"></i></div></li>';

            var price1 = '<li class="td td-price"><div class="item-price price-promo-promo"><div class="price-content">';
            var price2 = '<div class="price-line"><em class="price-original">' + carts[i].good.goodOriginalPrice + '</em></div><div class="price-line"><em class="J_Price price-now" tabindex="0">' + carts[i].good.goodCurrentPrice + '</em></div></div></div></li>';








            var add1 = '<li class="td td-amount"><div class="amount-wrapper "><div class="item-amount "><div class="sl"><input class="min am-btn" name="" type="button" value="-" />';




            var add2 = '<input class="text_box" name="" type="text" value="1" style="width:30px;" /><input class="add am-btn" name="" type="button" value="+" /></div></div></div></li>';





            var sumprice = '<li class="td td-sum"><div class="td-inner"><em tabindex="0" class="J_ItemSum number">' + carts[i].good.goodCurrentPrice + '</em></div></li>';




            var collect = '<li class="td td-op"><div class="td-inner"><a title="移入收藏夹" class="btn-fav" href="#">移入收藏夹</a><a href="javascript:;" data-point-url="#" class="delete">删除</a></div></li></ul>';
            item += (checkbox + imgName + img + info + size1 + size2 + size3 + price1 + price2 + add1 + add2 + sumprice + collect);
        }
        $(".item-content").replaceWith(item);
    }
});
//全选
validChecked();
$(".check-all").click(

    function() {
        var state = this.checked;
        $(".check").prop("checked", state);
        addfunc();
    }

);

//点击普通checkbox

$("input[name='item']").click(

    function() {

        addfunc();

        validChecked();

    }

);
//减号键

$(".min").click(
    function() {
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



    }
);

//加号键
$(".add").click(
    function() {
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
    }
);


//add

function addfunc() {
    var sums = $("input[name='item']:checked").parents(".td").siblings(".td-sum").find(".J_ItemSum");
    var sum = 0.0;

    for (var i = 0; i < sums.length; i++) {
        // alert(sums[i].innerHTML);

        sum += parseFloat(sums[i].innerHTML);

    }

    $("#J_SelectedItemsCount").text(sums.length);
    $("#total").text(sum);
}

function validChecked() {
    var num = $("input[name='item']:checked").length;
    if (num < $("input[name='item']").length) {
        $(".check-all").attr("checked", false);
    } else if (num == $("input[name='item']").length) {
        $(".check-all").attr("checked", true);
    }
}
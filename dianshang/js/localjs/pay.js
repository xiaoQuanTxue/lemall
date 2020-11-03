// $(document).ready(function() {

// });
var str = window.location.search;
str = str.substr(0);
str = str.split("=")[1];

//订单展示
$.ajax({
    url: 'http://localhost:8080/order/displayOrder/' + str,
    type: 'post',
    // data: 'orderId=' + str,
    dataType: 'json',
    success: function(data) {

        var str1 = '';
        var head = '<h3>确认订单信息</h3><div class="cart-table-th"><div class="wp"><div class="th th-item"><div class="td-inner">商品信息</div></div><div class="th th-price"><div class="td-inner">单价</div></div><div class="th th-amount"><div class="td-inner">数量</div></div><div class="th th-sum"><div class="td-inner">金额</div></div><div class="th th-oplist"><div class="td-inner">配送方式</div></div></div></div><div class="clear"></div>'
        for (var i = 0; i < data.orderitemList.length; i++) {

            var name = '<tr class="item-list"><div class="bundle  bundle-last"><div class="bundle-main"><ul class="item-content clearfix"><div class="pay-phone"><li class="td td-item"><div class="item-pic"><a href="#" class="J_MakePoint"><img src="' + data.orderitemList[i].good.pictureLocation.goodDetailsIgm + '" class="itempic J_ItemImg"></a></div><div class="item-info"><div class="item-basic-info"><a href="#" class="item-title J_MakePoint" data-point="tbcart.8.11">' + data.orderitemList[i].good.goodName + '</a> </div></div></li><li class="td td-info"><div class="item-props">';
            var sizes = '';
            // sizes= '<span class="sku-line">'+data.orderitemList[i].sizes[j].property.propName+':'+data.orderitemList[i].sizes[j].value.valContent+'</span><br/>';
            for (var j = 0; j < data.orderitemList[i].sizes.length; j++) {
                sizes += '<span class="sku-line">' + data.orderitemList[i].sizes[j].property.propName + ':' + data.orderitemList[i].sizes[j].value.valContent + '</span><br/>';
            }
            var price = '</div></li><li class="td td-price"><div class="item-price price-promo-promo"><div class="price-content"><em class="J_Price price-now">' + data.orderitemList[i].good.goodCurrentPrice + '</em></div></div></li></div>';
            var number = '<li class="td td-amount"><div class="amount-wrapper "><div class="item-amount "><span class="phone-title">购买数量</span><div class="sl">' + data.orderitemList[i].orderitemNumber + '</div> </div></div></li>';
            var totalPrice = '<li class="td td-sum"><div class="td-inner"><em tabindex="0" class="J_ItemSum number">' + data.orderitemList[i].good.goodCurrentPrice * data.orderitemList[i].orderitemNumber + '</em></div></li>';
            var end = '<li class="td td-oplist"><div class="td-inner"><span class="phone-title">配送方式</span><div class="pay-logis">快递<b class="sys_item_freprice">免邮</b></div></div></li></ul><div class="clear"></div></div></div></tr>';

            str1 += (name + sizes + price + number + totalPrice + end);
        }
        console.log(str1);
        $(".pay-sum").text(data.ordersTotal);
        $("#J_ActualFee").text(data.ordersTotal);
        $("#payTable").replaceWith(head + str1);

    }
});
//邮寄地址
$.ajax({
    url: 'http://localhost:8080/deliveryAddress/select',
    data: 'userid=' + 1,
    dataType: 'json',
    success: function(data) {

    }
});

$.ajax({
    url: "http://localhost:8080/deliveryAddress/select",
    data: bb(),
    success: function(info) {
        var li1 = '';
        var li2 = '';


        for (var i = 0; i < info.length; i++) {
            var phonenum = info[i].deliveryPhone;
            var num1 = phonenum.substring(0, 3);
            var num2 = phonenum.substring(7);
            var adid = info[i].deliveryId;

            if (info[i].deliveryDefault == 0) {
                li1 +=
                    '<div class="per-border"></div><li id="' + adid +
                    '" class="user-addresslist ">' +
                    '<div class="address-left"><div class="user DefaultAddr">' +
                    '<span class="buy-address-detail">' +
                    '<span class="buy-user">' + info[i].deliveryReceiver + '</span><span class="buy-phone">' + num1 + '****' + num2 + '</span>' +
                    '</span></div><div class="default-address DefaultAddr"><span class="buy-line-title buy-line-title-type">收货地址：</span>' +
                    '<span class="buy--address-detail">' +
                    '<span class="province">' + info[i].province + '</span>省' +
                    '<span class="city">' + info[i].city + '</span>市' +
                    '<span class="dist">' + info[i].districtt + '</span>区' +
                    '<span class="street">' + info[i].deliveryAddress + '</span>' +
                    '</span></span></div><ins class="deftip hidden">默认地址</ins></div><div class="address-right">' +
                    '<a href="../person/address.html">' +
                    '<span class="am-icon-angle-right am-icon-lg"></span></a></div>' +
                    '<div class="clear"></div><div class="new-addr-btn"><a href="#" class="default" >设为默认</a>' +
                    '<span class="new-addr-bar">|</span>' +
                    '<a href="#">编辑</a><span class="new-addr-bar">|</span>' +
                    '<a href="javascript:void(0);" class="am-icon-trash">删除</a></div></li>';
            } else {
                li2 +=
                    '<div class="per-border"></div><li id="' + adid +
                    '" class="user-addresslist defaultAddr">' +
                    '<div class="address-left"><div class="user DefaultAddr">' +
                    '<span class="buy-address-detail">' +
                    '<span class="buy-user">' + info[i].deliveryReceiver + '</span><span class="buy-phone">' + num1 + '****' + num2 + '</span>' +
                    '</span></div><div class="default-address DefaultAddr"><span class="buy-line-title buy-line-title-type">收货地址：</span>' +
                    '<span class="buy--address-detail">' +
                    '<span class="province">' + info[i].province + '</span>省' +
                    '<span class="city">' + info[i].city + '</span>市' +
                    '<span class="dist">' + info[i].districtt + '</span>区' +
                    '<span class="street">' + info[i].deliveryAddress + '</span>' +
                    '</span></span></div><ins class="deftip">默认地址</ins></div><div class="address-right">' +
                    '<a href="../person/address.html">' +
                    '<span class="am-icon-angle-right am-icon-lg"></span></a></div>' +
                    '<div class="clear"></div><div class="new-addr-btn"><a href="#" class="hidden">设为默认</a>' +
                    '<span class="new-addr-bar hidden">|</span>' +
                    '<a href="#">编辑</a><span class="new-addr-bar">|</span>' +
                    '<a href="javascript:void(0);" class="am-icon-trash">删除</a></div></li>';
            }
        }
        $("#address-list").replaceWith(li2 + li1);
        var reciver = $(".defaultAddr").find(".buy-user").text();
        var phone = $(".defaultAddr").find(".buy-phone").text();
        var province = $(".defaultAddr").find(".province").text();
        var city = $(".defaultAddr").find(".city").text();
        var dist = $(".defaultAddr").find(".dist").text();
        var street = $(".defaultAddr").find(".street").text();

        $(".box").find(".province").text(province);
        $(".box").find(".city").text(city);
        $(".box").find(".dist").text(dist);
        $(".box").find(".street").text(street);
        $(".box").find(".buy-user").text(reciver);
        $(".box").find(".buy-phone").text(phone);
        // $("ul#ult").append(li1);
    }

});

function bb() {
    // var v = "userid=" + sessionStorage.getItem("userid");
    var v = "userid=1";
    console.log(v);
    return v;
}

$("#add").click(
    function name() {
        $.ajax({
            url: "http://localhost:8080/deliveryAddress/add",
            data: {
                "deliveryReceiver": $("#user-name").val(),
                "deliveryPhone": $("#user-phone").val(),
                "province": $('.province option:selected').val(),
                "city": $('.city option:selected').val(),
                "districtt": $('.districtt option:selected').val(),
                // "userid": sessionStorage.get("userid"),
                "userid": 1,
                "deliveryAddress": document.getElementById("user-intro").value,
            },
            success: function(info) {
                // alert(info);
                // window.location.href = "address.html";

                $(document.body).css("overflow", "visible");
                $('.theme-login').removeClass("selected");
                $('.item-props-can').removeClass("selected");
                $('.theme-popover-mask').hide();

                $('.theme-popover').slideUp(200);
                parent.location.reload();
            }
        });
    }
);
/**
 * 删除
 */
$(".am-icon-trash").live('click', function() {

    $(this).parent().parent().remove();
    var id = $(this).parent().parent().attr('id');
    // alert(id);
    $.ajax({
        url: "http://localhost:8080/deliveryAddress/del",
        data: "id=" + id,
        success: function(info) {

            alert(info);
        }
    });


});

$(document).on("click", ".user-addresslist", function() {
    // alert(";");
    var reciver = $(this).find(".buy-user").text();
    var phone = $(this).find(".buy-phone").text();
    var province = $(this).find(".province").text();
    var city = $(this).find(".city").text();
    var dist = $(this).find(".dist").text();
    var street = $(this).find(".street").text();
    console.log(reciver + ';' + phone + ";" + province + ";" + city + ";" + dist + ";" + street);
    $(".box").find(".province").html(province);
    $(".box").find(".city").html(city);
    $(".box").find(".dist").html(dist);
    $(".box").find(".street").html(street);
    $(".box").find(".buy-user").html(reciver);
    $(".box").find(".buy-phone").html(phone);
    console.log(";");
    var s = $(".holyshit268").find(".province").text();
    console.log(s);
    //$("#J_Go")
});

//设为默认地址

$(document).on("click", ".default", function() {
    var userId = 1;
    var id = $(this).parents(".user-addresslist ").attr("id");
    $.ajax({
        url: 'http://localhost:8080/deliveryAddress/default',
        data: 'userId=' + userId + '&id=' + id,
        success: function(data) {

            window.location.reload();
        }
    });
});
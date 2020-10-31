// $(document).ready(function() {

// });
var str = window.location.search;
str = str.substr(0);
str = str.split("=")[1];

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
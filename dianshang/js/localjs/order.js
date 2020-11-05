/**
 * status 0 交易关闭
 * status 1 待付款
 * status 2 待发货
 * status 3 已发货
 * status 4 待评价
 * status 5 交易成功
 * 已删除
 */
var userid = 1;
$.ajax({
    url: 'http://localhost:8080/order/allOrders/' + userid,
    dataType: 'json',
    success: function(data) {
        var orders = data;
        var pay = '';
        var send = '';
        var sended = '';
        var review = '';
        var success = '';
        var close = '';
        var all = '';
        for (var i = 0; i < orders.length; i++) {
            var state = orders[i].ordersState;
            var operation = '';
            var status = '';
            switch (state) {

                case '交易关闭':
                    {
                        status = '<div class="order-status0 status" data-ordersId="' + orders[i].ordersId + '">';
                        operation = '</div><div class="order-right"><li class="td td-amount"><div class="item-amount">合计：' + orders[i].ordersTotal + '<p>免邮</p></div>' +
                        '</li><div class="move-right"><li class="td td-status"><div class="item-status"><p class="Mystatus">交易关闭</p></div></li><li class="td td-change">' +
                        '<div class="am-btn am-btn-danger anniu delete">删除订单</div></li></div></div></div></div></div>';
                        break;
                    }
                case '待付款':
                    {
                        status = '<div class="order-status1 status" data-ordersId="' + orders[i].ordersId + '">';
                        operation = '</div><div class="order-right"><li class="td td-amount"><div class="item-amount">合计：' + orders[i].ordersTotal + '<p>免邮</p>' +
                        '</div></li><div class="move-right"><li class="td td-status"><div class="item-status"><p class="Mystatus">等待买家付款</p>' +
                        '<p class="order-info"><a href="#" id="cancel">取消订单</a></p></div></li><li class="td td-change"><a href="../home/pay.html?orderId=' + orders[i].ordersId + '"><div class="am-btn am-btn-danger anniu pays">' +
                        '一键支付</div></a></li></div></div></div></div></div>';
                        break;
                    }
                case '待发货':
                    {
                        status = '<div class="order-status2 status" data-ordersId="' + orders[i].ordersId + '">';
                        operation = '</div><div class="order-right"><li class="td td-amount"><div class="item-amount">合计：' + orders[i].ordersTotal + '<p>免邮</p></div></li><div class="move-right"><li class="td td-status">' +
                        '<div class="item-status"><p class="Mystatus">买家已付款</p><p class="order-info"><a href="orderinfo.html">订单详情</a></p></div></li><li class="td td-change"><div class="am-btn am-btn-danger anniu alerts">' +
                        '提醒发货</div></li></div></div></div></div></div>';
                        break;
                    }

                case '已发货':
                    {
                        status = '<div class="order-status3 status" data-ordersId="' + orders[i].ordersId + '">';
                        operation = '</div><div class="order-right"><li class="td td-amount"><div class="item-amount">合计：' + orders[i].ordersTotal + '<p>免邮</p></div></li><div class="move-right"><li class="td td-status">' +
                        '<div class="item-status"><p class="Mystatus">买家已发货</p><p class="order-info"><a href="orderinfo.html">订单详情</a></p>' +
                        '<p class="order-info"><a href="logistics.html">查看物流</a></p><p class="order-info"><a href="#">延长收货</a></p>' +
                        '</div></li><li class="td td-change"><div class="am-btn am-btn-danger anniu confirm">' +
                        '确认收货</div></li></div></div></div></div></div>';
                    }
                    break;
                case '待评价':
                    {
                        status = '<div class="order-status4 status" data-ordersId="' + orders[i].ordersId + '">';
                        operation = '</div><div class="order-right"><li class="td td-amount"><div class="item-amount">合计：' + orders[i].ordersTotal + '<p>免邮</p></div></li><div class="move-right"><li class="td td-status">' +
                        '<div class="item-status"><p class="Mystatus">交易成功</p><p class="order-info"><a href="orderinfo.html">订单详情</a></p>' +
                        '<p class="order-info"><a href="logistics.html">查看物流</a></p>' +
                        '</div></li><li class="td td-change"><div class="am-btn am-btn-danger anniu review">' +
                        '评价商品</div></li></div></div></div></div></div>';
                    }
                    break;
                case '交易成功':
                    {
                        status = '<div class="order-status5 status" data-ordersId="' + orders[i].ordersId + '">';
                        operation = '</div><div class="order-right"><li class="td td-amount"><div class="item-amount">合计：' + orders[i].ordersTotal + '<p>免邮</p></div></li><div class="move-right"><li class="td td-status">' +
                        '<div class="item-status"><p class="Mystatus">交易成功</p><p class="order-info"><a href="orderinfo.html">订单详情</a></p>' +
                        '<p class="order-info"><a href="logistics.html">查看物流</a></p>' +
                        '</div></li><li class="td td-change"><div class="am-btn am-btn-danger anniu delete">' +
                        '删除订单</div></li></div></div></div></div></div>';
                    }
                    break;
                default:
                    continue;
            }
            var s1 = '<div class="order-title"><div class="dd-num">订单编号：<a href="javascript:;">' + orders[i].ordersNumber + '</a></div>' +
                '<span>成交时间：' + orders[i].ordersTime + '</span>' +
                '</div><div class="order-content"><div class="order-left">';
            var s4 = '';
            for (var j = 0; j < orders[i].orderitemList.length; j++) {
                s4 += '<ul class="item-list"><li class="td td-item"><div class="item-pic">' +
                    '<a href="#" class="J_MakePoint"><img src="' + orders[i].orderitemList[j].good.pictureLocation.goodDetailsIgm + '" class="itempic J_ItemImg"></a></div>' +
                    '<div class="item-info"><div class="item-basic-info"><a href="#">' +
                    '<p>' + orders[i].orderitemList[j].good.goodName + '</p><p class="info-little">';
                var s2 = '';
                for (var k = 0; k < orders[i].orderitemList[j].sizes.length; k++) {
                    s2 += orders[i].orderitemList[j].sizes[k].property.propName + '：' + orders[i].orderitemList[j].sizes[k].value.valContent + '<br/>';
                }
                var s3 = '</p></a></div></div></li>' +
                    '<li class="td td-price"><div class="item-price">' + orders[i].orderitemList[j].good.goodCurrentPrice + '</div></li>' +
                    '<li class="td td-number"><div class="item-number"><span>×</span>' + orders[i].orderitemList[j].orderitemNumber + '</div></li>' +
                    '<li class="td td-operation"><div class="item-operation"></div></li></ul>';
                s4 += (s2 + s3);
            }
            // var s5 = '</div><div class="order-right"><li class="td td-amount">' +
            //     '<div class="item-amount">合计：' + orders[i].ordersTotal + '<p>免邮</div>' +
            //     '</li><div class="move-right"><li class="td td-status"><div class="item-status"><p class="Mystatus">等待买家付款</p><p class="order-info"><a href="#">取消订单</a></p></div></li>' +
            //     '<li class="td td-change"><a href="pay.html"><div class="am-btn am-btn-danger anniu">一键支付</div></a></li></div></div></div></div></div>';
            all += (status + s1 + s4 + operation);
            switch (state) {
                case '交易关闭':
                    close += (status + s1 + s4 + operation);
                    break;
                case '待付款':
                    pay += (status + s1 + s4 + operation);
                    break;
                case '待发货':
                    send += (status + s1 + s4 + operation);
                    break;
                case '已发货':
                    sended += (status + s1 + s4 + operation);
                    break;
                case '待评价':
                    review += (status + s1 + s4 + operation);
                    break;
                case '交易成功':
                    success += (status + s1 + s4 + operation);
                    break;
            }
        }
        $("#tab1").find(".order-list").replaceWith(all);
        $("#tab2").find(".order-list").replaceWith(pay);
        $("#tab3").find(".order-list").replaceWith(send);
        $("#tab4").find(".order-list").replaceWith(sended);
        $("#tab5").find(".order-list").replaceWith(review);

    }
});
$(document).on("click", "#cancel", function() {
    $.ajax({
        url: 'http://localhost:8080/order/changeState/' + $(this).parents(".status").attr("data-ordersId") + "/交易关闭",
        success: function(data) {
            alert(data);
            window.location.reload();
        }
    });
});
$(document).on("click", ".delete", function() {
    $.ajax({
        url: 'http://localhost:8080/order/changeState/' + $(this).parents(".status").attr("data-ordersId") + "/已删除",
        success: function(data) {
            alert(data);
            window.location.reload();
        }
    });
});
$(document).on("click", ".confirm", function() {
    $.ajax({
        url: 'http://localhost:8080/order/changeState/' + $(this).parents(".status").attr("data-ordersId") + "/待评价",
        success: function(data) {
            alert(data);
            window.location.reload();
        }
    });
});
$(document).ready(function() {
    var str = window.location.search;
    str = str.substr(0);
    str = str.split("=")[1];
    alert(str);
    $.ajax({
        url: 'http://localhost:8080/order/displayTmp',
        type: 'post',
        data: 'orderId=' + str,
        dataType: 'json',
        success: function(msg) {

        }
    });
});
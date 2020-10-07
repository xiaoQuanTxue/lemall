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
$(document).on("click", "#save", function() {

    $.ajax({
        url: 'http://localhost:8080/user/modifyInformation/',
        data: {
            userId: 1,
            userNick: $("#user-name2").val(),
            userName: $("#user-name1").val(),
            userBirth: new Date(parseInt($("#year").val()), parseInt($("#month").val()), parseInt($("day").val())),
            userPhone: $("user-phone").val(),
            userMail: $("#user-email").val(),

        },
        success: function(data) {
            alert(data);
            window.location.reload();
        }

    });
});
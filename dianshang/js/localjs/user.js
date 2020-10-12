//  判断登录状态   根据登录状态添加"登录注册"或用户名
function appendUsername() {

    // var id = sessionStorage.getItem("userid");
    // alert(id);
    var id = 1;
    if (id == 1) {

        $.ajax({
                url: "http://localhost:8080/user/icon/1",
                // data: "id=" + $.cookie('userid'),
                // data: getUserId(),
                // type: "post",
                dataType: "json",
                success: function(user) {
                    // alert("后台返回用户名为" + username);
                    // getUserIcon();
                    var li = '<a >' + '你好， ' + '</a>' + '<a >' + user.userName + '</a>';
                    $("#uusername").replaceWith(li);
                }
            }),

            function getUserId() {

                var id = "uid=" + sessionStorage.getItem("userid");
                // sessionStorage.removeItem("value");
                console.log(id);
                return id;
            }

    } else {

        var li = '<a href="login.html" >' + '登录 ' + '</a>' + '<a href="register.html" >' + '注册 ' + '</a>';

        $("div[id='uusername']").replaceWith(li);

    }


}
/*用window.onload调用myfun() 加载页面的时候自动执行*/
window.onload = appendUsername; //不要括号
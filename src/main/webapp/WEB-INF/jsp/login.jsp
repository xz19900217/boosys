<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="margin:0px auto; width:500px;">
<h3 style="text-align:center; margin-top:50px">用户登录</h3>
<div style="width:500px;">
    <form action="${pageContext.request.contextPath}/login" method="post">
        <table width="500" border="1" cellspacing="0" cellpadding="0">
            <tr>
                <td>用户名</td>
                <td>
                    <input type="text" name="username" id="username"/>
                </td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" name="password" id="password" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center" valign="middle"><input type="submit" name="btnLogin" id="btnLogin" value="登录" />&nbsp;&nbsp;
                    <input type="button" name="btnReg" id="btnReg" value="注册用户" onclick="location.href='/register'"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
<script src="/js/jquery-1.8.0.min.js"></script>
<script>
    $(function () {
        $("#username").blur(function () {
            $.getJSON(
                "/exists",
                {"username":$("#username").val()},
                function (data) {
                    if(data.msg=="FAIL"){
                        $("#susername").html("用户名已经存在");
                    }else if(data.msg=="SUCCESS"){
                        $("#susername").html("可以注册");
                    }
                }
            );
        });
    });
</script>
</html>

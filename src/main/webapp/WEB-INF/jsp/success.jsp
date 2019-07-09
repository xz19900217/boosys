<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${sessionScope.reg_user==null}">
    注册失败
</c:if>
<c:if test="${sessionScope.reg_user!=null}">
    注册成功
</c:if>

</body>
</html>

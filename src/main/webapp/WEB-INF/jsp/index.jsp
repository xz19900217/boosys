<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body >
<div style="width:980px; margin:0px auto; text-align:center">
<div style="width:900px; text-align:center">
    <h2>图书借阅系统</h2>

</div>
<div style="width:880px; text-align:right; padding-right:20px; line-height:25px; height:25px;"></div>
<div style="width:900px; ">
    <form id="searchForm" action="${pageContext.request.contextPath}/index" method="post" >
        <p>图书类型：

            <select name="booktype" id="booktype">
                <option value="-1">-请选择图书类型-</option>
                <option value="0">科技</option>
                <option value="1">艺术</option>
                <option value="2">文学</option>


            </select>


            &nbsp;&nbsp;&nbsp; 图书名称：

            <input name="bookauthor" type="text" id="bookauthor" size="20" value="${bookinfoParam.bookname}"/>


            &nbsp;&nbsp;&nbsp;是否借阅：
            <select name="typeid2" id="typeid2">

                <option value="-1"    >-请选择-</option>
                <option value="1"   >借出</option>
                <option value="0"   >未借</option>
            </select>&nbsp;&nbsp;&nbsp;&nbsp;


            <input type="submit" name="btnSearch" id="btnSearch" value="查询图书" />
            <input type="hidden" name="pageIndex" id="pageIndex" value="1"/>
        </p>
        <div style="text-align:right"> <p><span style="text-align: right"></span>当前用户：wanghua<a href="#">退出</a></p></div>

    </form>
</div>
<div style="width:900px; text-align:center">

</div>
<table width="900" border="1" cellspacing="0px" cellpadding="0px" >
    <tr>
        <td width="112" style="text-align: center">图书编号</td>
        <td width="79" style="text-align: center">图书分类</td>
        <td width="191" style="text-align: center">图书名称</td>
        <td width="118" style="text-align: center">作者</td>
        <td width="242" style="text-align: center">出版社</td>
        <td width="144" style="text-align: center">操作</td>
    </tr>

    <c:if test="${requestScope.info.list!=null}">
        <c:forEach items="${requestScope.info.list}" var="bookinfo">
            <tr>
                <td style="text-align: center">${bookinfo.bookcode}</td>
                <td style="text-align: center">${bookinfo.booktype}</td>
                <td style="text-align: center">${bookinfo.bookname}</td>
                <td style="text-align: center">${bookinfo.bookauthor}</td>
                <td style="text-align: center">${bookinfo.publishpress}</td>
                <td style="text-align: center"><a href="#">${bookinfo.isborrow}</a></td>
                <input type="hidden" value="${bookinfo.publishdate}">

            </tr>

        </c:forEach>
    </c:if>

    <tr>
        <td colspan="9" align="center" valign="middle">
            <a href="javascript:do_page(1)">首页</a> &nbsp;
            <a href="javascript:do_page(${requestScope.info.pageNum-1})">上一页</a> &nbsp;

            <c:forEach var="n" items="${requestScope.info.navigatepageNums}">
                <a href="javascript:do_page(${n})">${n}</a>&nbsp;
            </c:forEach>

            <a href="javascript:do_page(${requestScope.info.pageNum+1})">下一页</a> &nbsp;
            <a href="javascript:do_page(${requestScope.info.pages})">尾页</a> &nbsp;
            ${requestScope.info.pageNum}/${requestScope.info.pages}页
            共${requestScope.info.pages}页
            到第
            <input name="textfield" type="text" id="textfield" size="5" />
            页
            <input type="submit" name="button" id="button" value="确定" />

        </td>
    </tr>
</table>
</div>
</body>
<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.0.min.js"></script>
<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
<script type="application/javascript">
    function do_page(pn) {
        $("#pageIndex").val(pn);
        $("#searchForm").submit();
    }
</script>
</html>


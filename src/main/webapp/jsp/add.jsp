<%--
  Created by IntelliJ IDEA.
  User: zhushengzhe
  Date: 2022/6/14
  Time: 下午9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%-- idea识别EL表达式 --%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加图书信息</h1>
<form name="addBook" action="${pageContext.request.contextPath}/book/addbook" method="get">
    图书编号：<input type="text" name="id">
    图书名称：<input type="text" name="book_name">
    图书作者：<input type="text" name="author">
    图书价格：<input type="text" name="price">
    <input type="submit" value="sub">
</form>
</body>
</html>

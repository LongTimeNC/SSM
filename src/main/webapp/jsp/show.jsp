<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhushengzhe
  Date: 2022/6/14
  Time: 下午2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%-- idea识别EL表达式 --%>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>展示book图书信息列表</h1>
        <table border="1">
            <tr>
                <th>图书序号</th>
                <th>图书名称</th>
                <th>图书作者</th>
                <th>图书价格</th>
            </tr>
            <c:forEach items="${bookList}" var="book">
                <tr>
                    <td>${book.id}</td>
                    <td>${book.book_name}</td>
                    <td>${book.author}</td>
                    <td>${book.price}</td>
                </tr>
            </c:forEach>

        </table>
</body>
</html>

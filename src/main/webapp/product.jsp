<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<%@include file="header.jsp" %>
<h1>Product</h1>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
    </tr>
    <c:forEach items="${products}" var="prod">
    <tr>
        <td>${prod.id}</td>
        <td>${prod.name}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
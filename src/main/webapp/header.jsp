<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<c:url value="/main" var="mainPage"/>
<c:url value="/catalog" var="catalogPage"/>
<c:url value="/product" var="productPage"/>
<c:url value="/cart" var="cartPage"/>
<c:url value="/order" var="orderPage"/>
<a href="${mainPage}">Main</a>
<a href="${catalogPage}">Catalog</a>
<a href="${productPage}">Product</a>
<a href="${cartPage}">Cart</a>
<a href="${orderPage}">Order</a>
</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
    <head>
        <title>List of products</title>
    </head>
    <body>
        <h1>Product list:</h1>
        <c:forEach var="product" items="${products}">
            <li>
                id: ${product.id} title: ${product.title} cost: ${product.cost}
            </li>
        </c:forEach>
        <br>
        <c:url var="createUrl" value="/products/create"/>
        <a href="${createUrl}"> CREATE </a>
    </body>
</html>

<%@ page import="java.util.List" %>
<%@ page import="ru.gb.model.Product" %>
<%@ page contentType="text/html; character=utf-8" language="java" %>

<html>
<head>
<title>List of products</title>
</head>
<body>
    <h1>Products</h1>
    <ul>
    <% for(Product value : (List<Product>)request.getAttribute("Products")) { %>
        <li>Id: <%=value.getId()%>;Title: <%=value.getTitle()%>;Cost: <%=value.getCost()%>; </li>
    <% } %>
    </ul>
</body>
</html>

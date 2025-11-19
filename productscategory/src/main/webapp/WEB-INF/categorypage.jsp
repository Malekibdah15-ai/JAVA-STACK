<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<h1 class="mx-auto text-black-500"><c:out value="${category.name}"/> </h1>

<a href="/" class="text-blue-500">Home</a>
<hr>
<h1 class="mx-auto text-black-500">Products</h1>
<c:forEach var="product" items="${allProducts}">
    <p><c:out value="${product.name}" /></p>

</c:forEach>

<div class="max-w-md mx-auto bg-white p-6 rounded-lg shadow-md">
    <form action="/category/${category.id}" method="post" class="space-y-4">

        <div>
            <select name="productId" class="w-full p-2 border rounded">
                <c:forEach var="p" items="${allProducts}">
                    <option value="${p.id}">${p.name}</option>
                </c:forEach>
            </select>
        </div>

        <div>
            <input type="submit" value="Submit"
                   class="w-full bg-blue-600 text-white py-2 px-4 rounded-md hover:bg-blue-700 transition"/>
        </div>
    </form>

</div>

</body>
</html>

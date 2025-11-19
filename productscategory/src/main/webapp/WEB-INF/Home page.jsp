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
    <meta charset="UTF-8">
    <title>Burger Tracker</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <%--    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>--%>
    <script src="https://cdn.tailwindcss.com"></script>
</head>

<body>
<h1 class="text-3xl font-bold text-center mb-6 text-gray-800">Home page</h1>
<div>
    <a href="/products/new" class="text-blue-500">New Product</a>
    <br>
    <a href="/category/new" class="text-blue-500">New Category</a>
</div>
<hr>

<div class="container mx-auto px-4">
    <div class="mb-10">
        <table class="w-full table-auto border border-gray-300 bg-white ">
            <thead class="bg-gray-200 text-gray-700">
            <tr>
                <th class="px-4 py-2 text-left">Products</th>
                <th class="px-4 py-2 text-left">category's</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="product" items="${sessionScope.products}">
                <tr class="border-t">
                    <td class="px-4 py-2"><a href="/products/${product.id}" class="text-blue-500"><c:out value="${product.name}"/></a></td>
                </tr>
            </c:forEach>
            <c:forEach var="category" items="${sessionScope.category}">
                <tr class="border-t">
                    <td class="px-4 py-2"><a href="/categories/${category.id}" class="text-blue-500"><c:out value="${category.name}"/></a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div>



</body>
</html>

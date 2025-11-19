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

<h1 class="mx-auto text-black-500"><c:out value="${products.name}"/> </h1>
<a href="/" class="text-blue-500">Home</a>
<hr>
<h1 class="mx-auto text-black-500">category</h1>
<c:forEach var="categoreis" items="${allCategories}">
    <p><c:out value="${categoreis.name}" /></p>

</c:forEach>


<div class="max-w-md mx-auto bg-white p-6 rounded-lg shadow-md">
    <form:form action="/commedites/${products.id}" method="post"  cssClass="space-y-4">

        <div>
            <form:select path="categoryId">
                <c:forEach var="cat" items="${allCategories}">
                    <form:option value="${cat.id}" label="${cat.name}" />
                </c:forEach>
            </form:select>

        </div>
        <div>
            <input type="submit" value="Submit" class="w-full bg-blue-600 text-white py-2 px-4 rounded-md hover:bg-blue-700 transition"/>
        </div>

    </form:form>

</div>


</body>
</html>

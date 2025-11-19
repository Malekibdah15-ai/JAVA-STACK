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
<h2 class="text-xl font-semibold text-gray-800 mb-4">New Category</h2>
<a href="/" class="text-blue-500">Home</a>
<hr>
<div class="max-w-md mx-auto bg-white p-6 rounded-lg shadow-md">
    <form:form action="/category's" method="post" modelAttribute="category" cssClass="space-y-4">

        <div>
            <form:label path="name" cssClass="block text-sm font-medium text-gray-700">Name</form:label>
            <form:errors path="name"/>
            <form:input path="name" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
        </div>

        <div>
            <input type="submit" value="Submit" class="w-full bg-blue-600 text-white py-2 px-4 rounded-md hover:bg-blue-700 transition"/>
        </div>

    </form:form>

</div>
</body>
</html>

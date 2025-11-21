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
<a href="/show/books" class="text-blue-500">back to shavles</a
<div class="max-w-md mx-auto bg-white p-6 rounded-lg shadow-md">
    <form:form action="/edit/book/${book.id}" method="post" modelAttribute="book" cssClass="space-y-4">
        <input type="hidden" name="_method" value="put">

        <div>
            <form:label path="title" cssClass="block text-sm font-medium text-gray-700">Title</form:label>
            <form:errors path="title"/>
            <form:input path="title" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
        </div>

        <div>
            <form:label path="author" cssClass="block text-sm font-medium text-gray-700">Author</form:label>
            <form:errors path="author"/>
            <form:input path="author" cssClass="mt-1 bl  ock w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
        </div>
        <div>
            <form:label path="description" cssClass="block text-sm font-medium text-gray-700">my thoughts</form:label>
            <form:errors path="description"/>
            <form:input path="description" cssClass="mt-1 bl  ock w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
        </div>


        <div>
            <input type="submit" value="Submit" class="w-full bg-blue-600 text-white py-2 px-4 rounded-md hover:bg-blue-700 transition"/>
        </div>

    </form:form>

</div>

</body>
</html>

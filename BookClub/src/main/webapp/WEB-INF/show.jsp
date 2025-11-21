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


<body class="bg-gray-100 min-h-screen py-10">

<h1>Welcome <c:out value="${userid.userName}"/></h1>
<h2>Books from everyone </h2>
<a href="/new/book" class="text-blue-500">add book to my shell</a>
<div class="container mx-auto px-4">
    <div class="mb-10">

        <table class="w-full table-auto border border-gray-300 bg-white shadow-md rounded-lg">
            <thead class="bg-gray-200 text-gray-700">
            <tr>
                <th class="px-4 py-2 text-left">ID</th>
                <th class="px-4 py-2 text-left">Title</th>
                <th class="px-4 py-2 text-left">Author Name</th>
                <th class="px-4 py-2 text-left">Posted By</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${allbooks}">
                <tr class="border-t">
                    <td class="px-4 py-2"><c:out value="${book.id}"/></td>
                    <td class="px-4 py-2"><a href="/display/book/${book.id}" class="text-blue-500"><c:out value="${book.title}"/></a></td>
                    <td class="px-4 py-2"><c:out value="${book.author}"/></td>
                    <td class="px-4 py-2"><c:out value="${book.user.userName}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</body>
</html>

<%--<h1 class="text-3xl font-bold text-center mb-6 text-gray-800">Burger Tracker</h1>--%>

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
<div class="container mx-auto px-4">
<div class="max-w-md mx-auto bg-white p-6 rounded-lg shadow-md">

    <form:form action="/travels/${travel.id}" method="post" modelAttribute="travel" cssClass="space-y-4">
        <h2 class="text-xl font-semibold text-gray-800 mb-4">Add an expence</h2>
        <input type="hidden" name="_method" value="put">
        <div>
            <form:label path="name" cssClass="block text-sm font-medium text-gray-700">Expence Name</form:label>
            <form:errors path="name"/>
            <form:input path="name" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
        </div>

        <div>
            <form:label path="vendor" cssClass="block text-sm font-medium text-gray-700">Vendor</form:label>
            <form:errors path="vendor"/>
            <form:input path="vendor" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
        </div>

        <div>
            <form:label path="amount" cssClass="block text-sm font-medium text-gray-700">Amount</form:label>
            <form:errors path="amount"/>
            <form:input path="amount"  type="number"  cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
        </div>

        <div>
            <form:label path="description" cssClass="block text-sm font-medium text-gray-700">Description</form:label>
            <form:errors path="description"/>
            <form:input path="description" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
        </div>

        <div>
            <input type="submit" value="Submit" class="w-full bg-blue-600 text-white py-2 px-4 rounded-md hover:bg-blue-700 transition"/>
        </div>
    </form:form>
</div>
</div>

</body>
</html>


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
<body >
<div class="container mx-auto">
    <div class="mb-10">
        <h1>Burger Tracker</h1>
        <table class="w-full table-auto border border-gray bg-white">
            <thead class="bg-gray-200">
            <tr>
                <th>Burger Name</th>
                <th>Restaurant Name</th>
                <th>Rating</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="mac" items="${burgers}">
                <tr>
                    <td><c:out value="${mac.name}"/></td>
                    <td><c:out value="${mac.restaurant}"/></td>
                    <td><c:out value="${mac.rating}"/></td>
                </tr>
            </c:forEach>


            </tbody>
        </table>
    </div>

    <div class="w-full max-w-xs">
        <form:form cssStyle="bg-whit " action ="/burgers" method = "post" modelAttribute = "burger" cssClass="row g-3">
            <h1>Add a burger</h1>
            <p class="form-group row">
                <form:label path="name">Burger Name</form:label>
                <form:errors path="name"/>
                <form:input  path="name"/>
            </p>

            <p>
                <form:label path="restaurant">Restaurant Name</form:label>
                <form:errors path="restaurant"/>
                <form:input path="restaurant"/>
            </p>

            <p>
                <form:label path="rating">Rating</form:label>
                <form:errors path="rating"/>
                <form:input path="rating"/>
            </p>

            <p>
                <form:label path="notes">Notes</form:label>
                <form:errors path="notes"/>
                <form:input path="notes"/>

            </p>

            <input type="submit" value="submit"/>
        </form:form>

    </div>

</div>

</body>
</html>
<body class="bg-gray-100 min-h-screen py-10">
<div class="container mx-auto px-4">
    <!-- Burger Tracker Table -->
    <div class="mb-10">
        <h1 class="text-3xl font-bold text-center mb-6 text-gray-800">Burger Tracker</h1>
        <table class="w-full table-auto border border-gray-300 bg-white shadow-md rounded-lg">
            <thead class="bg-gray-200 text-gray-700">
            <tr>
                <th class="px-4 py-2 text-left">Burger Name</th>
                <th class="px-4 py-2 text-left">Restaurant Name</th>
                <th class="px-4 py-2 text-left">Rating</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="mac" items="${burgers}">
                <tr class="border-t">
                    <td class="px-4 py-2"><c:out value="${mac.name}"/></td>
                    <td class="px-4 py-2"><c:out value="${mac.restaurant}"/></td>
                    <td class="px-4 py-2"><c:out value="${mac.rating}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Add a Burger Form -->
    <div class="max-w-md mx-auto bg-white p-6 rounded-lg shadow-md">
        <form:form action="/burgers" method="post" modelAttribute="burger" cssClass="space-y-4">
            <h2 class="text-xl font-semibold text-gray-800 mb-4">Add a Burger</h2>

            <div>
                <form:label path="name" cssClass="block text-sm font-medium text-gray-700">Burger Name</form:label>
                <form:input path="name" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
            </div>

            <div>
                <form:label path="restaurant" cssClass="block text-sm font-medium text-gray-700">Restaurant Name</form:label>
                <form:input path="restaurant" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
            </div>

            <div>
                <form:label path="rating" cssClass="block text-sm font-medium text-gray-700">Rating</form:label>
                <form:input path="rating" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
            </div>

            <div>
                <form:label path="notes" cssClass="block text-sm font-medium text-gray-700">Notes</form:label>
                <form:input path="notes" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
            </div>

            <div>
                <input type="submit" value="Submit" class="w-full bg-blue-600 text-white py-2 px-4 rounded-md hover:bg-blue-700 transition"/>
            </div>
        </form:form>
    </div>
</div>

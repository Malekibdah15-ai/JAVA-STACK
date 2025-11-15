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
<div class="container mx-auto px-4">
    <div class="mb-10">
        <h1 class="text-3xl font-bold text-center mb-6 text-gray-800">save travels</h1>
        <table class="w-full table-auto border border-gray-300 bg-white shadow-md rounded-lg">
            <thead class="bg-gray-200 text-gray-700">
            <tr>
                <th class="px-4 py-2 text-left">expense</th>
                <th class="px-4 py-2 text-left">vendor</th>
                <th class="px-4 py-2 text-left">Amount</th>
                <th class="px-4 py-2 text-left">Action</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach var="airport" items="${travels}">
                <tr class="border-t">
                    <td class="px-4 py-2"><a href="expenses/${airport.id}">${airport.name}</a></td>
                    <td class="px-4 py-2">${airport.vendor}</td>
                    <td class="px-4 py-2">${airport.amount}</td>
                    <td class="px-4 py-2"><a href="/expenses/edit/${airport.id}">edit</a>

                        <form action="/travels/delete/${airport.id}" method="post">
                            <input type="hidden" name="_method" value="delete" />
                            <button class="text-red-500 hover:underline">delete</button>
                        </form>



                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>


    <div class="max-w-md mx-auto bg-white p-6 rounded-lg shadow-md">

        <form:form action="/travels" method="post" modelAttribute="travel" cssClass="space-y-4">
            <h2 class="text-xl font-semibold text-gray-800 mb-4">Add an expence</h2>
            <input type="hidden" name="_method" value="delete">
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











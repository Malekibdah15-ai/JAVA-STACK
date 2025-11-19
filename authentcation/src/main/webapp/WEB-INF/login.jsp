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
<%--class="bg-gray-100 min-h-screen py-10"--%>
<%--<div class="container mx-auto px-4">--%>
    <div class="max-w-md mx-auto bg-white p-6 rounded-lg shadow-md">

        <form:form action="/register" method="post" modelAttribute="newUser" cssClass="space-y-4">
            <h2 class="text-xl font-semibold text-gray-800 mb-4">User Registration</h2>
            <div>
                <form:label path="userName" cssClass="block text-sm font-medium text-gray-700">User Name</form:label>
                <form:errors path="userName"/>
                <form:input path="userName" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
            </div>

            <div>
                <form:label path="email" cssClass="block text-sm font-medium text-gray-700">Email</form:label>
                <form:errors path="email"/>
                <form:input path="email" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
            </div>

            <div>
                <form:label path="password" cssClass="block text-sm font-medium text-gray-700">password</form:label>
                <form:errors path="password"/>
                <form:input path="password"  type="Password"  cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
            </div>

            <div>
                <form:label path="confirm" cssClass="block text-sm font-medium text-gray-700">confirm</form:label>
                <form:errors path="confirm"/>
                <form:input path="confirm"  type = "Password" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
            </div>

            <div>
                <input type="submit" value="Submit" class="w-full bg-blue-600 text-white py-2 px-4 rounded-md hover:bg-blue-700 transition"/>
            </div>
        </form:form>
    </div>

    <div class="max-w-md mx-auto bg-white p-6 rounded-lg shadow-md">

        <form:form action="/login" method="post" modelAttribute="newLogin" cssClass="space-y-4">
            <h3 class="text-xl font-semibold text-gray-800 mb-4">login page</h3>
            <div>
                <form:label path="email" cssClass="block text-sm font-medium text-gray-700">Email</form:label>
                <form:errors path="email"/>
                <form:input path="email" cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
            </div>

            <div>
                <form:label path="password" cssClass="block text-sm font-medium text-gray-700">password</form:label>
                <form:errors path="password"/>
                <form:input path="password"  type = "Password"   cssClass="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring focus:border-blue-300"/>
            </div>
            <div>
                <input type="submit" value="Submit" class="w-full bg-blue-600 text-white py-2 px-4 rounded-md hover:bg-blue-700 transition"/>
            </div>
        </form:form>

    </div>

</body>
</html>

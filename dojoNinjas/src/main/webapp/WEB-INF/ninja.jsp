<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Ninja</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="min-h-screen bg-gray-100 flex flex-col items-center justify-center">

<div class="bg-white shadow-lg rounded-2xl p-8 w-full max-w-md">
    <h2 class="text-3xl font-semibold text-gray-800 text-center mb-6">New Ninja</h2>

    <form:form action="/ninjas" method="post" modelAttribute="ninja" class="space-y-5">

        <div>
            <form:label path="dojo" cssClass="block text-gray-700 font-medium mb-1">Dojo</form:label>
            <form:select path="dojo" items="${dojos}" itemValue="id" itemLabel="name"
                         cssClass="w-full border border-gray-300 rounded-lg p-2 focus:ring-2 focus:ring-indigo-400 focus:outline-none"/>
        </div>

        <div>
            <form:label path="firstName" cssClass="block text-gray-700 font-medium mb-1">First Name</form:label>
            <form:input path="firstName" cssClass="w-full border border-gray-300 rounded-lg p-2 focus:ring-2 focus:ring-indigo-400 focus:outline-none"/>
            <form:errors path="firstName" cssClass="text-red-500 text-sm"/>
        </div>

        <div>
            <form:label path="lastName" cssClass="block text-gray-700 font-medium mb-1">Last Name</form:label>
            <form:input path="lastName" cssClass="w-full border border-gray-300 rounded-lg p-2 focus:ring-2 focus:ring-indigo-400 focus:outline-none"/>
            <form:errors path="lastName" cssClass="text-red-500 text-sm"/>
        </div>

        <div>
            <form:label path="age" cssClass="block text-gray-700 font-medium mb-1">Age</form:label>
            <form:input path="age" cssClass="w-full border border-gray-300 rounded-lg p-2 focus:ring-2 focus:ring-indigo-400 focus:outline-none"/>
            <form:errors path="age" cssClass="text-red-500 text-sm"/>
        </div>

        <div class="flex justify-center">
            <input type="submit" value="Create"
                   class="bg-indigo-600 text-white px-5 py-2 rounded-lg hover:bg-indigo-700 transition">
        </div>
    </form:form>
</div>

</body>
</html>
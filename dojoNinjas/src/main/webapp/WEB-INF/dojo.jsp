<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Dojo</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 flex flex-col items-center justify-center">

<div class="bg-white shadow-lg rounded-2xl p-8 w-full max-w-md">
    <h1 class="text-3xl font-semibold text-gray-800 text-center mb-6">New Dojo</h1>

    <form:form action="/dojos" method="post" modelAttribute="dojo" class="space-y-5">
        <div>
            <form:label path="name" cssClass="block text-gray-700 font-medium mb-1">Name</form:label>
            <form:input path="name" cssClass="w-full border border-gray-300 rounded-lg p-2"/>
            <form:errors path="name" cssClass="text-red-500 text-sm"/>
        </div>

        <div class="flex justify-center">
            <input type="submit" value="Create"
                   class="bg-indigo-600 text-white px-5 py-2 rounded-lg">
        </div>
    </form:form>
</div>

</body>
</html>

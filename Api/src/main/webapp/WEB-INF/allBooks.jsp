<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="min-h-screen bg-gray-100 flex flex-col items-center py-10">

<div class="rounded-2xl p-8 w-full max-w-3xl">
    <h2 class="text-3xl font-semibold text-gray-800 text-center mb-6"></h2>

    <table class="w-full border-collapse border border-gray-200">
        <thead class="bg-gray-200 text-gray-700">
        <tr>
            <th class="p-3 text-left border border-gray-300">id</th>
            <th class="p-3 text-left border border-gray-300">Title</th>
            <th class="p-3 text-left border border-gray-300">Language</th>
            <th class="p-3 text-left border border-gray-300"># Pages</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <tr class="hover:bg-gray-50">

                <td class="p-3 border border-gray-300">${book.id}</td>
                <td class="p-3 border border-gray-300">${book.title}</td>
                <td class="p-3 border border-gray-300">${book.language}</td>
                <td class="p-3 border border-gray-300">${book.numberOfPages}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>

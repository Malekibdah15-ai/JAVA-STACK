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
<a href="/show/books" class="text-blue-500">back to shavles</a>

<h1><c:out value="${book.title}"/></h1>
<div class="flex items-center m-px p-px">
    <p class="m-px p-px text-red-500"><c:out value="${book.user.userName}"/> read </p>
    <p class="m-px p-px text-blue-500" ><c:out value="${book.title}"/> By </p>
    <p class="m-px p-px text-green-500" ><c:out value="${book.author}"/></p>
</div>
<p>here are  <c:out value="${book.user.userName}"/> </p>
<hr>
<p><c:out value="${book.description}"/></p>
<a href="/book/edit/${book.id}">edit</a>

<form action="/book/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>

</body>
</html>

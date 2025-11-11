
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
</head>
<body>

<h1><c:out value="${book.title}"/></h1>

<p><c:out value="${book.description}"/></p>
<p><c:out value="${book.language}"/></p>
<p><c:out value="${book.pages}"/></p>



</body>
</html>

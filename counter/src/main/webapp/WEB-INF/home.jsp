<!DOCTYPE html>
<html lang="en">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<head>
    <title>Title</title>
</head>
<body>
<h1>you have visted http://localhost:8080/ <c:out value="${counter}"/> </h1>
<a href="/">return to the server</a>

</body>
</html>

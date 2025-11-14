<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
</head>
<body>
<form action="/books" method="post">
    <label>Title:</label>
    <input type="text" name='title'>
    <label>Description:</label>
    <input type='text' name='description'>
    <label>Language:</label>
    <input type="text" name='language'>
    <label>Page:</label>
    <input type="text" name='pages'>
    <input type='submit' value='login'>
</form>

</body>
</html>

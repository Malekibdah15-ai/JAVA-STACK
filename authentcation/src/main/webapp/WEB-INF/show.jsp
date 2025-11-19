<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>


<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
</head>
<body>
<h1>Welcome ,<c:out value="${user.userName}"/> </h1>
</body>
</html>

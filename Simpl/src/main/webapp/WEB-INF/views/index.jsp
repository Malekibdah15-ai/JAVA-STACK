<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 
 
<html>
<head><title>Receipt</title></head>
<body>
   
    <p><strong>Customer Name:</strong> <c:out value="${first}"/></p>
    <p><strong>Item Name:</strong> <c:out value="${item}"/></p>
    <p><strong>Price:</strong> $<c:out value="${price}"/></p>
    <p><strong>Description:</strong> <c:out value="${desc}"/></p>
    <p><strong>Vendor:</strong> <c:out value="${vendor}"/></p>
</body>
</html>
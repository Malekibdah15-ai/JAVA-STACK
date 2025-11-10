<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
</head>
<body>
<p>"${hourDate}"</p>
<script>
    function showTime(){
        alert("this is the time template");
    }
    showTime();
</script>
</body>
</html>

<%--<%@ taglib prefix="c" uri=""%>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>



    <div class="container">
    <h1>Fruits store</h1>

    <table class="table">
    <tbody>
    <tr class="table-primary">
    <th>Name</th>
    <th>price</th>
    </tr>
<jsp:useBean id="fruitStore" scope="request" type="java.util.List"/>
<c:forEach var="{fruit}" items="${fruitStore}">
    <tr class="table-secondary">
    <td><jsp:useBean id="fruit" scope="request" type="javax.xml.stream.util.StreamReaderDelegate"/>
    <c:out value="${fruit.name}"/></td>
    <td><c:out value="${fruit.name}"/></td>
    </tr>
</c:forEach>
    <c:forEach var="{fruit}" items="${fruitStore}">
        <tr class="table-success">
            <td><c:out value="${fruit.name}"/></td>
            <td><c:out value="${fruit.name}"/></td>
        </tr>
    </c:forEach>
    <c:forEach var="{fruit}" items="${fruitStore}">
        <tr class="table-danger">
            <td><c:out value="${fruit.name}"/></td>
            <td><c:out value="${fruit.name}"/></td>
        </tr>
    </c:forEach>
    <c:forEach var="{fruit}" items="${fruitStore}">
        <tr class="table-warning">
            <td><c:out value="${fruit.name}"/></td>
            <td><c:out value="${fruit.name}"/></td>
        </tr>
    </c:forEach>
    </tbody>

    </table>
    </div>

</body>
</html>

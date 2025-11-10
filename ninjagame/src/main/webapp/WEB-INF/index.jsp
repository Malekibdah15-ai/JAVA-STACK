<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container py-5">

<h1 class="text-center mb-4"> Ninja Gold Game</h1>

<!-- Gold Display -->
<div class="text-center mb-4">
    <label class="gold-box">Your Gold: <span class="text-warning">${gold}</span></label>
</div>

<!-- Game Sections -->
<div class="row text-center game-section g-4">

    <!-- Farm -->
    <div class="col-md-3">
        <div class="game-card">
            <h2>Farm</h2>
            <p>(Earns 10–20 gold)</p>
            <form action="/gold" method="POST">
                <input type="submit" class="btn btn-success w-100" value="Find Gold" name="farm">
            </form>
        </div>
    </div>

    <!-- Cave -->
    <div class="col-md-3">
        <div class="game-card">
            <h2> Cave</h2>
            <p>(Earns 5–10 gold)</p>
            <form action="/gold" method="POST">
                <input type="submit" class="btn btn-primary w-100" value="Find Gold" name="cave">
            </form>
        </div>
    </div>

    <!-- House -->
    <div class="col-md-3">
        <div class="game-card">
            <h2>House</h2>
            <p>(Earns 2–5 gold)</p>
            <form action="/gold" method="POST">
                <input type="submit" class="btn btn-warning w-100" value="Find Gold" name="House">
            </form>
        </div>
    </div>

    <!-- Quest -->
    <div class="col-md-3">
        <div class="game-card">
            <h2> Quest</h2>
            <p>(Earns/Takes 0–50 gold)</p>
            <form action="/gold" method="POST">
                <input type="submit" class="btn btn-danger w-100" value="Find Gold" name="Quest">
            </form>
        </div>
    </div>
</div>

<!-- Activities Section -->
<div class="mt-5">
    <h3>Activities:</h3>
    <div class="activity-box">
        <c:forEach var="activity" items="${list}">
            <div><c:out value="${activity}" /></div>
        </c:forEach>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
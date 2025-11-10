<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Send an Omikuji</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-lg mx-auto" style="max-width: 500px;">
        <div class="card-body">
            <h3 class="text-center mb-4">Send an Omikuji!</h3>
            <form action="/login" method="post">

                <div class="mb-3">
                    <label class="form-label">Pick any number from 5 to 25</label>
                    <select name="select" class="form-select">
                        <c:forEach begin="5" end="25" varStatus="loop">
                            <option value="${loop.index}">${loop.index}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="mb-3">
                    <label class="form-label">Enter the name of any city</label>
                    <input type="text" name="city" class="form-control" placeholder="e.g., Nairobi">
                </div>

                <div class="mb-3">
                    <label class="form-label">Enter the name of any real person</label>
                    <input type="text" name="person" class="form-control" placeholder="e.g., Bob Dylan">
                </div>

                <div class="mb-3">
                    <label class="form-label">Enter professional endeavor or hobby</label>
                    <input type="text" name="endeavor" class="form-control" placeholder="e.g., selling origamis">
                </div>

                <div class="mb-3">
                    <label class="form-label">Enter any type of living thing</label>
                    <input type="text" name="living" class="form-control" placeholder="e.g., ferret">
                </div>

                <div class="mb-3">
                    <label class="form-label">Say something nice to someone</label>
                    <textarea name="text" class="form-control" rows="3" placeholder="e.g., You make others happy."></textarea>
                </div>

                <div class="d-grid">
                    <input type="submit" value="Send" class="btn btn-primary btn-lg">
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>

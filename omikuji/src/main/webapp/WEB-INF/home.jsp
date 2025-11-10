<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Your Omikuji Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-lg mx-auto" style="max-width: 600px;">
        <div class="card-body text-center">
            <h3 class="mb-4">Here's Your Omikuji!</h3>

            <div class="p-4 bg-primary text-white rounded">
                <p>In ${select} years, you will live in <strong>${city}</strong> with <strong>${person}</strong> as your roommate,</p>
                <p>doing <strong>${endeavor}</strong> for a living.</p>
                <p>The next time you see a <strong>${living}</strong>, you will have good luck.</p>
                <p><em>${text}</em></p>
            </div>

            <a href="/omikuji" class="btn btn-outline-primary mt-4">Go Back</a>
        </div>
    </div>
</div>
</body>
</html>

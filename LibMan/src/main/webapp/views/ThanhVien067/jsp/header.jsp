<%@ page import="com.libmanfinal.DAO.ThanhVien067DAO" %>
<%@ page import="com.libmanfinal.Model.ThanhVien067" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String tenThanhVien = (String) session.getAttribute("tenThanhVien"); %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%--    <link rel="stylesheet" href="../css/header.css">--%>
    <style><%@include file="../css/header.css" %></style>
</head>
<body>
<div class="header_container">
    <div class="header_box1">
        <p id="hello">Xin chào</p>
    </div>
    <div class="header_box2">
        <p id="name">${tenThanhVien}!</p>
    </div>
    <div class="header_box3" id="logout-link">
        <p><a href="/logout">Đăng xuất?</a></p>
    </div>
</div>
<script>
    document.getElementById("logout-link").addEventListener("click", function(event) {
        event.preventDefault();
        var confirmLogout = confirm("Bạn có chắc chắn muốn đăng xuất?");
        if (confirmLogout) {
            window.location.href = event.target.getAttribute("href");
        }
    });
</script>
</body>
</html>

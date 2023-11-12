<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 10/30/2023
  Time: 1:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String taiLieuId = (String) session.getAttribute("taiLieuId"); %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thông báo</title>
    <style><%@include file="../css/GDThongBao067.css"%></style>
</head>

<body>
<div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <div class="content">
        <h1>Nhập thành công cho mã tài liệu <span id="NCC_Name">"${taiLieuId}"</span></h1>
        <div class="main_content">
            <div class="TimTL">
                <button><a href="/TimTLById">Tiếp tục nhập</a></button>
            </div>
            <div class="DKThe">
                <button><a href="/HoaDonNhap">Xuất hóa đơn</a></button>
            </div>
        </div>
    </div>
</div>
</body>

</html>

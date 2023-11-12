<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 10/31/2023
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form nhập nhà cung cấp</title>
    <style>
        <%@include file="../css/GDFormThemMoiNCC067.css" %>
    </style>
</head>
<body>
<div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <div class="content">
        <h1>Thêm mới nhà cung cấp</h1>
        <form action="/AddNCC" method="post" class="main_content">
            <h2>Nhập chính xác các thông tin</h2>
            <div class="in_Name">
                <label>Tên đầy đủ:</label>
                <input type="text" name="ten_NCC" placeholder="Nhập tên nhà cung cấp" autocomplete="off">
            </div>
            <div class="in_Address">
                <label>Địa chỉ:</label>
                <input type="text" name="diaChi_NCC" placeholder="Nhập địa chỉ" autocomplete="off">
            </div>
            <div class="in_SDT">
                <label>Số điện thoại:</label>
                <input type="number" name="SDT_NCC" placeholder="Nhập số điện thoại" autocomplete="off">
            </div>
            <div class="in_Email">
                <label>Email:</label>
                <input type="email" name="Email_NCC" placeholder="Nhập email" autocomplete="off">
            </div>
            <div class="btn_Confirm">
                <button id="show_message" type="submit">Xác nhận</button>
            </div>
            <%-- Thêm một div để hiển thị thông báo và nút OK --%>
            <div id="message" style="display: none;">
                <p id="messageText"></p>
                <button onclick="redirectToNextPage()">OK</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>

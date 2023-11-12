<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 10/31/2023
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form thêm mới tài liệu</title>
    <style>
        <%@include file="../css/GDFormThemMoiTaiLieu067.css" %>
    </style>
</head>
<body>
<div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <div class="content">
        <h1>Thêm mới tài liệu</h1>
        <form action="/AddTaiLieu" method="post" class="main_content">
            <h2>Nhập chính xác các thông tin</h2>
            <div class="in_Id">
                <label>ID:</label>
                <input type="text" name="taiLieuId" placeholder="Nhập ID tài liệu" autocomplete="off">
            </div>
            <div class="in_Name">
                <label>Tên tài liệu:</label>
                <input type="text" name="ten_TaiLieu" placeholder="Nhập tên tài liệu" autocomplete="off">
            </div>
            <div class="in_Author">
                <label>Tác giả:</label>
                <input type="text" name="ten_TacGia" placeholder="Nhập tên tác giả" autocomplete="off">
            </div>
            <div class="in_namXuatBan">
                <label>Năm xuất bản:</label>
                <input type="number" name="namXuatBan" placeholder="Nhập năm xuất bản" autocomplete="off">
            </div>
            <div class="in_TheLoai">
                <label>Thể loại:</label>
                <input type="text" name="theLoai" placeholder="Nhập thể loại của tài liệu" autocomplete="off">
            </div>
            <div class="in_ngonNgu">
                <label>Ngôn ngữ:</label>
                <input type="text" name="ngonNgu" placeholder="Nhập ngôn ngữ của tài liệu" autocomplete="off">
            </div>
            <div class="btn_Confirm">
                <button type="submit">Xác nhận</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>

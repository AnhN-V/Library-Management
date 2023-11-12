<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 10/30/2023
  Time: 2:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String taiLieuId = (String) session.getAttribute("taiLieuId"); %>
<% String tenNCC = (String) session.getAttribute("tenNCC"); %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Nhap TL</title>
    <style><%@include file="../css/GDFormNhapTL067.css"%></style>
</head>
<body>
<div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <div class="content">
        <h1>Đang tiến hành nhập tài liệu từ <span id="NCC_Name">"${tenNCC}"</span></h1>
        <form action="/ThemSoLuongTL" method="post" class="main_content">
            <h2 id="h2_NhapTL">Nhập chính xác các thông tin</h2>
            <div class="in_TLID">
                <label >Tài liệu ID</label>
                <input type="text" name="taiLieuId" id="taiLieuIdInput" placeholder="${taiLieuId}">
            </div>
            <div class="in_SLNhap">
                <label >Số lượng nhập:</label>
                <input type="number" name="soLuongNhap"  placeholder="Nhập số lượng tài liệu" autocomplete="off">
            </div>
            <div class="in_DonGia">
                <label >Đơn giá:</label>
                <input type="number" name="donGia"  placeholder="Nhập đơn giá của tài liệu" autocomplete="off">
            </div>
            <div class="btn_Confirm">
                <button type="submit">Xác nhận</button>
            </div>
        </form>
    </div>
</div>
</body>

</html>

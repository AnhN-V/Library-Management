<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 10/29/2023
  Time: 10:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String tenNCC = (String) session.getAttribute("tenNCC"); %>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tìm kiếm mã tài liệu</title>
    <style><%@include file="../css/GDTimMaTaiLieu067.css"%></style>
</head>

<body>
<div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <div class="content">
        <h1>Đang tiến hành nhập tài liệu từ <span id="name_NCC">"${tenNCC}" </span></h1>
        <form action="/search_TL_By_NVTV" method="post" class="main_content">
            <div class="in_Key">
                <input type="text" name="taiLieuId" id="" placeholder="Nhập mã tài liệu" autocomplete="off">
            </div>
            <div class="btn_Search">
                <button type="submit">Tìm kiếm</button>
            </div>
        </form>
        <div class="add_TaiLieu_ID">
            <p><span>Tài liệu chưa tồn tại? <a href="/FormThemTaiLieu">Thêm mới Tài liệu</a></span></p>
        </div>
    </div>
</div>
</body>

</html>

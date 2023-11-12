<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 10/28/2023
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Giao diện chính NV Thư viện</title>
    <style><%@include file="../css/GDChinhNVThuVien067.css"%></style>
</head>

<body>
<div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <div class="gdChinh">
        <div class="gdChinh_box1">
            <button><a href="">Tạo phiếu mượn</a></button>
        </div>
        <div class="gdChinh_box2">
            <button><a href="">Tạo phiếu trả</a></button>
        </div>
        <div class="gdChinh_box3">
            <button><a href="/GDTimNCC">Nhập tài liệu</a></button>
        </div>
    </div>
</div>
</body>

</html>

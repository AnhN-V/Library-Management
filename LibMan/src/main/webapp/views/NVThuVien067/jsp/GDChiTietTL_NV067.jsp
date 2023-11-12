<%@ page import="com.libmanfinal.Model.TaiLieu067" %><%--
    Created by IntelliJ IDEA.
    User: vieta
    Date: 10/27/2023
    Time: 5:44 PM
    To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% TaiLieu067 tl = (TaiLieu067) request.getAttribute("TL"); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thông tin tài liệu</title>
    <style>
        <%@include file="../css/GDChiTietTL067.css" %>
    </style>
</head>
<body>
<div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <h1>${title}</h1>

    <% if(tl != null) { %>
    <table class="print_table">
        <tr>
            <td class="label">ID:</td>
            <td>${TL.id}</td>
        </tr>
        <tr>
            <td class="label">Tài liệu:</td>
            <td>${TL.tenTaiLieu}</td>
        </tr>
        <tr>
            <td class="label">Tác giả:</td>
            <td>${TL.tacGia}</td>
        </tr>
        <tr>
            <td class="label">Năm xuất bản:</td>
            <td>${TL.namXuatBan}</td>
        </tr>
        <tr>
            <td class="label">Tổng số lượng:</td>
            <td>${TL.tongSoLuong}</td>
        </tr>
        <tr>
            <td class="label">Thể loại:</td>
            <td>${TL.theLoai}</td>
        </tr>
        <tr>
            <td class="label">Ngôn Ngữ:</td>
            <td>${TL.ngonNgu}</td>
        </tr>
    </table>
    <div class="go_home">
        <button>
            <a href="/GDFormNhapTL">Tiếp tục</a>
        </button>
    </div>
    <% } %>
</div>
</body>
</html>

<%@ page import="java.util.List" %>
<%@ page import="com.libmanfinal.Model.TaiLieuDaNhap067" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 10/30/2023
  Time: 11:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% String tenNCC = (String) session.getAttribute("tenNCC"); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hóa đơn nhập</title>
    <style>
        <%@include file="../css/GDHoaDonNhap067.css" %>
    </style>
</head>
<body>
<div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <div class="print_table">
        <h1>Hóa đơn nhập tài liệu</h1>
        <table style="width: 90%; margin-left: 5%;">
            <tr>
                <th>Mã</th>
                <th>Nhà cung cấp</th>
                <th>Ngày nhập</th>
                <th>Tài liệu(ID)</th>
                <th>Số lượng</th>
                <th>Đơn giá</th>
            </tr>
            <tr>
                <td rowspan="${size_DS}">${HoaDonId}</td>
                <td rowspan="${size_DS}" id="name_TL" style="text-align: left; padding-left: 30px;">${tenNCC}</td>
                <td rowspan="${size_DS}">${ngayNhap}</td>
            </tr>
            <c:forEach items="${DSTaiLieuNhap}" var="ds">
                <tr>
                    <td>${ds.getDauTaiLieu067Id()}</td>
                    <td>${ds.getSoLuongNhap()}</td>
                    <td>${ds.getDonGia()}</td>
                </tr>
            </c:forEach>

            <tr>
                <td colspan="6" style="text-align: left; padding-left: 30px;">Tổng số tiền thanh toán: ${tongTienThanhToan} VNĐ</td>
            </tr>
        </table>
        <div class="Signiture">
            <div class="NV_Sign">
                <p style="font-weight: 600; text-align: center; margin-bottom: -10px;">Nhân viên</p>
                <p style="font-size: 15px; ">(Kí và ghi rõ họ tên)</p>
                <p style="margin-top: 60px;">Nguyễn Việt Anh</p>
            </div>
            <div class="NCC_Sign">
                <p style="font-weight: 600; text-align: center; margin-bottom: -10px;">Nhà cung cấp</p>
                <p style="font-size: 15px;">(Kí và ghi rõ họ tên)</p>
            </div>
        </div>
    </div>
    <div class="btn_Home">
        <a href="/NVThuVien">
            <button>Về trang chủ</button>
        </a>
    </div>
</div>
</body>
</html>

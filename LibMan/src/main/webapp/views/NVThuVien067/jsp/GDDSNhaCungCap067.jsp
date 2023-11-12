<%@ page import="com.libmanfinal.Model.NhaCungCap067" %><%--
<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 10/29/2023
  Time: 1:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách nhà cung cấp</title>
    <style>
        <%@include file="../css/GDDSNhaCungCap067.css" %>
    </style>
</head>
<body>
<div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <h1>${title}</h1>
    <c:forEach items="${DSNCC}" var="NCC">
        <div class="print_table">
            <a href="/TimTLById?NCC_ID=${NCC.NCCId}">
                <div class="NCC_ID">
                    <p><span>ID:</span>${NCC.NCCId}</p>
                </div>
                <div class="NCC_Name">
                    <p><span>Tên đầy đủ:</span>${NCC.tenNCC}</p>
                </div>
                <div class="NCC_Phone">
                    <p><span>Số điện thoại:</span>${NCC.soDienThoai}</p>
                </div>
                <div class="NCC_Address">
                    <p><span>Địa chỉ:</span>${NCC.diaChi}</p>
                </div>
                <div class="NCC_Email">
                    <p><span>Email:</span>${NCC.email}</p>
                </div>
            </a>
        </div>
    </c:forEach>
</div>
</body>
</html>

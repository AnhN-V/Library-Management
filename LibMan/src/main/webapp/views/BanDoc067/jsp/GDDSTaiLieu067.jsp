<%@ page import="com.libmanfinal.Model.TaiLieu067" %><%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 10/27/2023
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách tài liệu</title>
    <style>
        <%@include file="../css/GDDSTaiLieu067.css" %>
    </style>
</head>
<body>
<div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <h1>${title}</h1>
    <c:forEach items="${DSTaiLieu}" var="taiLieu">
        <div class="print_table">
            <a href="/TLChiTiet?taiLieu_Id=${taiLieu.id}">
                <div class="name_docu">
                    <p>Tài liệu: ${taiLieu.tenTaiLieu}</p>
                </div>
                <div class="author">
                    <p id="author_name">Tác giả: <span>${taiLieu.tacGia}</span></p>
                    <p id="year">(${taiLieu.namXuatBan})</p>
                </div>
            </a>
        </div>
    </c:forEach>
</div>
</body>
</html>

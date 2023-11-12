<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 10/25/2023
  Time: 6:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Giao diện chính bạn đọc</title>
<%--    <link type="text/css stylesheet" href="%{pageContext.request.contextPath}/css/GDChinhBanDoc067.css">--%>
    <style><%@include file="../css/GDChinhBanDoc067.css" %></style>
</head>
<body>
<div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <div class="gdChinh">
        <div class="TimTL">
            <button><a href="/TimThongTinTL">Tìm kiếm tài liệu</a></button>
        </div>
        <div class="DKThe">
            <button><a href="#">Đăng kí làm thẻ</a></button>
        </div>
    </div>
</div>
</body>
</html>

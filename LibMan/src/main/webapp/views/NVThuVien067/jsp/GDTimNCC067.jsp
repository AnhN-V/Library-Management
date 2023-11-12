<%--
  Created by IntelliJ IDEA.
  User: vieta
  Date: 10/27/2023
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Tìm nhà cung cấp</title>
<%--  <link rel="stylesheet" href="../css/GDTimThongTinTL067.css">--%>
  <style><%@include file="../css/GDTimNCC067.css"%></style>
</head>
<body>
<div class="container">
  <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
  <div class="content">
    <h1>Tìm kiếm Nhà Cung Cấp</h1>
    <form action="/search_NCC" method="post" class="main_content">
      <div class="in_Key">
        <input type="text" name="key_word" id="" placeholder="Nhập tên nhà cung cấp" autocomplete="off">
      </div>
      <div class="btn_Search">
        <button type="submit">Tìm kiếm</button>
      </div>
    </form>
    <div class="add_NCC">
      <p><span>Chưa có Nhà cung cấp? <a href="/FormThemNCC">Thêm mới NCC</a></span></p>
    </div>
  </div>
</div>
</body>
</html>

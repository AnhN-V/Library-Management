  <%--
    Created by IntelliJ IDEA.
    User: vieta
    Date: 10/27/2023
    Time: 5:44 PM
    To change this template use File | Settings | File Templates.
  --%>
  <%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <!DOCTYPE html>
  <html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Xem chi tiết tài liệu</title>
    <style><%@include file="../css/GDChiTietTL067.css"%></style>
  </head>
  <body>
  <div class="container">
    <%@ include file="../../ThanhVien067/jsp/header.jsp" %>
    <h1>Thông tin chi tiết tài liệu</h1>
    <table class="print_table">
      <tr>
        <td class="label">ID:</td>
        <td>${taiLieu067.id}</td>
      </tr>
      <tr>
        <td class="label">Tài liệu:</td>
        <td>${taiLieu067.tenTaiLieu}</td>
      </tr>
      <tr>
        <td class="label">Tác giả:</td>
        <td>${taiLieu067.tacGia}</td>
      </tr>
      <tr>
        <td class="label">Năm xuất bản:</td>
        <td>${taiLieu067.namXuatBan}</td>
      </tr>
      <tr>
        <td class="label">Số lượng sẵn có:</td>
        <td>${dauTaiLieu067.soLuongHienCo}</td>
      </tr>
      <tr>
        <td class="label">Thể loại:</td>
        <td>${taiLieu067.theLoai}</td>
      </tr>
      <tr>
        <td class="label">Ngôn Ngữ:</td>
        <td>${taiLieu067.ngonNgu}</td>
      </tr>
    </table>
    <div class="go_home">
      <button>
        <a href="/BanDoc">Quay lại trang chủ</a>
      </button>
    </div>
  </div>
  </body>
  </html>

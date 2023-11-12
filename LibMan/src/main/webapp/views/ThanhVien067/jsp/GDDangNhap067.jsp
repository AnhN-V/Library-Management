<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<%--    <link rel="stylesheet" href="../css/GDDangNhap067.css">--%>
    <style><%@include file="../css/GDDangNhap067.css" %></style>
    <title>Đăng nhập</title>
</head>
<body>
<div class="container" >
    <h1>Thư viện <span class="red-text">PTIT</span></h1>
    <h2 >Đăng nhập</h2>
    <form action="/login" method="post" class="loginform">
        <div class="box_Username">
            <input type="text" class="form-input" id="in_Username" name="username" placeholder="Username">
        </div>
        <div class="box_Password">
            <input type="password" class="form-input" id="in_Password" name="password" placeholder="Password">
        </div>
        <div class="box_btnSubmit">
            <button type="submit" class="btn_Submit">Đăng nhập</button>
        </div>
    </form>
</div>
</body>

</html>
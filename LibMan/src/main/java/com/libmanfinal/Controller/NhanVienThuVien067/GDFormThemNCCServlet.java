package com.libmanfinal.Controller.NhanVienThuVien067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FormThemNCC")
public class GDFormThemNCCServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/NVThuVien067/jsp/GDFormThemMoiNCC067.jsp").forward(req, resp);
    }
}
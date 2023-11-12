package com.libmanfinal.Controller.NhanVienThuVien067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GDFormNhapTL")
public class GDFormNhapTLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("taiLieuId") == null) {
            resp.sendRedirect(req.getContextPath() + "/TimTLById");
            return;
        }
        req.getRequestDispatcher("/views/NVThuVien067/jsp/GDFormNhapTL067.jsp").forward(req, resp);
    }
}
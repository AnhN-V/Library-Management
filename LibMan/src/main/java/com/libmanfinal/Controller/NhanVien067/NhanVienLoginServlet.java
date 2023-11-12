package com.libmanfinal.Controller.NhanVien067;

import com.libmanfinal.DAO.NhanVien067DAO;
import com.libmanfinal.Model.NhanVien067;
import com.libmanfinal.Model.ThanhVien067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/NhanVien"})
public class NhanVienLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ThanhVien067 TV = (ThanhVien067) req.getSession().getAttribute("TV");
        if (TV == null) {
            resp.sendRedirect(req.getContextPath() + "/login");
            return;
        }

        if (TV.getVaiTro().equalsIgnoreCase("NhanVien")) {
            NhanVien067DAO nhanVien067DAO = new NhanVien067DAO();
            NhanVien067 nhanVien = nhanVien067DAO.getNhanVienById(TV.getId());

            if (nhanVien != null) {
                String vaiTroNhanVien = nhanVien.getVaiTroNhanVien();
                if (vaiTroNhanVien.equalsIgnoreCase("NVThuVien")) {
                    resp.sendRedirect(req.getContextPath() + "/NVThuVien");
                } else {
                    resp.sendRedirect(req.getContextPath() + "/NVQuanLy");
                }
            } else {
                req.getRequestDispatcher("/views/ThanhVien067/jsp/GDDangNhap067.jsp").forward(req, resp);
            }
        } else {
            req.getRequestDispatcher("/views/ThanhVien067/jsp/GDDangNhap067.jsp").forward(req, resp);
        }
    }
}

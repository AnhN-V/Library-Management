package com.libmanfinal.Controller.NhanVienThuVien067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/NVThuVien"})
public class GDChinhNVThuVienServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("TV") == null) {
            resp.sendRedirect(req.getContextPath() + "/login");
            return;
        }
//        HttpSession TL_Id_session = req.getSession(false);
//        if (TL_Id_session != null) {
//            TL_Id_session.invalidate();
//        }
//
//        HttpSession NCC_Ten_session = req.getSession(false);
//        if (NCC_Ten_session != null) {
//            NCC_Ten_session.invalidate();
//        }
//
//        HttpSession NCC_Id_session = req.getSession(false);
//        if (NCC_Id_session != null) {
//            NCC_Id_session.invalidate();
//        }
        req.getRequestDispatcher("/views/NVThuVien067/jsp/GDChinhNVThuVien067.jsp").forward(req,resp);
    }
}

package com.libmanfinal.Controller.NhanVienThuVien067;


import com.libmanfinal.DAO.NhaCungCap067DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/AddNCC"})
public class ThemMoiNCCServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String tenNCC = req.getParameter("ten_NCC");
        String diaChiNCC = req.getParameter("diaChi_NCC");
        String SDTNCC = req.getParameter("SDT_NCC");
        String EmailNCC = req.getParameter("Email_NCC");

//        System.out.println("tên NCC: = " + tenNCC);
//        System.out.println("đia chi: " + diaChiNCC);
//        System.out.println("SDT : " + SDTNCC);
//        System.out.println("email: " + EmailNCC);

        String title = "Thêm thành công nhà cung cấp!";
        if (tenNCC != null && !tenNCC.isEmpty() &&
                diaChiNCC != null && !diaChiNCC.isEmpty() &&
                SDTNCC != null && !SDTNCC.isEmpty() &&
                EmailNCC != null && !EmailNCC.isEmpty()) {

            NhaCungCap067DAO nhaCungCap067DAO = new NhaCungCap067DAO();
            try {
                nhaCungCap067DAO.addNhaCungCap(tenNCC, diaChiNCC, SDTNCC, EmailNCC);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            req.setAttribute("title", title);
            System.out.println(title);
            req.getRequestDispatcher("/views/NVThuVien067/jsp/GDTimNCC067.jsp").forward(req, resp);
        } else {
            title = "Thêm nhà cung cấp thất bại!";
            req.setAttribute("title", title);
            System.out.println(title);
            req.getRequestDispatcher("/views/NVThuVien067/jsp/GDFormThemMoiNCC067.jsp").forward(req, resp);
        }
    }

}

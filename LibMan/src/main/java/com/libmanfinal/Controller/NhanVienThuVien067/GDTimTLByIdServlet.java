package com.libmanfinal.Controller.NhanVienThuVien067;


import com.libmanfinal.DAO.NhaCungCap067DAO;
import com.libmanfinal.Model.NhaCungCap067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/TimTLById")
public class GDTimTLByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String getNCC_ID = req.getParameter("NCC_ID");
        if (getNCC_ID != null) {
            Integer NCC_ID = Integer.valueOf(getNCC_ID);
            NhaCungCap067 nhaCungCap067 = null;
            try {
                nhaCungCap067 = new NhaCungCap067DAO().getNCCById(NCC_ID);

                String tenNCC = nhaCungCap067.getTenNCC();
                HttpSession NCC_Ten_session = req.getSession();
                NCC_Ten_session.setAttribute("tenNCC", tenNCC); //cài session cho tên NCC
                HttpSession NCC_Id_session = req.getSession();
                NCC_Id_session.setAttribute("NCC_ID", NCC_ID); //cài session cho ID NCC
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            req.setAttribute("NCC067", nhaCungCap067);
            req.getRequestDispatcher("/views/NVThuVien067/jsp/GDTimMaTaiLieu067.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/views/NVThuVien067/jsp/GDTimMaTaiLieu067.jsp").forward(req, resp);
        }
    }
}
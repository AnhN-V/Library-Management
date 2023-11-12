package com.libmanfinal.Controller.ThanhVien067;


import com.libmanfinal.DAO.ThanhVien067DAO;
import com.libmanfinal.Model.ThanhVien067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login","/"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/ThanhVien067/jsp/GDDangNhap067.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        ThanhVien067DAO TVDAO = new ThanhVien067DAO();
            ThanhVien067 TV = new ThanhVien067(username, password);
        if(TVDAO.checkLogin(TV)){
            req.getSession().setAttribute("TV",TV);
            if (TV.getVaiTro().equalsIgnoreCase("BanDoc")) {
                resp.sendRedirect(req.getContextPath() + "/BanDoc");
            } else {
                resp.sendRedirect(req.getContextPath() + "/NhanVien");
            }
            ThanhVien067DAO tvDAO = new ThanhVien067DAO();
            String tenThanhVien = null;
            if (username != null) {
                ThanhVien067 tv = tvDAO.selectThanhVienByUsername(username);
                if (tv != null) {
                    tenThanhVien = tv.getTen();
                }
            }
            ThanhVien067 thanhVien067 = tvDAO.selectThanhVienByUsername(username);
            int ThanhVienId = thanhVien067.getId();
            HttpSession thanhVienId_session = req.getSession();
            thanhVienId_session.setAttribute("thanhVienId", ThanhVienId);

            HttpSession name_Session = req.getSession();
            name_Session.setAttribute("tenThanhVien", tenThanhVien);
        }else{
            req.getRequestDispatcher("/views/ThanhVien067/jsp/GDDangNhap067.jsp").forward(req,resp);
        }
    }
}

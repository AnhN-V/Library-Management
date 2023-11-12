package com.libmanfinal.Controller.BanDoc067;

import com.libmanfinal.DAO.DauTaiLieu067DAO;
import com.libmanfinal.DAO.TaiLieu067DAO;
import com.libmanfinal.Model.DauTaiLieu067;
import com.libmanfinal.Model.TaiLieu067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TLChiTiet")
public class GDChiTietTLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String taiLieu_Id = req.getParameter("taiLieu_Id");
        TaiLieu067 taiLieu067 = null;
        DauTaiLieu067 dauTaiLieu067 = null;
        try {
            taiLieu067 = new TaiLieu067DAO().getTaiLieuById(taiLieu_Id);
            DauTaiLieu067DAO dauTaiLieu067DAO = new DauTaiLieu067DAO();
            dauTaiLieu067 = dauTaiLieu067DAO.getDauTaiLieuById(taiLieu_Id);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("taiLieu067", taiLieu067);
        req.setAttribute("dauTaiLieu067", dauTaiLieu067);
        req.getRequestDispatcher("/views/BanDoc067/jsp/GDChiTietTL067.jsp").forward(req, resp);
    }
}
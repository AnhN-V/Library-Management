package com.libmanfinal.Controller.NhanVienThuVien067;


import com.libmanfinal.DAO.TaiLieu067DAO;
import com.libmanfinal.Model.TaiLieu067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/search_TL_By_NVTV")
public class TimKiemTLBy_NVTVServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String taiLieuId = req.getParameter("taiLieuId");
        TaiLieu067 tl = null;
        try {
            tl = new TaiLieu067DAO().getTaiLieuById(taiLieuId);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        HttpSession TL_Id_session = req.getSession();
        TL_Id_session.setAttribute("taiLieuId", taiLieuId); //cài session cho taiLieuId
        req.setAttribute("TL",tl);
        if (tl == null) {
            req.setAttribute("title","Không tồn tại mã tài liệu: "+ taiLieuId);
        } else {
            req.setAttribute("title","Thông tin tài liệu với mã: "+ taiLieuId);
        }
        req.getRequestDispatcher("/views/NVThuVien067/jsp/GDChiTietTL_NV067.jsp").forward(req, resp);
    }

}

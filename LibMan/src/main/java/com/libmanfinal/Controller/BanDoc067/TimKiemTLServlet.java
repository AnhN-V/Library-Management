package com.libmanfinal.Controller.BanDoc067;


import com.libmanfinal.DAO.TaiLieu067DAO;
import com.libmanfinal.Model.TaiLieu067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/search_TL_By_BD")
public class TimKiemTLServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String key_word = req.getParameter("key_word");
        List<TaiLieu067> DSTaiLieu = null;
        try {
            DSTaiLieu = new TaiLieu067DAO().getAllTaiLieuByKeyWord(key_word);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("DSTaiLieu",DSTaiLieu);
        if (DSTaiLieu.isEmpty()) {
            req.setAttribute("title","Không thể tìm thấy tài liệu với từ khóa: "+ key_word);
        } else {
            req.setAttribute("title","Danh sách tài liệu tìm thấy với từ khóa: "+ key_word);
        }
        req.getRequestDispatcher("/views/BanDoc067/jsp/GDDSTaiLieu067.jsp").forward(req, resp);
    }

}

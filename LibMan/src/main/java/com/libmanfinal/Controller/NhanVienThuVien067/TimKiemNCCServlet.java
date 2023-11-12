package com.libmanfinal.Controller.NhanVienThuVien067;

import com.libmanfinal.DAO.NhaCungCap067DAO;
import com.libmanfinal.Model.NhaCungCap067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/search_NCC")
public class TimKiemNCCServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String key_word = req.getParameter("key_word");
        List<NhaCungCap067> DSNCC = null;
        try {
            DSNCC = new NhaCungCap067DAO().getAllNCCByKeyWord(key_word);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("DSNCC", DSNCC);
        if (DSNCC.isEmpty()) {
            req.setAttribute("title","Không thể tìm thấy Nhà cung cấp: "+ key_word);
        } else {
            req.setAttribute("title","Danh sách Nhà cung cấp tìm thấy với tên: "+ key_word);
        }
        req.getRequestDispatcher("/views/NVThuVien067/jsp/GDDSNhaCungCap067.jsp").forward(req, resp);
    }

}

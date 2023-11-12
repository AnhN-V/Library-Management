package com.libmanfinal.Controller.NhanVienThuVien067;


import com.libmanfinal.DAO.DauTaiLieu067DAO;
import com.libmanfinal.DAO.TaiLieu067DAO;
import com.libmanfinal.Model.TaiLieu067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/AddTaiLieu"})
public class ThemMoiTaiLieuServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String taiLieuId = req.getParameter("taiLieuId");
        String tenTaiLieu = req.getParameter("ten_TaiLieu");
        String tenTacGia = req.getParameter("ten_TacGia");
        String namXuatBanParam = req.getParameter("namXuatBan");
        String theLoai = req.getParameter("theLoai");
        String ngonNgu = req.getParameter("ngonNgu");

        System.out.println("Information= " + taiLieuId +" "+ tenTaiLieu +" "+ tenTacGia +" "+ namXuatBanParam +" "+ theLoai +" "+ ngonNgu);

        String title = "Thêm thành công tài liệu!";
        if (taiLieuId != null && !taiLieuId.isEmpty() &&
                tenTaiLieu != null && !tenTaiLieu.isEmpty() &&
                tenTacGia != null && !tenTacGia.isEmpty() &&
                namXuatBanParam != null && !namXuatBanParam.isEmpty() &&
                theLoai != null && !theLoai.isEmpty() &&
                ngonNgu != null && !ngonNgu.isEmpty()) {

            Integer namXuatBan = Integer.valueOf(namXuatBanParam);

            TaiLieu067DAO taiLieu067DAO = new TaiLieu067DAO();
            try {
                taiLieu067DAO.addTaiLieu(taiLieuId, tenTaiLieu, tenTacGia, namXuatBan, theLoai, ngonNgu);
                TaiLieu067 taiLieu067 = taiLieu067DAO.getTLByInfo(tenTaiLieu, tenTacGia, namXuatBan, theLoai, ngonNgu);
                DauTaiLieu067DAO dauTaiLieu067DAO = new DauTaiLieu067DAO();
                dauTaiLieu067DAO.addDauTaiLieu(taiLieu067.getId());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            req.setAttribute("title", title);
            System.out.println(title);
            req.getRequestDispatcher("/views/NVThuVien067/jsp/GDTimMaTaiLieu067.jsp").forward(req, resp);
        } else {
            title = "Thêm tài liệu thất bại!";
            req.setAttribute("title", title);
            System.out.println(title);
            req.getRequestDispatcher("/views/NVThuVien067/jsp/GDFormThemMoiTaiLieu067.jsp").forward(req, resp);
        }
    }

}

package com.libmanfinal.Controller.NhanVienThuVien067;


import com.libmanfinal.Model.TaiLieuDaNhap067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/ThemSoLuongTL"})
public class ThemSoLuongTLServlet extends HttpServlet {
    private List<TaiLieuDaNhap067> dsTLNhap = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String taiLieuId = req.getParameter("taiLieuId");
        String soLuongNhapParam = req.getParameter("soLuongNhap");
        String donGiaParam = req.getParameter("donGia");

//        System.out.println("taiLieuID= " + taiLieuId);
//        System.out.println("soLuongNhap: " + soLuongNhapParam);
//        System.out.println("donGia: " + donGiaParam);

        if (taiLieuId != null && !taiLieuId.isEmpty() &&
                soLuongNhapParam != null && !soLuongNhapParam.isEmpty() &&
                donGiaParam != null && !donGiaParam.isEmpty()) {

            Integer soLuongNhap = Integer.valueOf(soLuongNhapParam);
            Double donGia = Double.valueOf(donGiaParam);

            TaiLieuDaNhap067 taiLieuDaNhap067 = new TaiLieuDaNhap067(taiLieuId, soLuongNhap, donGia);
            dsTLNhap.add(taiLieuDaNhap067);

            for (TaiLieuDaNhap067 tl : dsTLNhap) {
                System.out.println(tl);
            }

            HttpSession dsTL_session = req.getSession();
            dsTL_session.setAttribute("dsTLNhap", dsTLNhap); // thêm danh sách tài liệu vào session

            HttpSession TLId_sesstion = req.getSession();
            TLId_sesstion.setAttribute("taiLieuId", taiLieuId.toUpperCase()); //thêm id tài liệu vào session

            req.getRequestDispatcher("/views/NVThuVien067/jsp/GDThongBao067.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/views/NVThuVien067/jsp/GDFormNhapTL067.jsp").forward(req, resp);
        }
    }
}

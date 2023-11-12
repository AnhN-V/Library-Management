package com.libmanfinal.Controller.NhanVienThuVien067;


import com.libmanfinal.DAO.DauTaiLieu067DAO;
import com.libmanfinal.DAO.HoaDonNhap067DAO;
import com.libmanfinal.DAO.TaiLieu067DAO;
import com.libmanfinal.DAO.TaiLieuDaNhap067DAO;
import com.libmanfinal.Model.DauTaiLieu067;
import com.libmanfinal.Model.HoaDonNhap067;
import com.libmanfinal.Model.TaiLieu067;
import com.libmanfinal.Model.TaiLieuDaNhap067;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/HoaDonNhap")
public class GDHoaDonNhapServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Integer NCCId = (Integer) session.getAttribute("NCC_ID");
        LocalDate ngayNhap = LocalDate.now();
        req.setAttribute("ngayNhap", ngayNhap);

        List<TaiLieuDaNhap067> dsTLNhap = new ArrayList<>();
        dsTLNhap = (List<TaiLieuDaNhap067>) session.getAttribute("dsTLNhap");
        Integer thanhVienId = (Integer) session.getAttribute("thanhVienId");
        TaiLieu067DAO taiLieu067DAO = new TaiLieu067DAO();
        DauTaiLieu067DAO dauTaiLieu067DAO = new DauTaiLieu067DAO();
        double tongTien = 0;
        for (TaiLieuDaNhap067 tl : dsTLNhap) {
            tongTien += (tl.getDonGia() * tl.getSoLuongNhap());
            try {
                TaiLieu067 taiLieu067 = taiLieu067DAO.getTaiLieuById(tl.getDauTaiLieu067Id());
                int tongSoLuong = tl.getSoLuongNhap() + taiLieu067.getTongSoLuong();
                taiLieu067DAO.updateTongSoLuong(tl.getDauTaiLieu067Id(), tongSoLuong);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                DauTaiLieu067 dauTaiLieu067 = dauTaiLieu067DAO.getDauTaiLieuById(tl.getDauTaiLieu067Id());
                int SoLuongHienCo = tl.getSoLuongNhap() + dauTaiLieu067.getSoLuongHienCo();
                dauTaiLieu067DAO.updateSoLuong(tl.getDauTaiLieu067Id(), SoLuongHienCo);
            }catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        req.setAttribute("tongTienThanhToan", tongTien);
        HoaDonNhap067DAO hoaDonNhap067DAO = new HoaDonNhap067DAO();
        hoaDonNhap067DAO.addHoaDonNhap(thanhVienId, NCCId, tongTien);

        HoaDonNhap067 hoaDonNhap067 = hoaDonNhap067DAO.getHoaDonNhapByInfo(thanhVienId, NCCId, tongTien);
        TaiLieuDaNhap067DAO taiLieuDaNhap067DAO= new TaiLieuDaNhap067DAO();
        for (TaiLieuDaNhap067 tl : dsTLNhap) {
            taiLieuDaNhap067DAO.addTaiLieuNhap(hoaDonNhap067.getId(), tl.getDauTaiLieu067Id(), tl.getSoLuongNhap(), tl.getDonGia());
        }

        int size_DS = dsTLNhap.size() + 1;
        req.setAttribute("size_DS", size_DS);
        req.setAttribute("DSTaiLieuNhap", dsTLNhap);
        req.setAttribute("HoaDonId", hoaDonNhap067.getId());
        req.getRequestDispatcher("/views/NVThuVien067/jsp/GDHoaDonNhap067.jsp").forward(req, resp);
    }
}
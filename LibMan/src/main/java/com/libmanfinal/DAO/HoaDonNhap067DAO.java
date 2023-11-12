package com.libmanfinal.DAO;


import com.libmanfinal.Model.HoaDonNhap067;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HoaDonNhap067DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/libmanfinal?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "2010";

    public HoaDonNhap067DAO() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        HoaDonNhap067DAO hoaDonNhap067DAO = new HoaDonNhap067DAO();
//        hoaDonNhap067DAO.addHoaDonNhap(4, 1 , 400000);

//        List<HoaDonNhap067> hoaDonNhap067 = hoaDonNhap067DAO.getHoaDonNhapByNgayVaTLId(1);
//        for (HoaDonNhap067 x : hoaDonNhap067) {
//            System.out.println(x);
//        }
    }

    public void addHoaDonNhap(int NVThuVienId, int NhaCungCapId, double tongTien) {
        String ADD_HOADONNHAP = "INSERT INTO hoadonnhap067 (NhanVienThuVien067_ID, ngayNhap, NhaCungCap_ID, TongTien) VALUES (?, ?, ?, ?);";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ADD_HOADONNHAP);) {
            preparedStatement.setInt(1, NVThuVienId);
            preparedStatement.setDate(2, Date.valueOf(LocalDate.now())); // Sử dụng LocalDate.now() để lấy ngày hiện tại
            preparedStatement.setInt(3, NhaCungCapId);
            preparedStatement.setDouble(4, tongTien);
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
        public HoaDonNhap067 getHoaDonNhapByInfo(int NVThuVienId, int NCCId, double tongTien) {
            HoaDonNhap067 hoaDonNhap067 = null;
        String SELECT_HOADONNHAP_BY_INFO = "SELECT * FROM hoadonnhap067 WHERE NhanVienThuVien067_ID = ? and ngayNhap = ? and NhaCungCap_ID = ? and TongTien = ?;";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_HOADONNHAP_BY_INFO);) {
            preparedStatement.setInt(1, NVThuVienId);
            preparedStatement.setDate(2, Date.valueOf(LocalDate.now())); // Sử dụng LocalDate.now() để lấy ngày hiện tại
            preparedStatement.setInt(3, NCCId);
            preparedStatement.setDouble(4, tongTien);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                hoaDonNhap067 = new HoaDonNhap067(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getDate(3),
                        rs.getInt(4),
                        rs.getDouble(5)
                );
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return hoaDonNhap067;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}

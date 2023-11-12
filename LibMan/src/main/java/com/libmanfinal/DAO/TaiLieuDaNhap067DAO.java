package com.libmanfinal.DAO;


import com.libmanfinal.Model.TaiLieuDaNhap067;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaiLieuDaNhap067DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/libmanfinal?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "2010";

    public TaiLieuDaNhap067DAO() {
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
//        TaiLieuDaNhap067DAO tldao = new TaiLieuDaNhap067DAO();
//        tldao.addTaiLieuNhap(6, 10, 31000);
//        TaiLieuDaNhap067DAO taiLieuDaNhap067DAO = new TaiLieuDaNhap067DAO();
//        TaiLieuDaNhap067 tl = taiLieuDaNhap067DAO.getTLDaNhapByInfo(1, 10, 30000);
//        System.out.println(tl);
    }

    public void addTaiLieuNhap(int hoaDonNhapId, String dauTaiLieu067Id, int soLuongNhap, double donGia) {
        String ADD_TAILIEUDANHAP = "insert into tailieudanhap067(HoaDonNhap067_ID, DauTaiLieu067_ID, SoLuongNhap, DonGia) values (?,?,?,?);";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ADD_TAILIEUDANHAP);) {
            preparedStatement.setInt(1, hoaDonNhapId);
            preparedStatement.setString(2, dauTaiLieu067Id);
            preparedStatement.setInt(3, soLuongNhap);
            preparedStatement.setDouble(4, donGia);
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
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

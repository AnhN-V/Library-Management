package com.libmanfinal.DAO;


import com.libmanfinal.Model.ThanhVien067;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ThanhVien067DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/libmanfinal?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "2010";
    private static final String SELECT_ThanhVien_BY_USERNAME = "select * from thanhvien067 where username =?;";
    private static final String SELECT_ALL_ThanhVien = "select * from thanhvien067;";
    private static final String UPDATE_ThongTinThanhVien_SQL = "update thanhvien067 set hodem = ?, ten = ?,soDienThoai = ?, email= ?, diaChi =? where id = ?;";
    private static final String UPDATE_Password_SQL = "update thanhvien067 set password = ? where id = ?;";
    private static final String CHECK_LOGIN_SQL = "select * from thanhvien067 where username = ? and password = ?;";

    public ThanhVien067DAO() {
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

    public static void main(String[] args) throws SQLException {
//        ThanhVien067 thanhVien = new ThanhVien067();
//        thanhVien.setUsername("NVTV_VA");
//        thanhVien.setPassword("vietanh124");
//        ThanhVien067DAO dao = new ThanhVien067DAO();
//        boolean loggedIn = dao.checkLogin(thanhVien);
//        if (loggedIn) {
//            System.out.println("Đăng nhập thành công.");
//            System.out.println("ID: " + thanhVien.getId());
//            System.out.println("Họ đệm: " + thanhVien.getHodem());
//            System.out.println("Tên: " + thanhVien.getTen());
//            System.out.println("Vai trò: " + thanhVien.getVaiTro());
//        } else {
//            System.out.println("Đăng nhập thất bại.");
//        }

//        ThanhVien067 thanhvien067 = new ThanhVien067DAO().selectThanhVienByUsername("Vinhdb");
//        System.out.println(thanhvien067);

//        List<ThanhVien067> listTV = new ThanhVien067DAO().selectAllThanhVien();
//        for (ThanhVien067 thanhVien : listTV) {
//            System.out.println(thanhVien);
//        }

//        new ThanhVien067DAO().updateThongThanhVien(1, "Nguyen Viet", "Anh", "0352707697", "vietanhnguyenit201002@gmail.com", "Phung Khoang, Hanoi");

//    new ThanhVien067DAO().updatePassword(1, "vietanh124");
    }

    public boolean checkLogin(ThanhVien067 thanhVien067) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(CHECK_LOGIN_SQL);) {
            preparedStatement.setString(1, thanhVien067.getUsername());
            preparedStatement.setString(2, thanhVien067.getPassword());
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                thanhVien067.setId(rs.getInt("id"));
                thanhVien067.setHodem(rs.getString("hodem"));
                thanhVien067.setTen(rs.getString("ten"));
                thanhVien067.setVaiTro(rs.getString("vaitro"));
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            printSQLException(e);
            return false;
        }
    }

    public ThanhVien067 selectThanhVienByUsername(String username) {
        ThanhVien067 thanhVien067 = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ThanhVien_BY_USERNAME);) {
            preparedStatement.setString(1, username);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                thanhVien067 = new ThanhVien067(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)
                );
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return thanhVien067;
    }

    public List<ThanhVien067> selectAllThanhVien() {
        List<ThanhVien067> DSThanhVien = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ThanhVien);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                DSThanhVien.add(new ThanhVien067(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)
                ));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return DSThanhVien;
    }

    public void updateThongThanhVien(Integer id, String hodem, String ten, String soDienThoai, String email, String diaChi) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_ThongTinThanhVien_SQL);) {
            statement.setString(1, hodem);
            statement.setString(2, ten);
            statement.setString(3, soDienThoai);
            statement.setString(4, email);
            statement.setString(5, diaChi);
            statement.setInt(6, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public void updatePassword(int id, String password) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_Password_SQL);) {
            statement.setString(1, password);
            statement.setInt(2, id);
            statement.executeUpdate();
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

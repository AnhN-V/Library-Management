package com.libmanfinal.DAO;



import com.libmanfinal.Model.NhanVien067;

import java.sql.*;

public class NhanVien067DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/libmanfinal?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "2010";
    private static final String SELECT_NHANVIEN_BY_ID = "select * from nhanvien067 where ThanhVien067_ID = ?;";
    public NhanVien067DAO(){

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
        NhanVien067 nhanVien067 = new NhanVien067DAO().getNhanVienById(1);
        System.out.println(nhanVien067);
    }
    public NhanVien067 getNhanVienById(int ThanhVienId) {
        NhanVien067 nhanVien067 = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_NHANVIEN_BY_ID);) {
            preparedStatement.setInt(1, ThanhVienId);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                nhanVien067 = new NhanVien067(
                        rs.getInt("ThanhVien067_ID"),
                        rs.getDouble("luongCoBan"),
                        rs.getDouble("heSoLuong"),
                        rs.getString("vaiTroNhanVien")
                );
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return nhanVien067;
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

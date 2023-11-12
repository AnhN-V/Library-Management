package com.libmanfinal.DAO;


import com.libmanfinal.Model.NhaCungCap067;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhaCungCap067DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/libmanfinal?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "2010";

    public NhaCungCap067DAO() {

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
//                List<NhaCungCap067> listNCC = new NhaCungCap067DAO().getAllNCCByKeyWord("Nguyễn");
//        for (NhaCungCap067 NCC : listNCC) {
//            System.out.println(NCC);
//        }
//        NhaCungCap067 NCC = new NhaCungCap067DAO().getNCCById(1);
//        System.out.println(NCC);
//        NhaCungCap067DAO nhaCungCap067DAO = new NhaCungCap067DAO();
//        nhaCungCap067DAO.addNhaCungCap("Phạm Văn Tới", "khu đô thị Văn Quán, Hà Đông, Hà Nội", "0912789987", "pvtoi009@gmail.com");
    }
    public NhaCungCap067 getNCCById(Integer NCCId) throws ClassNotFoundException {
        NhaCungCap067 NCC = null;
        String SELECT_NHACUNGCAP_BY_ID = "SELECT * FROM nhacungcap067 WHERE id = ?;";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_NHACUNGCAP_BY_ID);) {
            preparedStatement.setInt(1, NCCId);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                NCC = new NhaCungCap067(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return NCC;
    }
    public List<NhaCungCap067> getAllNCCByKeyWord(String key_word) throws ClassNotFoundException{
        List<NhaCungCap067> DSNCC = new ArrayList<>();
        String SELECT_NHACUNGCAP_BY_KEYWORD = "select * from nhacungcap067 where tenNCC LIKE '%" + key_word + "%';";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_NHACUNGCAP_BY_KEYWORD);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                DSNCC.add(new NhaCungCap067(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                ));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return DSNCC;
    }
    public void addNhaCungCap(String tenNCC, String diaChi, String soDienThoai, String email) throws ClassNotFoundException {
        String ADD_NHACUNGCAP = "insert into nhacungcap067(tenNCC, diaChi, soDienThoai, email) values (?,?,?,?);";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ADD_NHACUNGCAP);) {
            preparedStatement.setString(1, tenNCC);
            preparedStatement.setString(2, diaChi);
            preparedStatement.setString(3, soDienThoai);
            preparedStatement.setString(4, email);
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

package com.libmanfinal.DAO;

import com.libmanfinal.Model.TaiLieu067;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaiLieu067DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/libmanfinal?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "2010";

    public TaiLieu067DAO() {

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
//                List<TaiLieu067> listTL = new TaiLieu067DAO().getAllTaiLieuByKeyWord("học");
//        for (TaiLieu067 tailieu : listTL) {
//            System.out.println(tailieu);
//        }
//        TaiLieu067 TaiLieu = new TaiLieu067DAO().getTaiLieuById(1);
//        System.out.println(TaiLieu);

//        TaiLieu067DAO tldao = new TaiLieu067DAO();
//        tldao.updateTongSoLuong(1, 101);

//        TaiLieu067DAO tldao = new TaiLieu067DAO();
//        tldao.addTaiLieu("Quản lý dự án phần mềm PTIT", "Đỗ Thị Bích Ngọc", 2006, "Curriculum", "Vietnamese");

//        TaiLieu067 taiLieu067 = new TaiLieu067DAO().getTLByInfo("Quản lý dự án phần mềm PTIT", "Đỗ Thị Bích Ngọc", 2006, "Curriculum", "Vietnamese");
//        System.out.println(taiLieu067);
    }
    public TaiLieu067 getTaiLieuById(String TaiLieuId) throws ClassNotFoundException {
        TaiLieu067 TaiLieu = null;
        String SELECT_TAILIEU_BY_ID = "SELECT * FROM tailieu067 WHERE id = ?;";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TAILIEU_BY_ID);) {
            preparedStatement.setString(1, TaiLieuId);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                TaiLieu = new TaiLieu067(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)
                );
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return TaiLieu;
    }
    public List<TaiLieu067> getAllTaiLieuByKeyWord(String key_word) throws ClassNotFoundException{
        List<TaiLieu067> DSTaiLieu = new ArrayList<>();
        String SELECT_TAILIEU_BY_KEYWORD = "select * from tailieu067 where tenTaiLieu LIKE '%" + key_word + "%';";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TAILIEU_BY_KEYWORD);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                DSTaiLieu.add(new TaiLieu067(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)
                ));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return DSTaiLieu;
    }
    public void updateTongSoLuong(String TaiLieuId, Integer tongSoLuong) throws ClassNotFoundException {
        String UPDATE_TONGSOLUONG = "update tailieu067 set tongSoLuong = ? where ID = ?;";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TONGSOLUONG);) {
            preparedStatement.setInt(1, tongSoLuong);
            preparedStatement.setString(2, TaiLieuId);
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
    public void addTaiLieu(String id, String tenTaiLieu, String tacGia, Integer namXuatBan, String theLoai, String ngonNgu) throws ClassNotFoundException {
        String ADD_TAILIEU = "insert into tailieu067(ID, tenTaiLieu, tacGia, namXuatBan, tongSoLuong, theLoai, ngonNgu) values (?,?,?,?,?,?,?);";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ADD_TAILIEU);) {
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, tenTaiLieu);
            preparedStatement.setString(3, tacGia);
            preparedStatement.setInt(4, namXuatBan);
            preparedStatement.setInt(5, 0);
            preparedStatement.setString(6, theLoai);
            preparedStatement.setString(7, ngonNgu);
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
    public TaiLieu067 getTLByInfo(String tenTaiLieu, String tacGia, Integer namXuatBan, String theLoai, String ngonNgu) throws ClassNotFoundException {
        TaiLieu067 taiLieu067 = null;
        String SELECT_TAILIEU_BY_Info = "SELECT * FROM tailieu067 WHERE tenTaiLieu = ? and tacGia = ? and namXuatBan = ? and tongSoLuong = ? and theLoai = ? and ngonNgu = ?;";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TAILIEU_BY_Info);) {
            preparedStatement.setString(1, tenTaiLieu);
            preparedStatement.setString(2, tacGia);
            preparedStatement.setInt(3, namXuatBan);
            preparedStatement.setInt(4, 0);
            preparedStatement.setString(5, theLoai);
            preparedStatement.setString(6, ngonNgu);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                taiLieu067 = new TaiLieu067(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)
                );
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return taiLieu067;

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

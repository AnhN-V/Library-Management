package com.libmanfinal.DAO;


import com.libmanfinal.Model.DauTaiLieu067;

import java.sql.*;

public class DauTaiLieu067DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/libmanfinal?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "2010";

    public DauTaiLieu067DAO() {

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
//        DauTaiLieu067 DauTaiLieu = new DauTaiLieu067DAO().getDauTaiLieuById(1);
//        System.out.println(DauTaiLieu);

//        DauTaiLieu067DAO dauTaiLieu067DAO = new DauTaiLieu067DAO();
//        dauTaiLieu067DAO.updateSoLuong(1, 101);

//        DauTaiLieu067DAO dauTaiLieu067DAO = new DauTaiLieu067DAO();
//        dauTaiLieu067DAO.addDauTaiLieu(51);
    }
    public DauTaiLieu067 getDauTaiLieuById(String DauTaiLieuId) throws ClassNotFoundException {
        DauTaiLieu067 dauTaiLieu067 = null;
        String SELECT_DAUTAILIEU_BY_ID = "SELECT * FROM dautailieu067 WHERE TaiLieu067_ID = ?;";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DAUTAILIEU_BY_ID);) {
            preparedStatement.setString(1, DauTaiLieuId);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                dauTaiLieu067 = new DauTaiLieu067(
                        rs.getString("TaiLieu067_ID"),
                        rs.getInt("soLuongHienCo")
                );
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return dauTaiLieu067;
    }

    public void updateSoLuong(String DauTaiLieuId, Integer soLuongHienCo) throws ClassNotFoundException {
        String UPDATE_SOLUONG = "update dautailieu067 set soLuongHienCo = ? where TaiLieu067_ID = ?;";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_SOLUONG);) {
            preparedStatement.setInt(1, soLuongHienCo);
            preparedStatement.setString(2, DauTaiLieuId);
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public void addDauTaiLieu(String taiLieuId) throws ClassNotFoundException {
        String ADD_TAILIEU = "insert into dautailieu067(TaiLieu067_ID, soLuongHienCo) values (?,?);";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ADD_TAILIEU);) {
            preparedStatement.setString(1, taiLieuId);
            preparedStatement.setInt(2, 0);
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

package com.example.md3.DAO;

import com.example.md3.connection.Connec;
import com.example.md3.model.GioHang;
import com.example.md3.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GioHangDAO {
    Connec con = new Connec();
    public void add(GioHang gioHang) {
        String query = "insert into giohang (idAccount, total, status) values(?,?,?)";
        Connection connection = con.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, gioHang.getIdAccount());
            statement.setDouble(2, gioHang.getTotal());
            statement.setBoolean(3, gioHang.isStatus());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public GioHang findIdGioHangByIdAccount(int idAccount){
        String query = "select  * from giohang where idAccount = ? and status = 0";
        Connection connection = con.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, idAccount);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                double total = resultSet.getDouble("total");
                boolean status = resultSet.getBoolean("status");
                GioHang gioHang = new GioHang(id, idAccount, total, status);
                return gioHang;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

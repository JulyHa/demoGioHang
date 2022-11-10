package com.example.md3.DAO;

import com.example.md3.connection.Connec;
import com.example.md3.model.CTGioHang;
import com.example.md3.model.GioHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CTGioHangDAO {
    Connec con = new Connec();
    public void add(CTGioHang ctGioHang) {
        String query = "insert into chitietgiohang (idgiohang, idproduct, soluong) values(?,?,?)";
        Connection connection = con.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, ctGioHang.getIdGioHang());
            statement.setInt(2, ctGioHang.getIdProduct().getId());
            statement.setInt(3, ctGioHang.getSoluong());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

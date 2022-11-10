package com.example.md3.DAO;

import com.example.md3.connection.Connec;
import com.example.md3.model.GioHang;
import com.example.md3.model.Product;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdcutDAO {
    Connec connec = new Connec();
    public List<Product> getAll() {
        String sql = "Select * from product";
        List<Product> products = new ArrayList<>();
        try {
            Connection connection = connec.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Double price = Double.valueOf(resultSet.getString("price"));
                int soluong = Integer.parseInt(resultSet.getString("soluong"));
                products.add(new Product(id, name, price, soluong));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }
    public Product findIdProductById(int id){
        String query = "select  * from product where id = ?";
        Connection connection = connec.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Double price = resultSet.getDouble("price");
                int sl = resultSet.getInt("soluong");
                Product product = new Product(id, name, price, sl);
                return product;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

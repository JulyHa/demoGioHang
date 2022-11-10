package com.example.md3.model;

public class CTGioHang {
    private int id;
    private int idGioHang;
    private Product idProduct;
    private int soluong;

    public CTGioHang() {
    }

    public CTGioHang(int id, int idGioHang, Product idProduct, int soluong) {
        this.id = id;
        this.idGioHang = idGioHang;
        this.idProduct = idProduct;
        this.soluong = soluong;
    }

    public CTGioHang(int idGioHang, Product idProduct, int soluong) {
        this.idGioHang = idGioHang;
        this.idProduct = idProduct;
        this.soluong = soluong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(int idGioHang) {
        this.idGioHang = idGioHang;
    }

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}

package com.example.md3.model;

public class GioHang {
    private int id;
    private int idAccount;
    private double total;
    private boolean status;

    public GioHang() {
    }

    public GioHang(int id, int idAccount, double total, boolean status) {
        this.id = id;
        this.idAccount = idAccount;
        this.total = total;
        this.status = status;
    }

    public GioHang(int idAccount, double total, boolean status) {
        this.idAccount = idAccount;
        this.total = total;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

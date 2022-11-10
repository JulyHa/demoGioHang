package com.example.md3.service.Impl;

import com.example.md3.DAO.GioHangDAO;
import com.example.md3.model.GioHang;
import com.example.md3.service.GioHangService;

public class GioHangServiceImpl implements GioHangService {
    GioHangDAO gioHangDAO = new GioHangDAO();
    @Override
    public void add(GioHang gioHang) {
        gioHangDAO.add(gioHang);
    }
}

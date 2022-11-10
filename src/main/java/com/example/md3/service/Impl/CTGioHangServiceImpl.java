package com.example.md3.service.Impl;

import com.example.md3.DAO.CTGioHangDAO;
import com.example.md3.model.CTGioHang;
import com.example.md3.service.ChiTietGHService;

public class CTGioHangServiceImpl implements ChiTietGHService {
    CTGioHangDAO ctGioHangDAO = new CTGioHangDAO();
    @Override
    public void add(CTGioHang ctGioHang) {
        ctGioHangDAO.add(ctGioHang);
    }
}

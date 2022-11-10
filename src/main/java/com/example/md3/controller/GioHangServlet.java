package com.example.md3.controller;

import com.example.md3.DAO.CTGioHangDAO;
import com.example.md3.DAO.GioHangDAO;
import com.example.md3.DAO.ProdcutDAO;
import com.example.md3.model.CTGioHang;
import com.example.md3.model.GioHang;
import com.example.md3.model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GioHangServlet", value = "/GioHang")
public class GioHangServlet extends HttpServlet {
    ProdcutDAO prodcutDAO = new ProdcutDAO();
    GioHangDAO gioHangDAO = new GioHangDAO();
    CTGioHangDAO ctGioHangDAO = new CTGioHangDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("product", prodcutDAO.getAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/show.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idProduct = Integer.parseInt(request.getParameter("id"));
        Product prodcut = prodcutDAO.findIdProductById(idProduct);
        int idUser = 2;
        GioHang gh = gioHangDAO.findIdGioHangByIdAccount(idUser);
        if(gh == null){
            gioHangDAO.add(new GioHang(2, 0, false));
            gh = gioHangDAO.findIdGioHangByIdAccount(idUser);
        }
        ctGioHangDAO.add(new CTGioHang(gh.getId(), prodcut, 1));
        response.sendRedirect("/GioHang");
    }
}

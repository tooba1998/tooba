/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.qaswatech.hislop.controller;

import com.qaswatech.hislop.model.InternModel;
import com.qaswatech.hislop.service.InternService;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kamra
 */
@WebServlet(name = "InternController", urlPatterns = {"/InternController"})
public class InternController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String task = request.getParameter("task");
        switch (task) {
            case "insert":
                insertIntern(request, response);
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void insertIntern(HttpServletRequest request, HttpServletResponse response) throws IOException {
        InternModel im = new InternModel();
        im.setFullname(request.getParameter("fullname"));
        im.setPhone(request.getParameter("phone"));
        im.setEmail(request.getParameter("email"));
        im.setCourse(request.getParameter("course"));
        im.setCollege(request.getParameter("college"));
        im.setDegree(request.getParameter("degree"));
        im.setSemester(request.getParameter("semester"));
        im.setAddress(request.getParameter("address"));
        im.setCity(request.getParameter("city"));
        im.setState(request.getParameter("state"));
        
        InternService is = new InternService();
        String message = is.insertIntern(im);
        response.sendRedirect("addIntern.jsp?msg=" + message);
    }
    
    public ArrayList<InternModel> showInterns() {
         InternService is = new InternService();
        return is.showInterns();
    
}
}

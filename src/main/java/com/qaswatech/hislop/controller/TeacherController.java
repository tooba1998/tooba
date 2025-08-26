/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.qaswatech.hislop.controller;

import com.qaswatech.hislop.model.TeacherModel;
import com.qaswatech.hislop.service.TeacherService;
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
@WebServlet(name = "TeacherController", urlPatterns = {"/TeacherController"})
public class TeacherController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String task = request.getParameter("task");
        switch (task) {
            case "insert":
                insertTeacher(request, response);
                break;
            case "update":
                updateTeacher(request, response);
                break;
            case "delete":
                deleteTeacher(request, response);
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

    private void insertTeacher(HttpServletRequest request, HttpServletResponse response) throws IOException {
        TeacherModel tm = new TeacherModel();
        tm.setName(request.getParameter("name"));
        tm.setEmail(request.getParameter("email"));
        tm.setPhone(request.getParameter("phone"));
        tm.setDob(request.getParameter("dob"));
        tm.setDegree(request.getParameter("degree"));
        tm.setDesignation(request.getParameter("designation"));
        tm.setCollege(request.getParameter("college"));
        tm.setAddress(request.getParameter("address"));
        tm.setCity(request.getParameter("city"));
        tm.setState(request.getParameter("state"));

        TeacherService ts = new TeacherService();
        String message = ts.insertTeacher(tm);
        response.sendRedirect("addTeacher.jsp?msg=" + message);

    }

    public ArrayList<TeacherModel> showTeacher() {
        TeacherService td = new TeacherService();
        return td.showTeacher();
    }

    public TeacherModel showTeacherById(int id) {
        TeacherService td = new TeacherService();
        return td.showTeacherBy(id);
    }

    private void updateTeacher(HttpServletRequest request, HttpServletResponse response) throws IOException {
        TeacherModel tm = new TeacherModel();
        tm.setName(request.getParameter("name"));
        tm.setEmail(request.getParameter("email"));
        tm.setPhone(request.getParameter("phone"));
        tm.setDob(request.getParameter("dob"));
        tm.setDegree(request.getParameter("degree"));
        tm.setDesignation(request.getParameter("designation"));
        tm.setCollege(request.getParameter("college"));
        tm.setAddress(request.getParameter("address"));
        tm.setCity(request.getParameter("city"));
        tm.setState(request.getParameter("state"));
        tm.setId(Integer.parseInt(request.getParameter("id")));

        TeacherService ts = new TeacherService();
        String message = ts.updateTeacher(tm);

        response.sendRedirect("showTeacher.jsp?msg=" + message);

    }

    private void deleteTeacher(HttpServletRequest request, HttpServletResponse response) throws IOException {
        TeacherService ts = new TeacherService();
        int id = Integer.parseInt(request.getParameter("id"));
        String message = ts.deleteTeacher(id);

        response.sendRedirect("showTeacher.jsp?msg=" + message);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.qaswatech.hislop.controller;

import com.qaswatech.hislop.model.StudentModel;
import com.qaswatech.hislop.service.StudentService;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kamra
 */
@WebServlet(name = "StudentController", urlPatterns = {"/StudentController"})
public class StudentController extends HttpServlet {

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
                insertStudent(request, response);
                break;
            case "update":
                updateStudent(request, response);
                break;
            case "delete":
                deleteStudent(request, response);
                break;
            case "login":
                login(request, response);
                break;
            case "logout":
                HttpSession session = request.getSession();
                session.invalidate();  //session terminate
                
                response.sendRedirect("index.jsp?msg=logout successfull");
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

    private void insertStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        StudentModel sm = new StudentModel();
        sm.setName(request.getParameter("name"));
        sm.setEmail(request.getParameter("email"));
        sm.setPhone(request.getParameter("phone"));
        sm.setDob(request.getParameter("dob"));
        sm.setDegree(request.getParameter("degree"));
        sm.setCollege(request.getParameter("college"));
        sm.setAddress(request.getParameter("address"));
        sm.setCity(request.getParameter("city"));
        sm.setState(request.getParameter("state"));
        
        StudentService ss = new StudentService();
        String message = ss.insertStudent(sm);
        response.sendRedirect("addStudent.jsp?msg=" + message);
        
    }
    
    public ArrayList<StudentModel> showStudent() {
        StudentService sd = new StudentService();
        return sd.showStudent();
    }
    
    public StudentModel showStudentById(int id) {
        StudentService sd = new StudentService();
        return sd.showStudentById(id);
    }
    
    private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        StudentModel sm = new StudentModel();
        sm.setName(request.getParameter("name"));
        sm.setEmail(request.getParameter("email"));
        sm.setPhone(request.getParameter("phone"));
        sm.setDob(request.getParameter("dob"));
        sm.setDegree(request.getParameter("degree"));
        sm.setCollege(request.getParameter("college"));
        sm.setAddress(request.getParameter("address"));
        sm.setCity(request.getParameter("city"));
        sm.setState(request.getParameter("state"));
        sm.setId(Integer.parseInt(request.getParameter("id")));
        
        StudentService ss = new StudentService();
        String message = ss.updateStudent(sm);
        
        response.sendRedirect("showStudent.jsp?msg=" + message);
    }
    
    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        StudentService ss = new StudentService();
        int id = Integer.parseInt(request.getParameter("id"));
        String message = ss.deleteStudent(id);
        
        response.sendRedirect("showStudent.jsp?msg=" + message);
        
    }
    
    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        StudentService ss = new StudentService();
        int status = ss.login(email, password);
        
        if (status == 1) {
            // session code start
            HttpSession session = request.getSession();
            session.setAttribute("session_id", "1");
            // session code end
            response.sendRedirect("dashBoard.jsp?msg=Login Successfull");
            
        } else {
            response.sendRedirect("index.jsp?msg=Incorrect Login deatils");
        }
    }
    
}

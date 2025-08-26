/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qaswatech.hislop.service;

import com.qaswatech.hislop.dao.StudentDao;
import com.qaswatech.hislop.model.StudentModel;
import java.util.ArrayList;

/**
 *
 * @author kamra
 */
public class StudentService {

    public String insertStudent(StudentModel sm) {
        StudentDao sd = new StudentDao();
        String meassage = sd.insertStudent(sm);
        return meassage;
    }

    public ArrayList<StudentModel> showStudent() {
        StudentDao sd = new StudentDao();
        return sd.showStudent();

    }

    public StudentModel showStudentById(int id) {
        StudentDao sd = new StudentDao();
        return sd.showStudentBy(id);
    }

    public String updateStudent(StudentModel sm) {
        StudentDao sd = new StudentDao();
        return sd.updateStudent(sm);
    }

    public String deleteStudent(int id) {
        StudentDao sd = new StudentDao();
        return sd.deleteStudent(id);
    }

    public int login(String email, String password) {
        StudentDao sd = new StudentDao();
        return sd.login(email, password);

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qaswatech.hislop.service;

import com.qaswatech.hislop.dao.TeacherDao;
import com.qaswatech.hislop.model.TeacherModel;
import java.util.ArrayList;

/**
 *
 * @author kamra
 */
public class TeacherService {

    public String insertTeacher(TeacherModel tm) {
        TeacherDao td = new TeacherDao();
        String message = td.insertTeacher(tm);
        return message;

    }

    public ArrayList<TeacherModel> showTeacher() {
        TeacherDao td = new TeacherDao();
        return td.showTeacher();
    }

    public TeacherModel showTeacherBy(int id) {
        TeacherDao td = new TeacherDao();
        return td.showTeacherBy(id);
    }

    public String updateTeacher(TeacherModel tm) {
        TeacherDao td = new TeacherDao();
        return td.updateTeacher(tm);
    }

    public String deleteTeacher(int id) {
        TeacherDao td = new TeacherDao();
        return td.deleteTeacher(id);
    }

}

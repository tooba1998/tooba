/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qaswatech.hislop.dao;

import com.qaswatech.hislop.database.Database;
import com.qaswatech.hislop.model.InternModel;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author kamra
 */
public class InternDao {

    public String insertIntern(InternModel im) {

        String message = null;
        Connection con = Database.connectDB();
        CallableStatement cs = null;

        String sql = "insert into Internship(fullname, phone, email, course, college, degree, semester, address)" + "values(?,?,?,?,?,?,?,?)";
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, im.getFullname());
            cs.setString(2, im.getPhone());
            cs.setString(3, im.getEmail());
            cs.setString(4, im.getCourse());
            cs.setString(5, im.getCollege());
            cs.setString(6, im.getDegree());
            cs.setString(7, im.getSemester());
            cs.setString(8, im.getAddress());

            int row = cs.executeUpdate();
            if (row >= 1) {
                message = "Intern record inserted Successfull";

            }
        } catch (Exception e) {
            message = "error in insert" + e.getMessage();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                }

            }
        }
        return message;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qaswatech.hislop.dao;

import com.qaswatech.hislop.database.Database;
import com.qaswatech.hislop.model.InternModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author kamra
 */
public class InternDao {

    public String insertIntern(InternModel im) {

        String message = null;
        Connection con = Database.connectDB();
        CallableStatement cs = null;

        String sql = "insert into Internship(fullname, phone, email, course, college, degree, semester, address, city, state)" + "values(?,?,?,?,?,?,?,?,?,?)";
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
            cs.setString(9, im.getCity());
            cs.setString(10, im.getState());

            int row = cs.executeUpdate();
            if (row >= 1) {
                message = "Intern record inserted Successfull";

            }
        } catch (SQLException e) {
            message = "error in insert" + e.getMessage();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }

            }
        }
        return message;
    }

    public ArrayList<InternModel> showInterns() {
 Connection con = Database.connectDB();
        CallableStatement cs = null;
        ArrayList<InternModel> interns = new ArrayList();
        ResultSet rs = null;
        String sql = "select * from internship where id";
        try {
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();

            while (rs.next()) {
                interns.add(
                        new InternModel(0,
                                rs.getString("fullname"),
                                rs.getString("phone"),
                                rs.getString("email"),
                                rs.getString("course"),
                                rs.getString("college"),
                                rs.getString("degree"),
                                rs.getString("semester"),
                                rs.getString("address"),
                                rs.getString("city"),
                                rs.getString("state"),
                                rs.getString("created"),
                                rs.getString("updated")
                        )
                );

            }
        } catch (SQLException e) {
            System.out.println("error in show student:" + e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();

                } catch (SQLException ex) {
                }

            }
        }
        return interns;

    } 

}

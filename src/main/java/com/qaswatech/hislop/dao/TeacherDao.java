/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qaswatech.hislop.dao;

import com.qaswatech.hislop.database.Database;
import com.qaswatech.hislop.model.TeacherModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author kamra
 */
public class TeacherDao {

    public String insertTeacher(TeacherModel tm) {

        String message = null;
        Connection con = Database.connectDB();
        CallableStatement cs = null;

        String sql = "insert into Teacher(name, email, phone, dob, degree, designation, college, address, city, state)" + "values(?,?,?,?,?,?,?,?,?,?)";
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, tm.getName());
            cs.setString(2, tm.getEmail());
            cs.setString(3, tm.getPhone());
            cs.setString(4, tm.getDob());
            cs.setString(5, tm.getDegree());
            cs.setString(6, tm.getDesignation());
            cs.setString(7, tm.getCollege());
            cs.setString(8, tm.getAddress());
            cs.setString(9, tm.getCity());
            cs.setString(10, tm.getState());
            int row = cs.executeUpdate();
            if (row >= 1) {
                message = "Teacher created Successfull";

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

    public ArrayList<TeacherModel> showTeacher() {

        Connection con = Database.connectDB();
        CallableStatement cs = null;
        ArrayList<TeacherModel> teachers = new ArrayList();
        ResultSet rs = null;
        String sql = "select * from teacher where id";
        try {
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();

            while (rs.next()) {
                teachers.add(
                        new TeacherModel(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getString("email"),
                                rs.getString("phone"),
                                rs.getString("dob"),
                                rs.getString("degree"),
                                rs.getString("designation"),
                                rs.getString("college"),
                                rs.getString("address"),
                                rs.getString("city"),
                                rs.getString("state"),
                                rs.getString("created"),
                                rs.getString("updated")
                        )
                );
            }
        } catch (SQLException e) {
            System.out.println("error in show teacher:" + e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }

        }
        return teachers;

    }

    public TeacherModel showTeacherBy(int id) {
        Connection con = Database.connectDB();
        CallableStatement cs = null;
        TeacherModel teacher = null;
        ResultSet rs = null;
        String sql = "select * from teacher where id=" + id;

        try {
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();
            System.out.println(sql);

            while (rs.next()) {
                System.out.println("name: " + rs.getString("name"));

                teacher = new TeacherModel(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("dob"),
                        rs.getString("degree"),
                        rs.getString("designation"),
                        rs.getString("college"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("state"),
                        rs.getString("created"),
                        rs.getString("updated")
                );
            }
        } catch (SQLException e) {
            System.out.println("error in show teacher:" + e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                }

            }
        }
        return teacher;
    }

    public String updateTeacher(TeacherModel tm) {
        String message = null;
        Connection con = Database.connectDB();
        CallableStatement cs = null;

        String sql = "update teacher set name=?, email=?, phone=?, dob=?, degree=?, designation=?, college=?, address=?, city=?, state=? where id=?";

        try {
            cs = con.prepareCall(sql);
            cs.setString(1, tm.getName());
            cs.setString(2, tm.getEmail());
            cs.setString(3, tm.getPhone());
            cs.setString(4, tm.getDob());
            cs.setString(5, tm.getDegree());
            cs.setString(6, tm.getDesignation());
            cs.setString(7, tm.getCollege());
            cs.setString(8, tm.getAddress());
            cs.setString(9, tm.getCity());
            cs.setString(10, tm.getState());
            cs.setInt(11, tm.getId());

            int row = cs.executeUpdate();
            if (row >= 1) {
                message = "Teacher record update successfull";

            }
        } catch (SQLException e) {
            message = "unable to update bcoz: " + e.getMessage();
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

    public String deleteTeacher(int id) {
        String message = null;
        Connection con = Database.connectDB();
        CallableStatement cs = null;

        String sql = "delete from teacher where id=?";

        try {
            cs = con.prepareCall(sql);
            cs.setInt(1, id);

            int row = cs.executeUpdate();
            if (row >= 1) {
                message = "teacher record delete successfull";
            }
        } catch (SQLException e) {
            message = "unable to delete bcoz:" + e.getMessage();
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
}

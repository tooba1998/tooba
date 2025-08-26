/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qaswatech.hislop.dao;

import com.qaswatech.hislop.database.Database;
import com.qaswatech.hislop.model.StudentModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author kamra
 */
public class StudentDao {

    public String insertStudent(StudentModel sm) {

        String message = null;
        Connection con = Database.connectDB();
        CallableStatement cs = null;

        String sql = "insert into Student(name, email, phone, dob, degree, college, address, city, state)" + "values(?,?,?,?,?,?,?,?,?)";
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, sm.getName());
            cs.setString(2, sm.getEmail());
            cs.setString(3, sm.getPhone());
            cs.setString(4, sm.getDob());
            cs.setString(5, sm.getDegree());
            cs.setString(6, sm.getCollege());
            cs.setString(7, sm.getAddress());
            cs.setString(8, sm.getCity());
            cs.setString(9, sm.getState());
            int row = cs.executeUpdate();
            if (row >= 1) {
                message = "Student created Successfull";

            }

        } catch (SQLException e) {
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

    public ArrayList<StudentModel> showStudent() {

        Connection con = Database.connectDB();
        CallableStatement cs = null;
        ArrayList<StudentModel> students = new ArrayList();
        ResultSet rs = null;
        String sql = "select * from student where id";
        try {
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();

            while (rs.next()) {
                students.add(
                        new StudentModel(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getString("email"),
                                rs.getString("phone"),
                                rs.getString("dob"),
                                rs.getString("degree"),
                                rs.getString("college"),
                                rs.getString("address"),
                                rs.getString("city"),
                                rs.getString("state"),
                                rs.getString("created"),
                                rs.getString("updated")
                        )
                );

            }
        } catch (Exception e) {
            System.out.println("error in show student:" + e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();

                } catch (SQLException ex) {
                }

            }
        }
        return students;

    }

    public StudentModel showStudentBy(int id) {
        Connection con = Database.connectDB();
        CallableStatement cs = null;
        StudentModel student = null;
        ResultSet rs = null;
        String sql = "select * from student where id = " + id;

        try {
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();
            System.out.println(sql);

            while (rs.next()) {
                System.out.println("name : " + rs.getString("name"));

                student = new StudentModel(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("dob"),
                        rs.getString("degree"),
                        rs.getString("college"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("state"),
                        rs.getString("created"),
                        rs.getString("updated")
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
        return student;

    }

    public String updateStudent(StudentModel sm) {
        String message = null;
        Connection con = Database.connectDB();
        CallableStatement cs = null;

        String sql = "update student set name=?, email=?, phone=?, dob=?, degree=?, college=?, address=?, city=?, state=? where id=?";

        try {
            cs = con.prepareCall(sql);
            cs.setString(1, sm.getName());
            cs.setString(2, sm.getEmail());
            cs.setString(3, sm.getPhone());
            cs.setString(4, sm.getDob());
            cs.setString(5, sm.getDegree());
            cs.setString(6, sm.getCollege());
            cs.setString(7, sm.getAddress());
            cs.setString(8, sm.getCity());
            cs.setString(9, sm.getState());
            cs.setInt(10, sm.getId());

            int row = cs.executeUpdate();
            if (row >= 1) {
                message = "student record update successfull";

            }
        } catch (Exception e) {
            message = "unable to update bcoz: " + e.getMessage();
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

    public String deleteStudent(int id) {
        String message = null;
        Connection con = Database.connectDB();
        CallableStatement cs = null;

        String sql = "delete from student where id=?";

        try {
            cs = con.prepareCall(sql);
            cs.setInt(1, id);

            int row = cs.executeUpdate();
            if (row >= 1) {
                message = "student record delete successfull";

            }
        } catch (Exception e) {
            message = "unable to delete bcoz:" + e.getMessage();

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

    public int login(String email, String password) {
        int status = 0;
        Connection con = Database.connectDB();
        CallableStatement cs = null;
        ResultSet rs = null;

        String sql = "select * from admin where email=? AND password=?";

        try {
            cs = con.prepareCall(sql);
            cs.setString(1, email);
            cs.setString(2, password);
            rs = cs.executeQuery();
            if (rs.next()) {
                status = 1;

            }
        } catch (Exception e) {
            System.out.println("error in login:" + e.getMessage());

        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception ex) {
                }

            }
        }
        return status;
    }

}

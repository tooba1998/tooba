/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qaswatech.hislop.model;

/**
 *
 * @author kamra
 */
public class InternModel {

    private int id;
    private String fullname;
    private String phone;
    private String email;
    private String course;
    private String college;
    private String degree;
    private String semester;
    private String address;
     private String city;
    private String state;
    private String created;
    private String updated;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
   

    public InternModel() {
    }

    public InternModel(int id, String fullname, String phone, String email, String course, String college, String degree, String semester, String address, String city, String state, String created, String updated) {
        this.id = id;
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.course = course;
        this.college = college;
        this.degree = degree;
        this.semester = semester;
        this.address = address;
        this.city = city;
        this.state = state;
        this.created = created;
        this.updated = updated;
    }
    
    

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    } 

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

}

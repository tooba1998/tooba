<%-- 
    Document   : teacherDetail
    Created on : 25-Jul-2025, 5:23:20 PM
    Author     : kamra
--%>
<%@include file="sessionCode.jsp" %>

<%@page import="com.qaswatech.hislop.model.TeacherModel"%>
<%@page import="com.qaswatech.hislop.controller.TeacherController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teacher Detail</title>
        <%@include file="links.html" %>



    </head>
    <body>
        <%@include file="menu.jsp" %>

        <div class="row mt-5">
            <div class="col-sm-1"></div>
            <div class="col-sm-10">
                <div class="card bg-success">
                    <h5 class="card-header bg-dark text-light">Teacher Details</h5>
                    <div class="card-body">
                        <table class="table">
                            <% TeacherController sc = new TeacherController();
                                int id = Integer.parseInt(request.getParameter("id"));
                                TeacherModel sm = sc.showTeacherById(id);
                            %>
                            <tr>
                                <td>Name</td>
                                <td><%= sm.getName()%></td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td><%= sm.getEmail()%></td>
                            </tr>
                            <tr>
                                <td>Phone</td>
                                <td><%= sm.getPhone()%></td>
                            </tr>
                            <tr>
                                <td>DOB</td>
                                <td><%= sm.getDob()%></td>
                            </tr>
                            <tr>
                                <td>Degree</td>
                                <td><%= sm.getDegree()%></td>
                            </tr>
                            <tr>
                                <td>Degree</td>
                                <td><%= sm.getDesignation()%></td>
                            </tr>
                            <tr>
                                <td>College</td>
                                <td><%= sm.getCollege()%></td>
                            </tr>
                            <tr>
                                <td>Address</td>
                                <td><%= sm.getAddress()%></td>
                            </tr>
                            <tr>
                                <td>City</td>
                                <td><%= sm.getCity()%></td>
                            </tr>
                            <tr>
                                <td>State</td>
                                <td><%= sm.getState()%></td>
                            </tr>




                        </table>

                        <h3>${param.msg}</h3>

                    </div>
                </div>
            </div>
            <div class="col-sm-1"></div>
        </div>
        <%@include file="footer.jsp" %>

    </body>
</html>

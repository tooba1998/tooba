<%-- 
    Document   : showTeacher
    Created on : 17-Jul-2025, 5:23:24 PM
    Author     : kamra
--%>


<%@page import="com.qaswatech.hislop.controller.TeacherController"%>
<%@page import="com.qaswatech.hislop.model.TeacherModel"%>
<%@page import="java.lang.ModuleLayer.Controller"%>
<%@include file="sessionCode.jsp" %>

<%@page import="java.util.ArrayList"%>
<%@page import="com.qaswatech.hislop.model.StudentModel"%>
<%@page import="com.qaswatech.hislop.controller.StudentController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Teacher</title>
        <%@include file="links.html" %>
        <!-- font awesome link -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.13.7/css/dataTables.bootstrap5.min.css">
    </head>
    <body>
        <%@include file="menu.jsp" %>




        <div class="row mt-5">
            <div class="col-sm-1"></div>
            <div class="col-sm-10">
                <div class="card bg-success">
                    <h5 class="card-header bg-dark text-light">Show Teacher</h5>
                    <div class="card-body">
                        <table id="example" class="table table-striped">
                            <thead>

                                <tr>

                                    <th>Sr no</th>
                                    <th>Name</th>
                                    <th>Email</th>
                                    <th>Phone</th>
                                    <th>DOB</th>
                                    <th>Degree</th>
                                    <th>Designation</th>
                                    <th>College</th>
                                    <th>Address</th>
                                    <th>City</th>
                                    <th>State</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%                          TeacherController tc = new TeacherController();
                                    ArrayList<TeacherModel> teachers = tc.showTeacher();
                                    int srno = 1;
                                    for (TeacherModel teacher : teachers) {
                                %>
                                <tr>
                                    <td><%=srno%></td>
                                    <td><%=teacher.getName()%></td>
                                    <td><%=teacher.getEmail()%></td>
                                    <td><%=teacher.getPhone()%></td>
                                    <td><%=teacher.getDob()%></td>
                                    <td><%=teacher.getDegree()%></td>
                                    <td><%=teacher.getDesignation()%></td>
                                    <td><%=teacher.getCollege()%></td>
                                    <td><%=teacher.getAddress()%></td>
                                    <td><%=teacher.getCity()%></td>
                                    <td><%=teacher.getState()%></td>

                                    <td>
                                        <div class="btn-group">
                                            <a href="teacherDetail.jsp?id=<%=teacher.getId()%>" class="btn btn-primary"><i class="fa fa-eye"></i></a>
                                            <a href="teacherUpdate.jsp?id=<%=teacher.getId()%>" class="btn btn-warning"><i class="fa fa-edit"></i></a>
                                            <a onclick="return confirm('are you sure, you want to delete ?')" href="TeacherController?task=delete&id=<%=teacher.getId()%>" class="btn btn-danger"><i class="fa fa-trash"></i></a>


                                        </div>
                                    </td>



                                </tr>
                                <%
                                        srno++;
                                    }%>
                            </tbody>
                        </table>

                        <h3>${param.msg}</h3>

                    </div>
                </div>
            </div>
            <div class="col-sm-1"></div>
        </div>
        <%@include file="footer.jsp" %>

        <script src="https://code.jquery.com/jquery-3.7.0.js"></script> 
        <script src="https://cdn.datatables.net/1.13.7/js/jquery.dataTables.min.js"></script> 
        <script src="https://cdn.datatables.net/1.13.7/js/dataTables.bootstrap5.min.js"></script> 
        <script>
                                                new DataTable('#example');
        </script>

    </body>
</html>

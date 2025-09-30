<%-- 
    Document   : showStudent
    Created on : 17-Jul-2025, 5:23:24 PM
    Author     : kamra
--%>


<%@page import="com.qaswatech.hislop.model.InternModel"%>
<%@page import="com.qaswatech.hislop.controller.InternController"%>
<%@include file="sessionCode.jsp" %>

<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Interns</title>
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
                <div class="card bg-warning">
                    <h5 class="card-header bg-dark text-light">Show Interns</h5>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table id="example" class="table table-striped">
                            <thead>

                                <tr>

                                    <th>Sr no</th>
                                    <th>Name</th>
                                    <th>phone</th>
                                    <th>email</th>
                                    <th>course</th>
                                    <th>college</th>
                                    <th>Degree</th>
                                    <th>Semester</th>
                                    <th>address</th>
                                    <th>city</th>
                                    <th>state</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%  InternController ic = new InternController();
                                    ArrayList<InternModel> interns = ic.showInterns();
                                    int srno = 1;
                                    for (InternModel intern : interns) {
                                    

                                %>
                                <tr>
                                    <td><%=srno%></td>
                                    <td><%=intern.getFullname()%></td>
                                    <td><%=intern.getPhone()%></td>
                                    <td><%=intern.getEmail()%></td>
                                    <td><%=intern.getCourse()%></td>
                                    <td><%=intern.getCollege()%></td>
                                    <td><%=intern.getDegree()%></td>
                                    <td><%=intern.getSemester()%></td>
                                    <td><%=intern.getAddress()%></td>
                                    <td><%=intern.getCity()%></td>
                                    <td><%=intern.getState()%></td>
                                    

                                    <td>
                                        <div class="btn-group">
                                            <a href="=<%=intern.getId()%>" class="btn btn-primary"><i class="fa fa-eye"></i></a>
                                            <a href="<%=intern.getId()%>" class="btn btn-warning"><i class="fa fa-edit"></i></a>
                                            <a onclick="return confirm('are you sure, you want to delete ?')" href="InternController?task=delete&id=<%=intern.getId()%>" class="btn btn-danger"><i class="fa fa-trash"></i></a>


                                        </div>
                                    </td>



                                </tr>
                                <%
                                        srno++;
                                    }%>
                            </tbody>
                        </table>

                        </div>
                        
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

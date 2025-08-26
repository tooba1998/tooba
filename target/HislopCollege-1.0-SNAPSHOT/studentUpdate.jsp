<%-- 
    Document   : studentUpdate
    Created on : 17-Jul-2025, 5:23:24 PM
    Author     : kamra
--%>


<%@include file="sessionCode.jsp" %>

<%@page import="com.qaswatech.hislop.model.StudentModel"%>
<%@page import="com.qaswatech.hislop.controller.StudentController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Update</title>
        <%@include file="links.html" %>

    </head>
    <body>
        <%@include file="menu.jsp" %>

        <div class="row mt-5">
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
                <div class="card bg-warning">
                    <h5 class="card-header bg-dark text-light">Edit Student</h5>
                    <div class="card-body">
                        <%
                            StudentController sc = new StudentController();
                            int id = Integer.parseInt(request.getParameter("id"));
                            StudentModel sm = sc.showStudentById(id);
                        %>
                        <form action="StudentController">
                            <input type="hidden" name="task" value="update">
                            <input type="hidden" name="id" value="<%=sm.getId()%>">
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Student Name</label>
                                <input type="text" name="name" value="<%=sm.getName()%>" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">Email</label>
                                <input type="text" name="email" value="<%=sm.getEmail()%>" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">phone</label>
                                <input type="number" name="phone" value="<%=sm.getPhone()%>" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">DOB</label>
                                <input type="date" name="dob" value="<%=sm.getDob()%>" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">Degree</label>
                                <select  name="degree" class="form-control" id="exampleInputPassword1">
                                    <option value="<%=sm.getDegree()%>"><%=sm.getDegree()%></option>
                                    <option value="MCA">MCA</option>
                                    <option value="BCA">BCA</option>
                                    <option value="BE">BE</option>
                                    <option value="BSC">BSC</option>
                                </select>
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">College</label>
                                <input type="text" name="college" value="<%=sm.getCollege()%>" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">Address</label>
                                <textarea  name="address" class="form-control" id="exampleInputPassword1">
                                    <%=sm.getAddress()%>
                                    
                                </textarea>

                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">City</label>
                                <select  name="city" class="form-control" id="exampleInputPassword1">
                                    <option value=""<%=sm.getCity()%>"><%=sm.getCity()%></option>
                                    <option value="Nagpur">Nagpur</option>
                                    <option value="Mumbai">Mumbai</option>
                                    <option value="Pune">Pune</option>
                                    <option value="Nashik">Nashik</option>
                                </select>
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">State</label>
                                <select name="state" class="form-control" id="exampleInputPassword1">
                                    <option value="<%=sm.getState()%>"><%=sm.getState()%></option>
                                    <option value="Maharashtra">Maharashtra</option>
                                    <option value="Up">Up</option>
                                    <option value="Mp">MP</option>
                                </select>
                            </div>




                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                        <h3>${param.msg}</h3>

                    </div>
                </div>
            </div>
            <div class="col-sm-2"></div>
        </div>
        <%@include file="footer.jsp" %>

    </body>
</html>

<%-- 
    Document   : addStudent
    Created on : 17-Jul-2025, 5:23:24 PM
    Author     : kamra
--%>


<%@include file="sessionCode.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD Student</title>
        <%@include file="links.html" %>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        <div class="row mt-5">
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
                <div class="card bg-warning">
                    <h5 class="card-header bg-dark text-light">Add student</h5>
                    <div class="card-body">
                        <form action="StudentController">
                            <input type="hidden" name="task" value="insert">
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Student Name</label>
                                <input type="text" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">E-mail</label>
                                <input type="text" name="email" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">phone</label>
                                <input type="number" name="phone" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">DOB</label>
                                <input type="date" name="dob" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">Degree</label>
                                <select  name="degree" class="form-control" id="exampleInputPassword1">
                                    <option value="MCA">MCA</option>
                                    <option value="BCA">BCA</option>
                                    <option value="BE">BE</option>
                                    <option value="BSC">BSC</option>
                                </select>
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">College</label>
                                <input type="text" name="college" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">Address</label>
                                <textarea  name="address" class="form-control" id="exampleInputPassword1">
                                    
                                </textarea>

                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">City</label>
                                <select  name="city" class="form-control" id="exampleInputPassword1">
                                    <option value="Nagpur">Nagpur</option>
                                    <option value="Mumbai">Mumbai</option>
                                    <option value="Pune">Pune</option>
                                    <option value="Nashik">Nashik</option>
                                </select>
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">State</label>
                                <select name="state" class="form-control" id="exampleInputPassword1">
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
</html>>

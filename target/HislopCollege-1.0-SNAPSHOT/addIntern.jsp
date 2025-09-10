<%-- 
    Document   : addIntern
    Created on : 03-Sep-2025, 4:42:32 PM
    Author     : kamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Koding Street Registration</title>
        <%@include file="links.html" %>
    </head>
    <body>
        <div class="container py-5" style="background-color: #5Θd8af">
            <div class="row justify-content-center">
                <div class="col-lg-8 col-md-10 col-sm-12">
                    <div class="text-center mb-4">
                        <img src="http://kodingstreet.com/tutorial/assets/myImg/kodingstreet-logo2.png"
                             alt="Company Logo" class="img-fluid" style="max-height: 50px;">
                        <h4 class="mt-3 fw-bold">KODING STREET PVT LTD</h4>
                        <p class="mb-1">
                            <a href="http://kodingstreet.com/en/" target="_blank" class="text-decoration-none d-block">
                                www.kodingstreet.com
                            </a>
                        </p>
                        <p class="mb-Θ text-muted">
                            <strong>Address 1: </strong>
                            "Sadar Chaouni, Nagpur, (Head Office)"
                            <br>
                            <strong>Address 2: </strong>
                            "Sakkardar (Branch)"
                        </p>


                    </div>
                    <div class="row mt-5">
                        <div class="col-sm-2"></div>
                        <div class="col-sm-8">
                            <div class="card" style="background-color: aquamarine">
                                <h4 class="card-header bg-dark text-light text-center"> Internship Registration</h4>
                                <div class="card-body">
                                    <form action="InternController">
                                        <input type="hidden" name="task" value="insert">
                                        <div class="mb-3">
                                            <label for="exampleInputEmail1" class="form-label">Full Name</label>
                                            <input type="text" name="fullname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                                        </div>

                                        <div class="mb-3">
                                            <label for="exampleInputPassword1" class="form-label">phone</label>
                                            <input type="number" name="phone" class="form-control" id="exampleInputPassword1">
                                        </div>
                                        <div class="mb-3">
                                            <label for="exampleInputPassword1" class="form-label">E-mail</label>
                                            <input type="text" name="email" class="form-control" id="exampleInputPassword1">
                                        </div>
                                        <div class="mb-3">
                                            <label for="exampleInputPassword1" class="form-label">Course</label>
                                            <select  name="course" class="form-control" id="exampleInputPassword1">
                                                <option value="C">C</option>
                                                <option value="C++">C++</option>
                                                <option value="PHP">PHP</option>
                                                <option value="JAVA">JAVA</option>
                                            </select>
                                        </div>


                                        <div class="mb-3">
                                            <label for="exampleInputPassword1" class="form-label">College</label>
                                            <input type="text" name="college" class="form-control" id="exampleInputPassword1">
                                        </div>
                                        <div class="mb-3">
                                            <label for="exampleInputPassword1" class="form-label">Degree</label>
                                            <select  name="degree" class="form-control" id="exampleInputPassword1">
                                                <option value="BCA">BCA</option>
                                                <option value="BCCA">BCCA</option>
                                                <option value="BCOM">BCOM</option>
                                                <option value="MCOM">MCOM</option>
                                                <option value="MSC">MSC</option>
                                                <option value="MCA">MCA</option>
                                                <option value="BBA">BBA</option>
                                                <option value="Other">Other</option>
                                            </select>
                                        </div>
                                        <div class="mb-3">
                                            <label for="exampleInputPassword1" class="form-label">Semester</label>
                                            <select  name="semester" class="form-control" id="exampleInputPassword1">
                                                <option value="1st">1st</option>
                                                <option value="2nd">2nd</option>
                                                <option value="3rd">3rd</option>
                                                <option value="4th">4th</option>
                                                <option value="5th">5th</option>
                                                <option value="6th">6th</option>
                                            </select>
                                        </div>
                                        <div class="mb-3">
                                            <label for="exampleInputPassword1" class="form-label">Address</label>
                                            <textarea  name="address" class="form-control" id="exampleInputPassword1">
                                    
                                            </textarea>

                                        </div>





                                        <div class="d-grid">                                     
                                            <button type="submit" class="btn btn-primary">Register</button>
                                        </div>
                                    </form>
                                    <h3>${param.msg}</h3>

                                </div>
                            </div>
                        </div>
                        <div class="col-sm-2"></div>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>

<%-- 
    Document   : dashBoard
    Created on : 28-Jul-2025, 5:50:42 PM
    Author     : kamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard  Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
    </head>
    <body style="background-color:lightblue;">
        <nav class="navbar navbar-expand-lg bg-warning">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Hislop College</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="addStudent.jsp">Add Student</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="showStudent.jsp">Show Student</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="addTeacher.jsp">Add Teacher</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="showTeacher.jsp">Show Teacher</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="StudentController?task=logout">Logout</a>
                        </li>


                    </ul>
                </div>
            </div>
        </nav>
    </body>
</html>

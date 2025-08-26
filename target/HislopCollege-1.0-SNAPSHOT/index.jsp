<%-- 
    Document   : index
    Created on : 30-Jul-2025, 5:26:34 PM
    Author     : kamra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>


    </head>
    <body>


        <div class="row">
            <div class="col-sm-1"></div>
            <div class="col-sm-10">
                <div class="card bg-warning">
                    <h5 class="card-header bg-dark text-light">Admin Login</h5>
                    <div class="card-body">
                        <form action="StudentController">
                            <input type="hidden" name="task" value="login">
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Email</label>
                                <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                            </div>
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Password</label>
                                <input type="password" name="password" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                            </div>
                            <div class="mb-3">
                                <input type="submit" class="btn btn-primary">

                            </div>


                            <h3>${param.msg}</h3>

                    </div>
                </div>
            </div>
            <div class="col-sm-1"></div>
        </div>
    </body>
</html>

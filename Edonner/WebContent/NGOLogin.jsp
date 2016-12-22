<%-- 
    Document   : DonLogin
    Created on : Sep 24, 2016, 7:56:48 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Login Page</title>
	<script type = "text/javascript" src = "jquery-3.1.0.js"></script>
        <script type="text/javascript" src="jquery.validate.js"></script>
        <script type="text/javascript" src="samplejs.js"></script>
	<meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    
    <body><center>
        <form id="register-form" action="NGOLoginServlet" method="post" >
    <div id="form-content">
        <fieldset>

           <div class="fieldgroup">
   NGO Login
            </div>

            <div class="fieldgroup">
     <input type="text" name="uname" placeholder="Your User Name(Email)" />
            </div>

            <div class="fieldgroup">
               <input type="password" name="upassword" placeholder="Your Password" />
            </div>

            <div class="fieldgroup">
                <input type="submit" value="Log In" class="submit">
            </div>
<div class="fieldgroup">
    <a href="index.html"> Back To Home</a>
            </div>

        </fieldset>
    </div>
</form>
     
        <style>
        *{
 margin:0px;
 padding:0px;
}
body {
    background-color:#346654;
}
#content { background-color:#f9f9f9; padding:20px;  }
h1 {
   font-family:"Comic Sans MS";
}

#header {
    background-color: #00a2d1;
 height:50px;
 text-align:center;
}
#header a
{
 color:#fff;
 text-decoration:none;
 font-size:35px;
 font-family:"Comic Sans MS";
 position:relative;
}

#register-form {
 background:#fff;
    border: 1px solid #DFDCDC;
    border-radius: 15px 15px 15px 15px;
    display: inline-block;
    margin-bottom: 30px;
    margin-left: 20px;
    margin-top: 10px;
    padding: 25px 50px 10px;
    width: 350px;
 font-family:"Comic Sans MS";
}

#register-form .fieldgroup {
    background: url("form-divider.gif") repeat-x scroll left top transparent;
    display: inline-block;
    padding: 8px 10px;
    width: 340px;
}
fieldset{ border:none; }

#register-form .fieldgroup input{
    margin: 10px 0;
    height: 40px;
 width:100%;
 border:solid #cdcdcd 1px;
 border-radius:3px;
 padding-left:10px;
}

#register-form .submit {
    padding: 10px;
    height: 40px !important;
 background:#00a2d1;
 color:#fff;
 font-weight:bolder;
 border:solid #cdcdcd 1px;
 border-radius:3px;
}

#register-form .fieldgroup label.error {
    color: #FB3A3A;
    display: inline-block;
    font-weight:500;
    padding: 0;
    text-align: left;
}
</style>

    </body>
    

   
    
</html>

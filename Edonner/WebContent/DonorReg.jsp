<%-- 
    Document   : RegDon
    Created on : Sep 24, 2016, 5:45:52 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Registration Page</title>
	<script type = "text/javascript" src = "jquery.js"></script>
        <script type="text/javascript" src="jqueryvalidate.js"></script>
        <script type="text/javascript" src="jqvalidimplement.js"></script>        <link rel="stylesheet" href="newcss.css"/>
	<meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <center>
    <body>
        <form id="register-form" action="DonorRegServlet" method="post" >
    <div id="form-content">
        <fieldset>
            <div class="dropdown">
            <select class="dropbtn" onchange="ch(this.value)">
            <div class="dropdown-content">
                <option disabled selected>Please Choose One</option>
                  <option value="RegDon.jsp">DONOR</option>
                  <option value="RegNgo.jsp">RECIPIENT NPO </option>
              
            </select>
            </div>
            </div>
            <div class="fieldgroup">
                <input type="text" name="firstname"  required placeholder="First Name" />
            </div>

            <div class="fieldgroup">
                <input type="text" name="lastname"  required placeholder="Last Name" />
            </div>
            
           
            <div class="fieldgroup">
                <input type="tel" name="phn" maxlength="10" pattern="[0-9]{10}" required placeholder="Phone Number" />
            </div>
            <div class="fieldgroup">
                <input type="text" name="address" required placeholder="Address" />
            </div>

            <div class="fieldgroup">
                <input type="text" name="pincode" required placeholder="Pincode" />
            </div>

            <div class="fieldgroup">
     <input type="email" name="email" required placeholder="Your E-mail ID" />
            </div>
            

            <div class="fieldgroup">
                <input type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" name="pwd1" onchange="form.pwd2.pattern = this.value;"
                       placeholder="Your Password">
           </div>
            
            <div class="fieldgroup">
                <input type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" name="pwd2" placeholder="Retype Password">
            </div>
            <div class="fieldgroup">
                <input type="submit" value="Register" class="submit">
            </div>

        </fieldset>
    </div>
</form>
        <script> 
         function ch(src)
         {
             window.location=src;
         }
         
        </script>
        <style>
        *{
 margin:0px;
 padding:0px;
}
body {
    /*background-color: #f9f9f9;)*/
     background: radial-gradient(#648880, #293f50);
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
    height: 40px ;
 background:#00a2d1;
 color:#fff;
 font-weight:bolder;
 border:solid #cdcdcd 1px;
 border-radius:3px;
}

#register-form .fieldgroup label.error {
    color: blue;
    display: inline-block;
    font-weight:500;
    padding: 0;
    text-align: left;
}
.dropbtn {
    background-color: blue;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}

#register-form.dropdown {
    position: relative;
    display: inline-block;
}

#register-form.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

#register-form.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

#register-form.dropdown-content a:hover {background-color: #f1f1f1}

#register-form.dropdown:hover .dropdown-content {
    display: block;
}

#register-form.dropdown:hover .dropbtn {
    background-color: #3e8e41;
}
</style>

    </body>
    

   
    
</html>

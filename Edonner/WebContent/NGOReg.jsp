<%-- 
    Document   : RegNgo
    Created on : Sep 24, 2016, 7:22:41 AM
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
        <title>NPO Registration</title>
        <meta charset="UTF-8">
        <script type = "text/javascript" src = "jquery.js"></script>
        <script type="text/javascript" src="jqueryvalidate.js"></script>
        <script type="text/javascript" src="jqvalidimplement.js"></script>
         <link rel="stylesheet" href="css1.css"/>
	
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
    <center>
         <form id="nporegister-form" action="NGOInsertServlet" method="post">
    <div id="form-content">
        <fieldset>
        <div class="fieldgroup">
                <input type="text" name="nponame"  required placeholder="Organization Name" />
            </div>
            <div class="fieldgroup">
                <input type="text" name="yrestd" onfocus="(this.type='date')" required placeholder="Year of Estalishment" />
            </div>
            
            <div class="fieldgroup">
                <input type="text" name="addr1" required placeholder="Address Line 1" />
            </div>
            <div class="fieldgroup">
                <input type="text" name="addr2" required placeholder="Address Line 2" />
            </div>
           
            <div class="fieldgroup">
                <input type="text" name="pincode" maxlength="6" required placeholder="PINCODE" />
            </div>
            <div class="fieldgroup">
                <input type="tel" name="phn" maxlength="10" pattern="[0-9]{10}"required placeholder="Phone Number" />
            </div>
             <div class="fieldgroup">
                <input type="tel" name="altphn" maxlength="10" pattern="[0-9]{10}" placeholder="Alternate Phone Number" />
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
    </center>
    <style>
        /*
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/
/* 
    Created on : 21 Sep, 2016, 2:07:15 PM
    Author     : USER
*/



 *{
 margin:0px;
 padding:0px;
}
body {
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

#nporegister-form {
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

#nporegister-form .fieldgroup {
    display: inline-block;
    padding: 8px 10px;
    width: 340px;
}
fieldset{ border:none; }

#nporegister-form .fieldgroup input{
    margin: 10px 0;
    height: 40px;
 width:100%;
 border:solid #cdcdcd 1px;
 border-radius:3px;
 padding-left:10px;
}

#nporegister-form .submit {
    padding: 10px;
    height: 40px ;
 background:#00a2d1;
 color:#fff;
 font-weight:bolder;
 border:solid #cdcdcd 1px;
 border-radius:3px;
}

#nporegister-form .fieldgroup label.error {
    color: #FB3A3A;
    display: inline-block;
    font-weight:500;
    padding: 0;
    text-align: left;
}

        </style>
    </body>
</html>

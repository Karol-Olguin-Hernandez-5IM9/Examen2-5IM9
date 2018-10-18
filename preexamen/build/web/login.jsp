<%-- 
    Document   : login
    Created on : 14-oct-2018, 17:11:37
    Author     : eog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="http://getbootstrap.com/docs/4.1/examples/sign-in/signin.css">
        <link rel="stylesheet" type="text/css" href="http://getbootstrap.com/docs/4.1/dist/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body class="text-center">
    <form class="form-signin" action="ValidaReg" method="POST">
      <img class="mb-4" src="../../assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
      <label for="inputEmail" class="sr-only">Username</label>
      <input type="text" id="inputEmail" class="form-control" placeholder="Username" required autofocus name="User">
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" class="form-control" placeholder="Password" required name="Contra">
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> Remember me
        </label>
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button><br>
      <a href="Reg.jsp">Registrarse</a>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
      
    </form>
    </body>
</html>

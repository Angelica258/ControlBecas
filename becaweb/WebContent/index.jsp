<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="estilo.css">
	<link href="https://fonts.googleapis.com/css?family=Neucha" rel="stylesheet">
	
	<title>Bienvenido</title>
	
</head>
<body>
	<div class="ini">
		<img src="img/bienvenido.png">
		<p>... Al sistema de control de llegadas, enfocado especialmente a Beca Trabajo...</p>
		<a class="btn btn-info btn-lg" href="#" data-toggle="modal" data-target="#IniciarSesion"  >Ingresar al Admin </a>
			
			<div class="modal fade" id="IniciarSesion" role="dialog">
                <div class="modal-dialog">
                     <div class="modal-content">
                          <div class="modal-header">
                               <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h4 class="modal-title">INICIAR SESION</h4>
                           </div>
                           <div class="modal-body">
                                <form method="post" action="loginController">
	                                <c:set var="alerta" scope="request" value = "${requestScope.msgResultado}"/>
										<c:if test="${alerta!=null}">  
											<div class="alert alert-success" role="alert">
									  			<c:out value="${alerta}"/>
											</div>
										</c:if>
							                                
                                   <div class="form-group">
                                        <label class="control-label">Correo Electronico</label>
                                        <div class="input-group">
                                              <div class="input-group-addon"><i class=" icono fas fa-at"></i></div>
                                              	 <input type="email" name ="correo" class="form-control" placeholder="info@hotmail.com"  required>
                                       	</div>
                                  </div>
                                  <div class="form-group">
                                       <label class="control-label">Contraseña</label>
                                        <div class="input-group">
                                              <div class="input-group-addon"><i class="fas fa-lock"></i></div>
                                                    <input type="password" name ="codigo" class="form-control" placeholder="********" required>
                                        </div>
                                  </div>
                                  <div class="form-group">
                                       <button type="submit" class="btn btn-info">Ingresar</button>
                                   </div>
                            	</form>
                             </div>
                       </div>
                </div>
            </div>		
		
		<a class="btn btn-info btn-lg" href="#" data-toggle="modal" data-target="#IniciarSesion2">Ingresar al Beca </a>
		
		<div class="modal fade" id="IniciarSesion2" role="dialog">
                <div class="modal-dialog">
                     <div class="modal-content">
                          <div class="modal-header">
                               <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h4 class="modal-title">INICIAR SESION</h4>
                           </div>
                           <div class="modal-body">
                                <form method="post" action="loginBcontroller">
	                                <c:set var="alerta" scope="request" value = "${requestScope.msgResultado}"/>
										<c:if test="${alerta!=null}">  
											<div class="alert alert-success" role="alert">
									  			<c:out value="${alerta}"/>
											</div>
										</c:if>
							                                
                                   <div class="form-group">
                                        <label class="control-label">Correo Electronico</label>
                                        <div class="input-group">
                                              <div class="input-group-addon"><i class=" icono fas fa-at"></i></div>
                                              	 <input type="email" name ="correo" class="form-control" placeholder="info@hotmail.com"  required>
                                       	</div>
                                  </div>
                                  <div class="form-group">
                                       <label class="control-label">Contraseña</label>
                                        <div class="input-group">
                                              <div class="input-group-addon"><i class="fas fa-lock"></i></div>
                                                    <input type="password" name ="codigo" class="form-control" placeholder="********" required>
                                        </div>
                                  </div>
                                  <div class="form-group">
                                       <button type="submit" class="btn btn-info">Ingresar</button>
                                   </div>
                            	</form>
                             </div>
                       </div>
                </div>
            </div>		
	</div>
</body>
<script src="js/jquery-3.3.1.js"></script>
<script src="js/bootstrap.js"></script>
</html>
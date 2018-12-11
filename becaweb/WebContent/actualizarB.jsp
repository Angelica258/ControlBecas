<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="estilo.css">
	<link href="https://fonts.googleapis.com/css?family=Neucha" rel="stylesheet">
	
<title>Insert title here</title>
</head>
<body class="container">
<div id="contenedorNav">
    <header>
    <nav class="navbar navbar-default" id="#myNavbar">
                <div class="container-fluid">
                    <div class="navbar-header">
                    	<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar" name="button">
					        <span class="icon-bar"></span>
					        <span class="icon-bar"></span>
					        <span class="icon-bar"></span>
				      </button>
                        <a class="navbar-brand active" id="barra-titulo" href="#"><i class="icono fas fa-home"></i>Administrador</a>
                    </div>
                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav">
                            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"></i>Gestionar Becas<span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <h5> Seleccionar</h5>
                                    <li><a href="#" data-seleccion="registrarB">Registrar Beca</a></li>
                                    <li><a href="#" data-seleccion="ConsultarB">Consultar Beca</a></li>
                                    <li><a href="#" data-seleccion="ListarB">Listar Becas</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Gestionar Turno<span
                                    class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <h5> Seleccionar</h5>
                                    <li><a href="#" data-seleccion="asignarT">Asignar Turno</a></li>
                                    <li><a href="#" data-seleccion="listarT">Listar Turnos Asignados</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Consultar Horario<span
                                    class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <h5> Seleccionar</h5>
                                    <li><a href="#" data-seleccion="ConsultarTB">Consultar por Beca</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"></i>
                                Consultar Retardos<span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <h5> Seleccionar</h5>
                                    <li><a href="#" data-seleccion="consultarRB">Consultar por Beca</a></li>
                                </ul>
                            </li>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li class=""><a href="../index.jsp">Salir</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    </header>
</div>
<div id="contenedor2">

<div class="row" id="vistaProductos">
    <div class=" centrarInfor col-xs-12 col-sm-9 ">
        <h4>Registrar Beca</h4>
        <hr>
        
        <c:set var="usuario" scope="request" value="${requestScope.usuario}"/>
		<form  method="post">

        <div class=" centrarInfor col-xs-12 col-sm-9">
            <div class="form-group">
                <label class="control-label">Codigo</label>
                    <div class="input-group">
                        <div class="input-group-addon"><i class=" icono fas fa-user"></i></div>
                       		 <input   type="text" name="codigo" class="form-control" value="<c:out value="${usuario.codigo}" />"/>                        
                        </div>
            </div>
           
            <div class="form-group">
                <label class="control-label">Nombre</label>
                    <div class="input-group">
                        <div class="input-group-addon"><i class=" icono fas fa-user"></i></div>
                          	<input   type="text" name="nombre" class="form-control" value="<c:out value="${usuario.nombre}" />"/>   
                        </div>
            </div>
            <div class="form-group">
                <label class="control-label">Apellido</label>
                    <div class="input-group">
                        <div class="input-group-addon"><i class=" icono fas fa-user"></i></div>
                            <input   type="text" name="apellido" class="form-control" value="<c:out value="${usuario.apellido}" />"/>
                        </div>
            </div>
            <div class="form-group">
                <label class="control-label">Telefono</label>
                    <div class="input-group">
                        <div class="input-group-addon"><i class=" icono fas fa-user"></i></div>
                            <input   type="text" name="telefono" class="form-control" value="<c:out value="${usuario.telefono}" />"/>
                        </div>
            </div>
            <div class="form-group">
                <label class="control-label">Correo</label>
                    <div class="input-group">
                        <div class="input-group-addon"><i class=" icono fas fa-user"></i></div>
                            <input   type="email" name="correo" class="form-control" value="<c:out value="${usuario.correo}" />"/>
                        </div>
            </div>
            <div class="form-group">
                <label class="control-label">Promedio</label>
                    <div class="input-group">
                        <div class="input-group-addon"><i class=" icono fas fa-user"></i></div>
                            <input   type="text" name="promedio" class="form-control" value="<c:out value="${usuario.promedio}" />"/>
                        </div>
            </div>
            <div class="form-group">
                <label class="control-label" for="carrera">Carrera</label>
                    <select name="carrera" class="form-control">
                        <option value="Ingeniria de Sistemas">Ingenieria de Sistemas</option>
                        <option value="Ingeniria de Ambiental">Ingenieria de Ambiental</option>
                        <option value="Ingeniria de Mecanica">Ingenieria de Mecanica</option>
                        <option value="Ingeniria de Industrial ">Ingenieria de  Industrial</option>
                        <option value="Ingeniria de  Electronica">Ingenieria de Electronica </option>
                        <option value="Ingeniria de Civil">Ingenieria de Civil</option>
                    </select>
            </div>
            
            <div class="button">
				<input class="btn btn-info" type="submit" value="<c:out value="${usuario!=null ? 'Actualizar': 'Registrar'}" />"/>
			</div>

        </div>
		
    </form> 


	</div>
</div>
<br> 
</div>
    
<footer class="row" id="footer">

    <div class="redes col-xs-12 col-sm-12">
        <h4>Redes sociales</h4>
        <a href="" target="_blank "><i class=" iconos fab fa-facebook-square"></i></a>
        <a href="https://twitter.com/" target="_blank"><i class="iconos fab fa-twitter-square"></i></a>
        <a href="https://www.instagram.com/" target="_blank"><i class=" iconos fab fa-instagram"></i></a>
        <h4>© Copyright 2018. Angelica Bermudez - UFPS</h4>
    </div>

</footer>


<script src="js/jquery-3.3.1.js"></script>
<script src="js/bootstrap.js"></script>
<script defer src="https://use.fontawesome.com/releases/v5.0.9/js/all.js"
        integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl"
        crossorigin="anonymous"></script>
<script type="text/javascript" src="js/javascript.js"></script>
<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBNVkndvZtfW9WZ_NySzK5Mu7i2uZ8ftCE&language=ar&region=EG"></script>
</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="estilo.css">
	<link href="https://fonts.googleapis.com/css?family=Neucha" rel="stylesheet">

<title>Beca</title>
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
                        <a class="navbar-brand active" id="barra-titulo" href="#"><i class="icono fas fa-home"></i>Beca</a>
                    </div>
                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav">
                            <li class="dropdown"><a a data-seleccion="datosB"></i>Mis Datos</a></li>
                            <li class="dropdown"><a data-seleccion="turnosB"  href="#">Mis Turnos </a></li>
                            <li class="dropdown"><a data-seleccion="retardosB"  href="#">Mis Retardos</a></li>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li class=""><a href="index.jsp" >Salir</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    </header>
</div>
<div id="contenedor2">
	<div class="ini">
		<img src="img/bienvenido.png">
			<p>... Al sistema de control de llegadas, enfocado especialmente a Beca Trabajo...</p>
			<hr>
			<h4>Seleccione del menu el proceso que desea realizar</h4>
	</div>
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
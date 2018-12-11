<div class="row" id="vistaProductos">
    <div>
        <h4>Asignar Turno</h4>
        <hr>
        <div class=" detalle col-xs-12 col-sm-5">
        	<p>Los turnos son de Lunes a Viernes y esta divididos en dos jornadas:</p>
        	<ul>
        		<li>Jornada 1 que va de 6:00 a.m a 12:00 p.m</li>
        		<li>Jornada 2 que va de 2:00 p.m a 10:00 p.m</li>
        		<li>El dia Sabado esta divido de igual forma, sin embargo; va hasta las 6:00 p.m.</li>
        	</ul>
			<hr>
			<br>
			<p> Los turnos esta registrados como:</p>
			<p>Mañana 6-8, 8-10, 10-12, Tarde 2-4, 4-6, 6-8, 8-10</p>
			<ul>
        		<li>Lunes: Mañana 1,2,3, Tarde 4,5,6,7</li>
        		<li>Martes: Mañana 8,9,10, Tarde 11,12,13,14</li>
        		<li>Miercoles: Mañana 15,16,17, Tarde 18,19,20,21</li>
        		<li>Jueves: Mañana 22,23,24, Tarde 25,26,27,28</li>
        		<li>Viernes: Mañana 29,30,31, Tarde 32,33,34,35</li>
        		<li>Sabado: Mañana 36,37,38, Tarde 39,40</li>
        	</ul>
        </div>
        <div class=" asignarT col-xs-12 col-sm-5">
			<form action="turnoController?action=registrar" method="post">
				<div class=" centrarInfor col-xs-12 col-sm-9">
		            <div class="form-group">
		                <label class="control-label">Id Asiganar Turno</label>
		                    <div class="input-group">
		                        <div class="input-group-addon"><i class=" icono fas fa-hashtag"></i></div>
		                          	<input name="idturnouser" type="text" class="form-control" placeholder="1" required>
		                        </div>
		            </div>
		            <div class="form-group">
		                <label class="control-label">Codigo del Beca</label>
		                    <div class="input-group">
		                        <div class="input-group-addon"><i class=" icono fas fa-id-card-alt"></i></div>
		                          	<input name="codigo" type="text" class="form-control" placeholder="1151453" required>
		                        </div>
		            </div>
		            <div class="form-group">
		                <label class="control-label">Id, del Turno</label>
		                    <div class="input-group">
		                        <div class="input-group-addon"><i class=" icono fas fa-calendar-alt"></i></div>
		                          	<input name="idturno" type="text" class="form-control" placeholder="1" required>
		                        </div>
		            </div>
		   			<div class="button">
		                <button  class="btn btn-info"  type="submit">Registrar </button>
		            </div>

		        </div>
				
		    </form> 
		</div>
    </div>
</div>
<div class="row" id="vistaProductos">
    <div class=" centrarInfor col-xs-12 col-sm-9 ">
        <h4>Mis datos</h4>
        <br>
        <p>Para consultar los datos ingrese su codigo:</p>
        <hr>
	<form action="becaContoller" metodo="get" >
        <div class=" centrarInfor col-xs-12 col-sm-9">
            <div class="form-group">
                <label class="control-label">Codigo</label>
                    <div class="input-group">
                        <div class="input-group-addon"><i class=" icono fas fa-user"></i></div>
                          	<input name="codigo" type="text" class="form-control" placeholder="1151453" required>
                        </div>
            </div>
        <div class="button">
                <button  class="btn btn-info"  type="submit">Constultar</button>
            </div>

        </div>
		
    </form> 
<br>
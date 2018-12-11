package DAO;

import modelo.Usuario;
import util.Conexion;

public class usuarioDAO extends Conexion<Usuario>implements GenericDAO<Usuario> {

	public usuarioDAO() {
		super(Usuario.class);
	}

	public String validarUsuario(Usuario us) {
		Usuario user = this.find(us.getCodigo());

		if(user != null)
			if (user.getCorreo().contentEquals(us.getCorreo())){
				return "SUCCESS";
			}
		return "ERROR";
	}

}

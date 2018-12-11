package DAO;


import modelo.Turnoxuser;
import util.Conexion;

public class turnoxUsuarioDAO extends Conexion<Turnoxuser> implements GenericDAO<Turnoxuser>{

	public turnoxUsuarioDAO() {
		super(Turnoxuser.class);
	}

}

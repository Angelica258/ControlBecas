package DAO;

import modelo.Turno;
import util.Conexion;

public class turnoDAO extends Conexion<Turno> implements GenericDAO<Turno>{

	public turnoDAO() {
		super(Turno.class);
	}

}

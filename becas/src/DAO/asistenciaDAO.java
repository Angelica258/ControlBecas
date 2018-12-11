package DAO;

import modelo.Asistencia;
import util.Conexion;

public class asistenciaDAO extends Conexion<Asistencia> implements GenericDAO<Asistencia>{

	public asistenciaDAO() {
		super(Asistencia.class);
	}

}

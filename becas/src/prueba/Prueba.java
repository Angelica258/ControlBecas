package prueba;



import java.util.Calendar;
import java.util.Date;

import DAO.usuarioDAO;
import modelo.Usuario;

public class Prueba {
	public static void main(String[] args) {
	
		
		Usuario  us = new Usuario();
		us.setCodigo(1150373);
		us.setNombre("anita");
		us.setApellido("perez");
		us.setCorreo("a@ahotmail.com");
		us.setPromedio("3.25");
		us.setCarrera("ing sistemas");
		us.setTelefono("321654987");
		
		
		usuarioDAO usDAO = new usuarioDAO();
		
		
		
		
		
		
		String sw= usDAO.insert(us);
		System.out.println(sw);
		
		
		
		}

		
		
}

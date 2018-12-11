package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import DAO.usuarioDAO;

import modelo.Usuario;

/**
 * Servlet implementation class usuarioController
 */
@WebServlet("/usuarioController")
public class usuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public usuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("entro por do get");
		String action = request.getParameter("action");
		System.out.println(action);
		try {
			switch (action) {
			case "registrar":
				System.out.println("entro al case de registrar");
				registrar(request, response);
				break;
			
			default:
				break;
			}			
		} catch (Exception e) {
			e.getStackTrace();
		}
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		usuarioDAO usDAO = new usuarioDAO();	
		
		Usuario usu = usDAO.find(codigo);
		System.out.println("este es el el que estaba consultando" +usu.toString());
		request.setAttribute("usuario", usu);
		
		request.getRequestDispatcher("actualizarB.jsp").forward(request, response);

	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("entro por do post");
		
		String action = request.getParameter("action");
		System.out.println(action);
		try {
			switch (action) {
			case "registrar":
				System.out.println("entro al case de registrar");
				registrar(request, response);
				break;
			
			default:
				break;
			}			
		} catch (Exception e) {
			e.getStackTrace();
		}
		System.out.println("entro a demas");
		
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		
		
		String nombre = request.getParameter("nombre");
		System.out.println(nombre = request.getParameter("nombre").toString());
		
		String apellido = request.getParameter("apellido");
		System.out.println(apellido = request.getParameter("apellido").toString());
	
		String correo = request.getParameter("correo");
		System.out.println(correo = request.getParameter("correo").toString());
		
		String promedio = request.getParameter("promedio");
		System.out.println(promedio = request.getParameter("promedio").toString());
		
		String carrera = request.getParameter("carrera");
		System.out.println(carrera = request.getParameter("carrera").toString());
		
		String telefono = request.getParameter("telefono");
		System.out.println(telefono = request.getParameter("telefono").toString());
		
			
		usuarioDAO usDAO=new usuarioDAO();
		Usuario us=usDAO.find(codigo);
		
		us.setCodigo(codigo);
		us.setNombre(nombre);
		us.setApellido(apellido);
		us.setCorreo(correo);
		us.setPromedio(promedio);
		us.setCarrera(carrera);
		us.setTelefono(telefono);
		
		
		usDAO.update(us);
		
		
		String sw = usDAO.insert(us);
		System.out.println(us.toString());
		 if(sw!=null){
			 request.getRequestDispatcher("Admin.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		  }
		   
		 //RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		//dispatcher.forward(request, response);
		
		 System.out.println("salio del post");
	}
	

private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	int codigo = Integer.parseInt(request.getParameter("codigo"));
	
	
	String nombre = request.getParameter("nombre");
	System.out.println(nombre = request.getParameter("nombre").toString());
	
	String apellido = request.getParameter("apellido");
	System.out.println(apellido = request.getParameter("apellido").toString());

	String correo = request.getParameter("correo");
	System.out.println(correo = request.getParameter("correo").toString());
	
	String promedio = request.getParameter("promedio");
	System.out.println(promedio = request.getParameter("promedio").toString());
	
	String carrera = request.getParameter("carrera");
	System.out.println(carrera = request.getParameter("carrera").toString());
	
	String telefono = request.getParameter("telefono");
	System.out.println(telefono = request.getParameter("telefono").toString());
	
		
	usuarioDAO usDAO=new usuarioDAO();
	Usuario us= new Usuario();
	
	
	us.setCodigo(codigo);
	us.setNombre(nombre);
	us.setApellido(apellido);
	us.setCorreo(correo);
	us.setPromedio(promedio);
	us.setCarrera(carrera);
	us.setTelefono(telefono);

	String sw = usDAO.insert(us);
	System.out.println(us.toString());
	if(sw!=null){
		request.getRequestDispatcher("Admin.jsp").forward(request, response);
		  
	}else{
		request.getRequestDispatcher("erro.jsp").forward(request, response);
	  }
	  }
	

}




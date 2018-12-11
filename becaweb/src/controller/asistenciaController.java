package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.asistenciaDAO;
import DAO.usuarioDAO;
import modelo.Asistencia;
import modelo.Usuario;

/**
 * Servlet implementation class asistenciaController
 */
@WebServlet("/asistenciaController")
public class asistenciaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public asistenciaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		usuarioDAO usDAO = new usuarioDAO();	
		
		Usuario usu = usDAO.find(codigo);
		
		asistenciaDAO asiDAO = new asistenciaDAO();
		Asistencia as= new Asistencia();
		
	

		
	
		System.out.println("este es el el que estaba consultando" +usu.toString());
		request.setAttribute("usuario", usu);
		
		request.getRequestDispatcher("actualizarB.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.turnoDAO;
import DAO.turnoxUsuarioDAO;
import DAO.usuarioDAO;
import modelo.Turno;
import modelo.Turnoxuser;
import modelo.Usuario;

/**
 * Servlet implementation class turnoController
 */
@WebServlet("/turnoController")
public class turnoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public turnoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idturnouser = Integer.parseInt(request.getParameter("idturnouser"));
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		int idturno = Integer.parseInt(request.getParameter("idturno"));
		
		usuarioDAO usDAO = new usuarioDAO();	
		Usuario usu = usDAO.find(codigo);
		
		turnoDAO tuDAO = new turnoDAO();
		Turno tu =tuDAO.find(idturno);
		
		turnoxUsuarioDAO turxuserDAO =new turnoxUsuarioDAO();
		Turnoxuser turuser= new Turnoxuser();
		
		turuser.setIdturnouser(idturnouser);
		turuser.setUsuario(usu);
		turuser.setTurno(tu);
		
		String sw = turxuserDAO.insert(turuser);
		System.out.println(turuser.toString());
		if(sw!=null){
			request.getRequestDispatcher("Admin.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("error.jsp").forward(request, response);
		  }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

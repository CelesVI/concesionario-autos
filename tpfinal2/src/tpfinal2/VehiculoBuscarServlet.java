package tpfinal2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class VehiculoBuscarServlet
 */
@WebServlet("/VehiculoBuscarServlet")
public class VehiculoBuscarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VehiculoDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehiculoBuscarServlet() {
        super();
        dao = new VehiculoDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		double id2 = Double.parseDouble(id);
		RequestDispatcher rd = null;
		Vehiculo var = new Vehiculo();
		var = dao.buscarVehiculo(id2);
		if (var != null) {
			rd = request.getRequestDispatcher("/WEB-INF/BuscarVehOk.jsp");
			
			request.setAttribute("vehiculo", var);
		} else {
			rd = request.getRequestDispatcher("/WEB-INF/BuscarVehErr.jsp");
		}
		rd.forward(request, response);
        
     }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

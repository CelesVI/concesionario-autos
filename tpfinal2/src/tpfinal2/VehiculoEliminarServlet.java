package tpfinal2;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VehiculoEliminarServlet
 */
@WebServlet("/VehiculoEliminarServlet")
public class VehiculoEliminarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static VehiculoDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehiculoEliminarServlet() {
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
		boolean var;
		var = dao.eliminarVehiculo(id2);
		if (var == true) {
			request.setAttribute("vehiculo", var);
			rd = request.getRequestDispatcher("/WEB-INF/EliminarVehOk.jsp");
		} else {
			request.setAttribute("vehiculo", var);
			rd = request.getRequestDispatcher("/WEB-INF/EliminarVehFail.jsp");
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

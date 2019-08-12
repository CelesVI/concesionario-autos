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
 * Servlet implementation class VentaEliminarServlet
 */
@WebServlet("/VentaEliminarServlet")
public class VentaEliminarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static VentaDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VentaEliminarServlet() {
        super();
        dao = new VentaDAO();
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
		var = dao.eliminarVenta(id2);
		if (var == true) {
			request.setAttribute("venta", var);
			rd = request.getRequestDispatcher("/WEB-INF/EliminarVenOk.jsp");
		} else {
			request.setAttribute("venta", var);
			rd = request.getRequestDispatcher("/WEB-INF/EliminarVenErr.jsp");
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

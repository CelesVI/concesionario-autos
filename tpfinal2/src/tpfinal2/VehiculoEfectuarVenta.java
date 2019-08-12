package tpfinal2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VehiculoEfectuarVenta
 */
@WebServlet("/VehiculoEfectuarVenta")
public class VehiculoEfectuarVenta extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static VehiculoDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehiculoEfectuarVenta() {
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
		
		var = dao.efectuarVenta(id2);
		if (var == true){
			rd = request.getRequestDispatcher("/WEB-INF/VentaOk.jsp");
	        request.setAttribute("Vehiculo", dao);
		} else {
			rd = request.getRequestDispatcher("/WEB-INF/VentaErr.jsp"); 
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

package tpfinal2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VehiculoImpuestoServlet
 */
@WebServlet("/VehiculoImpuestoServlet")
public class VehiculoImpuestoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VehiculoDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehiculoImpuestoServlet() {
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
		double imp = 0;
		imp = dao.impuesto(id2);
        rd = request.getRequestDispatcher("/WEB-INF/ImpuestoOk.jsp");
        request.setAttribute("Impuesto", imp);
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

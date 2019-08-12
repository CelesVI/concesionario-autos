package tpfinal2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VentaModificarServlet
 */
@WebServlet("/VentaModificarServlet")
public class VentaModificarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    VentaDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VentaModificarServlet() {
        super();
        dao = new VentaDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		double id2 = Double.parseDouble(id);
		String monto = request.getParameter("monto");
		double monto2 = Double.parseDouble(monto);
		String idv = request.getParameter("idv");
		double idv2 = Double.parseDouble(idv);
		String idc = request.getParameter("idc");
		double idc2 = Double.parseDouble(idc);
       
        RequestDispatcher rd = null;
        boolean var;
        var = dao.saveOrInsertVenta(id2, monto2, idv2, idc2);
        if (var == true){
        	request.setAttribute("venta", dao.saveOrInsertVenta(id2, monto2, idv2, idc2));
        	rd = request.getRequestDispatcher("/WEB-INF/ModificarVenOk.jsp");
        } else {
        	rd = request.getRequestDispatcher("/WEB-INF/ModificarVenErr.jsp");
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

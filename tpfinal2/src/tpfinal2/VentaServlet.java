package tpfinal2;

import  tpfinal2.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VentaServlet
 */
@WebServlet("/VentaServlet")
public class VentaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static VentaDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VentaServlet() {
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
		String monto = request.getParameter("monto");
		double monto2 = Double.parseDouble(monto);
		String idv = request.getParameter("idv");
		double idv2 = Double.parseDouble(idv);
		String idc = request.getParameter("idc");
		double idc2 = Double.parseDouble(idc);
       
        RequestDispatcher rd = null;
        
        dao.guardarVenta(id2, monto2, idv2, idc2);
        request.setAttribute("Venta", dao.guardarVenta(id2, monto2, idv2, idc2));
        rd = request.getRequestDispatcher("/WEB-INF/AgregarVenOk.jsp");
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

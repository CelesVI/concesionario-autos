package tpfinal2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VehiculoModificarServlet
 */
@WebServlet("/VehiculoModificarServlet")
public class VehiculoModificarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    VehiculoDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehiculoModificarServlet() {
        super();
        dao = new VehiculoDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
        double id2 = Double.parseDouble(id);
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String a�o = request.getParameter("a�o");
        int a�o2 = Integer.parseInt(a�o);
        String motor = request.getParameter("motor");
        double motor2 = Double.parseDouble(motor);
        String kilometraje = request.getParameter("kilometraje");
        double kilometraje2 = Double.parseDouble(kilometraje);
        String color = request.getParameter("color");
        String precio = request.getParameter("precio");
        double precio2 = Double.parseDouble(precio);
       
        RequestDispatcher rd = null;
        boolean var; 
        var = dao.saveOrInsert(id2, marca, modelo, a�o2, motor2, kilometraje2, color, precio2);
        if (var == true){
        	request.setAttribute("vehiculo", dao.saveOrInsert(id2, marca, modelo, a�o2, motor2, kilometraje2, color, precio2));
        	rd = request.getRequestDispatcher("/WEB-INF/ModificarVehOk.jsp");
        } else {
        	rd = request.getRequestDispatcher("/WEB-INF/ModificarVehErr.jsp");
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

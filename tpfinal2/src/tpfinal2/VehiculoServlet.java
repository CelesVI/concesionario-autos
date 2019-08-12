package tpfinal2;
 
import tpfinal2.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
 
import javax.servlet.RequestDispatcher;
 
 
/**
 * Servlet implementation class VehiculoServlet
 */
@WebServlet("/VehiculoServlet")
 
 
public class VehiculoServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
        private static String AGREGAR_O_MODIFICAR = "AgregarVeh.jsp";
        private static String LISTAR_VEHICULOS = "listVehiculo.jsp";
        private VehiculoDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehiculoServlet() {
        super();
        dao = new VehiculoDAO();
        // TODO Auto-generated constructor stub
    }
 
        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
   /* ArrayList <Vehiculo> V = new ArrayList <Vehiculo> ();*/
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	String id = request.getParameter("id");
            double id2 = Double.parseDouble(id);
            String marca = request.getParameter("marca");
            String modelo = request.getParameter("modelo");
            String año = request.getParameter("año");
            int año2 = Integer.parseInt(año);
            String motor = request.getParameter("motor");
            double motor2 = Double.parseDouble(motor);
            String kilometraje = request.getParameter("kilometraje");
            double kilometraje2 = Double.parseDouble(kilometraje);
            String color = request.getParameter("color");
            String precio = request.getParameter("precio");
            double precio2 = Double.parseDouble(precio);
           
            RequestDispatcher rd = null;
             
            dao.guardarVehiculo(id2, marca, modelo, año2, motor2, kilometraje2, color, precio2);
            request.setAttribute("vehiculo", dao.guardarVehiculo(id2, marca, modelo, año2, motor2, kilometraje2, color, precio2));
            rd = request.getRequestDispatcher("/WEB-INF/AgregarVehOk.jsp");
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
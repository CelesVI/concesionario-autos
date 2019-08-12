package tpfinal2;
 
import java.util.*;
import tpfinal2.*;
 
public class ProgramaDB {
 
        static List <Vehiculo> V = new ArrayList <Vehiculo> ();
        static List <Venta> S = new ArrayList <Venta> ();
        static Vehiculo guardarVehiculo = new Vehiculo();
        static double costoMes = 0;
        
        static public void guardarVehiculo(Vehiculo vehiculo) {
               
                V.add(vehiculo);
        }
 
       
        public static boolean saveOrUpdate(Vehiculo vehiculo) {
                boolean save = false;
                for (Iterator iterator = V.iterator(); iterator.hasNext();) {
                        Vehiculo vehiculoLista = (Vehiculo) iterator.next();
                        if (vehiculoLista.getId() == vehiculo.getId()) {
                                vehiculoLista.setId(vehiculo.getId());
                                vehiculoLista.setMarca(vehiculo.getMarca());
                                vehiculoLista.setModelo(vehiculo.getModelo());
                                vehiculoLista.setAño(vehiculo.getAño());
                                vehiculoLista.setMotor(vehiculo.getMotor());
                                vehiculoLista.setKilometraje(vehiculo.getKilometraje());
                                vehiculoLista.setColor(vehiculo.getColor());
                                vehiculoLista.setPrecio(vehiculo.getPrecio());
                               
                                save = true;
                        }
                }
               
               
                
                return save;
        }
       
        static public boolean eliminarVehiculo(double id){
                int i;
                boolean save = false;
                for (i=0; i<V.size(); i++){
                        if(id == V.get(i).getId()){
                                V.remove(i);
                                save = true;
                        }
                }
                return save;
        }
       
        static public Vehiculo /*void*/ /*List <Vehiculo>*/ buscarVehiculo(double id){
                int i;
                Vehiculo save = null;
                for (i=0; i<V.size(); i++){
                        if(id == V.get(i).getId()){
                                System.out.println(V.get(i).getId());
                                System.out.println(V.get(i).getMarca());
                                System.out.println(V.get(i).getModelo());
                                System.out.println(V.get(i).getAño());
                                System.out.println(V.get(i).getMotor());
                                System.out.println(V.get(i).getKilometraje());
                                System.out.println(V.get(i).getColor());
                                System.out.println(V.get(i).getPrecio());
                                /*guardarVehiculo = V.get(i);*/
                                save = V.get(i);
                        }
                }
                return save;
        }
        
        static public double impuesto(double id){
        	double precio = 0;
    		double total = 0;
    		for (Iterator iterator = V.iterator(); iterator.hasNext();){
    			Vehiculo vehiculoLista = (Vehiculo) iterator.next();
                if (vehiculoLista.getId() == id){
                	if (vehiculoLista.getAño() < 2005){
            			precio = precio + (vehiculoLista.getPrecio()*0.005);
            		}
            		else if(vehiculoLista.getAño()>= 2005){
            			precio = precio + (vehiculoLista.getPrecio()*0.01);
            		}
            		else if(vehiculoLista.getKilometraje() >= 150000){
            			precio = precio + (vehiculoLista.getPrecio()*0.005);
            		}
            		else if(vehiculoLista.getKilometraje() < 150000){
            			precio = precio + (vehiculoLista.getPrecio()*0.01);
            		}
            		else if(vehiculoLista.getMotor() > 4.0){
            			precio = precio + (vehiculoLista.getPrecio()*0.05);
            		}
            		else if(vehiculoLista.getPrecio() > 200000){
            			precio = precio + (vehiculoLista.getPrecio()*0.03);
            		}
                }
                
    		}
    		
    		
    		total = precio/12;
    		return total;
    		/*System.out.println("El valor mensual del impuesto es de: "+total);*/
        }
        
        static public boolean efectuarVenta(double id){
        	boolean save = false;
        	for (Iterator iterator = V.iterator(); iterator.hasNext();){
    			Vehiculo vehiculoLista = (Vehiculo) iterator.next();
                if (vehiculoLista.getId() == id){
                	vehiculoLista.setVendido(true);
                	save = true;
                }
        	}
        	return save;
        }
       
        static public void guardarVenta(Venta venta) {
               
                S.add(venta);
        }
 
       
        static public boolean saveOrInsertVenta(Venta venta){
            boolean save = false;
        	for (Iterator iterator = S.iterator(); iterator.hasNext();) {
                Venta ventaLista = (Venta) iterator.next();
                if (ventaLista.getId() == venta.getId()) {
                		ventaLista.setId(venta.getId());
                		ventaLista.setMonto(venta.getMonto());
                		ventaLista.setIdVenta(venta.getIdVenta());
                		ventaLista.setIdCliente(venta.getIdCliente());
                		
                        save = true;
                }
             
        }
        	
            return save;
        		
        }
       
        static public boolean eliminarVenta(double id){
                int i;
                boolean save = false;
                for (i=0; i<S.size(); i++){
                        if(id == S.get(i).getId()){
                                S.remove(i);
                                save = true;
                        }
                }
                
                return save;
        }
}
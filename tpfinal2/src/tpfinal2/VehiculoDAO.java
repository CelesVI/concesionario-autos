package tpfinal2;

import tpfinal2.Vehiculo;
import java.util.*;


public class VehiculoDAO {

	public boolean guardarVehiculo(double id, String marca, String modelo, int año, double motor, double kilometraje, String color, double precio){
		Vehiculo vehiculo = new Vehiculo(id, marca, modelo, año, motor, kilometraje, color, precio);
		ProgramaDB.guardarVehiculo(vehiculo);
		return true;
	}
	
	public boolean saveOrInsert(double id, String marca, String modelo, int año, double motor, double kilometraje, String color, double precio){
		
		
			Vehiculo vehiculo = new Vehiculo(id, marca, modelo, año, motor, kilometraje, color, precio);
			
			return ProgramaDB.saveOrUpdate(vehiculo);
			
			
		}
	
	public boolean eliminarVehiculo(double id){
		return ProgramaDB.eliminarVehiculo(id);
	}
	
	public Vehiculo buscarVehiculo(double id){
		return ProgramaDB.buscarVehiculo(id);
	}
	
	public double impuesto(double id){
		return ProgramaDB.impuesto(id);
	}
	
	public boolean efectuarVenta(double id){
		return ProgramaDB.efectuarVenta(id);
	}
}



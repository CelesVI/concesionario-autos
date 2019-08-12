package tpfinal2;

import tpfinal2.*;

public class VentaDAO {
	
	public boolean guardarVenta(double id, double monto, double idv, double idc){
		Venta venta = new Venta(id, monto, idv, idc);
		ProgramaDB.guardarVenta(venta);
		return true;
	}
	
	public boolean saveOrInsertVenta(double id, double monto, double idv, double idc){
		
		
		Venta venta = new Venta(id, monto, idv, idc);
		
		return ProgramaDB.saveOrInsertVenta(venta);
		
		
	}

	public boolean eliminarVenta(double id){
		return ProgramaDB.eliminarVenta(id);
	}

}

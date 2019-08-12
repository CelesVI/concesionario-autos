package tpfinal2;



import tpfinal2.*;

public class Utilitario extends Vehiculo{
	
	static double CAPCARGA = 500;
	static String TIPO = "Camioneta";
	
	private double capCarga = CAPCARGA;
	private String tipo = TIPO;
	
	public Utilitario(){}
	
	public Utilitario(double id,String marca ,String modelo, int año, double motor, double kilometraje, String color, double precio, double capCarga, String tipo){
		super(id, marca , modelo, año, motor, kilometraje, color, precio );
		this.capCarga = capCarga;
		this.tipo = tipo;
	}
	
	/*public void impuesto(double a, double b, double c, double d){
		double precio = 0;
		double total = 0;
		if (a< 2005){
			precio = precio + (getPrecio()*0.005);
		}
		else if(a>= 2005){
			precio = precio + (getPrecio()*0.01);
		}
		else if(b >= 150000){
			precio = precio + (getPrecio()*0.005);
		}
		else if(b < 150000){
			precio = precio + (getPrecio()*0.01);
		}
		else if(c > 4.0){
			precio = precio + (getPrecio()*0.05);
		}
		else if(d > 200000){
			precio = precio + (getPrecio()*0.03);
		}
		else if(d > 1000){
			precio = precio + (getPrecio()*0.005);
		}
		total = precio/12;
		System.out.println("El valor mensual del impuesto es de: "+total);
	}*/

	public double getCapCarga() {
		return capCarga;
	}

	public void setCapCarga(double capCarga) {
		this.capCarga = capCarga;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}

package tpfinal2;

import tpfinal2.*;

public class Auto extends Vehiculo {
	
	static int CANTPUERTAS = 3;
	static int CAPBAUL = 40;
	
	private int cantPuertas = CANTPUERTAS;
	private int capBaul = CAPBAUL;
	
	public Auto() {};
	
	public Auto(double id,String marca ,String modelo, int año, double motor, double kilometraje, String color, double precio, int puertas, int capacidad){
		super(id,marca ,modelo , año , motor, kilometraje , color , precio);
		this.cantPuertas = puertas;
		this.capBaul = capacidad;
	}
	
	/*public void impuesto(double a, double b, double c){
		double precio = 0;
		double total = 0;
		if (a < 2005){
			precio = precio + (getPrecio()*0.005);
		}
		else if(a>= 2005){
			precio = precio + (getPrecio()*0.01);
		}
		else if(b >= 150000){
			precio = precio + (getPrecio()*0.005);
		}
		else if(c < 150000){
			precio = precio + (getPrecio()*0.01);
		}
		else if(c > 4.0){
			precio = precio + (getPrecio()*0.05);
		}
		else if(c > 200000){
			precio = precio + (getPrecio()*0.03);
		}
		
		total = precio/12;
		System.out.println("El valor mensual del impuesto es de: "+total);
	}*/

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}

	public int getCapBaul() {
		return capBaul;
	}

	public void setCapBaul(int capBaul) {
		this.capBaul = capBaul;
	}

	
		

}
	
	


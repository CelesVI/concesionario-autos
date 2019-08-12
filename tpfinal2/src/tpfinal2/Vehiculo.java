package tpfinal2;

import java.io.Serializable;
import java.sql.*;
import tpfinal2.*;

public class Vehiculo implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*static double ID = 0000;
	static String MARCA = "FORD";
	static String MODELO = "FALCON";
	static int AÑO = 1972;
	static double MOTOR = 3.0;
	static double KILOMETRAJE = 150000;
	static String COLOR = "AZUL";
	static double PRECIO = 25000;
	static boolean VENDIDO = false;*/
	
	
	private double id;/* = ID;*/
	private String marca; /*= MARCA;*/
	private String modelo; /*= MODELO;*/
	private int año; /*= AÑO;*/
	private double motor; /*= MOTOR;*/
	private double kilometraje; /*= KILOMETRAJE;*/
	private String color; /*= COLOR;*/
	private double precio; /*= PRECIO;*/
	private boolean vendido; /*= VENDIDO;*/
	
	
	public Vehiculo() {};
	
	public Vehiculo(double id, String marca ,String modelo, int año, double motor, double kilometraje, String color, double precio){
		this.id=id;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.motor = motor;
		this.kilometraje = kilometraje;
		this.color = color;
		this.precio = precio;
		this.vendido = vendido;
		
	}
	
	/*public void impuesto(double a, double b, double c, double d){
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
		else if(b < 150000){
			precio = precio + (getPrecio()*0.01);
		}
		else if(c > 4.0){
			precio = precio + (getPrecio()*0.05);
		}
		else if(d > 200000){
			precio = precio + (getPrecio()*0.03);
		}
		
		total = precio/12;
		System.out.println("El valor mensual del impuesto es de: "+total);
	}*/

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	
}

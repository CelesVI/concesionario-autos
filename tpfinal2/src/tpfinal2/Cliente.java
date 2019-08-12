package tpfinal2;

import java.util.Scanner;

import tpfinal2.*;

public class Cliente {
	
	static String NOMBRE = "Pepe";
	static String APELLIDO = "Argento";
	static double DNI = 11222333;
	
	private String nombre = NOMBRE;
	private String apellido = APELLIDO;
	private double dni = DNI;
	
	public Cliente(){};
	
	public Cliente(String nombre, String apellido, double dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getDni() {
		return dni;
	}

	public void setDni(double dni) {
		this.dni = dni;
	}
	
	
}

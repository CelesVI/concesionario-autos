package tpfinal2;

import tpfinal2.*;

public class Venta {

	static double ID = 0000;
	static double MONTO = 60000;
	static double IDVENTA = 1111;
	static double IDCLIENTE = 11222333;

	private double id = ID;
	private double monto = MONTO;
	private double idVenta = IDVENTA;
	private double idCliente = IDCLIENTE;
	
	public Venta(){};
	
	public Venta(double id, double monto, double idv, double idc){
		this.id=id;
		this.monto=monto;
		this.idCliente= idc;
		this.idVenta=idv;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public double getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(double idVenta) {
		this.idVenta = idVenta;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(double idCliente) {
		this.idCliente = idCliente;
	}
}

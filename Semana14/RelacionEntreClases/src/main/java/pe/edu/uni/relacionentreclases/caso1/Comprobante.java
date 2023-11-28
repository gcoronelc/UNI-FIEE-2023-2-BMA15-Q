package pe.edu.uni.relacionentreclases.caso1;

import java.util.ArrayList;
import java.util.List;

public class Comprobante {

	private int nro;
	private String cliente;
	private double importe;
	private double impuesto;
	private double total;
	private List<Item> detalle;

	public Comprobante() {
		detalle = new ArrayList<>();
	}

	public Comprobante(int nro, String cliente, double importe, double impuesto, double total) {
		this.nro = nro;
		this.cliente = cliente;
		this.importe = importe;
		this.impuesto = impuesto;
		this.total = total;
		this.detalle = new ArrayList<>();
	}
	
	public Comprobante(int nro, String cliente, double importe, double impuesto, double total, List<Item> detalle) {
		this.nro = nro;
		this.cliente = cliente;
		this.importe = importe;
		this.impuesto = impuesto;
		this.total = total;
		this.detalle = detalle;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Item> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<Item> detalle) {
		this.detalle = detalle;
	}

	
	
	
}

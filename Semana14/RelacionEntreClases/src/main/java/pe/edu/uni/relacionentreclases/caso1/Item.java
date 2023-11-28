package pe.edu.uni.relacionentreclases.caso1;

public class Item {

	private String producto;
	private double precio;
	private int cantidad;
	private double subtotal;
	private Comprobante comprobante;

	public Item() {
	}

	public Item(String producto, double precio, int cantidad, double subtotal) {
		this.producto = producto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.comprobante = null;
	}

	public Item(String producto, double precio, int cantidad, double subtotal, Comprobante comprobante) {
		this.producto = producto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.comprobante = comprobante;
	}
	
	

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Comprobante getComprobante() {
		return comprobante;
	}

	public void setComprobante(Comprobante comprobante) {
		this.comprobante = comprobante;
	}

	
}

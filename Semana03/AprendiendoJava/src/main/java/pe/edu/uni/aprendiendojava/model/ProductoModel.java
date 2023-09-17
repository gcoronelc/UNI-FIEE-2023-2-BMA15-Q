package pe.edu.uni.aprendiendojava.model;

/**
 *
 * @author Gustavo Coronel
 */
public class ProductoModel {

	/**
	 * Variables
	 */
	private int codigo;
	private String nombre;
	private int stock;
	private double precio;
	private boolean activo;

	public ProductoModel() {
		this.codigo = 80;
		this.nombre = "Televisor";
		this.stock = 100;
		this.precio = 4768.99;
		this.activo = true;
		System.out.println("Objeto creado.");
	}

	public ProductoModel(int codigo, String nombre, int stock, double precio, boolean activo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
		this.activo = activo;
	}

	@Override
	protected void finalize() throws Throwable {
		System.err.println("Chau objeto.");
	}
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}

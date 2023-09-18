package pe.edu.uni.ventaapp.dto;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaDto {

	// Datos
	private double precio;
	private int cantidad;
	// Reporte
	private double importe;
	private double impuesto;
	private double total;

	public VentaDto() {
	}

	public VentaDto(double precio, int cantidad) {
		this.precio = precio;
		this.cantidad = cantidad;
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

}

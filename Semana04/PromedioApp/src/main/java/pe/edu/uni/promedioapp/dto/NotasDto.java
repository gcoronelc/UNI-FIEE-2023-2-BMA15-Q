package pe.edu.uni.promedioapp.dto;

/**
 *
 * @author Gustavo Coronel
 */
public class NotasDto {

	// Datos
	private int promPracticas;
	private int exaParcial;
	private int exaFinal;
	private String sistema;
	// Reporte
	private double promFinal;
	private String condicion;

	/**
	 * Constructor por defecto.
	 */
	public NotasDto() {
	}

	public NotasDto(int promPracticas, int exaParcial, int exaFinal, String sistema) {
		this.promPracticas = promPracticas;
		this.exaParcial = exaParcial;
		this.exaFinal = exaFinal;
		this.sistema = sistema;
	}

	public int getPromPracticas() {
		return promPracticas;
	}

	public void setPromPracticas(int promPracticas) {
		this.promPracticas = promPracticas;
	}

	public int getExaParcial() {
		return exaParcial;
	}

	public void setExaParcial(int exaParcial) {
		this.exaParcial = exaParcial;
	}

	public int getExaFinal() {
		return exaFinal;
	}

	public void setExaFinal(int exaFinal) {
		this.exaFinal = exaFinal;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public double getPromFinal() {
		return promFinal;
	}

	public void setPromFinal(double promFinal) {
		this.promFinal = promFinal;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

}

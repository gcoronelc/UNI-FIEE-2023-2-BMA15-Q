package pe.edu.uni.proyecto2_quispe.service;

public class Ecuacion {

	// Coeficientes
	private double a;
	private double b;
	private double c;
	// Propiedad de la ecuación
	private boolean raicesReales;
	private double discriminante;

	public Ecuacion(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		discriminante = b * b - 4 * a * c;
		raicesReales = (discriminante >= 0);
	}

	public String tipoDeRaices() {
		if (raicesReales) {
			return "Tiene raíces reales.";
		}
		return "No tiene raíces reales.";
	}

	public double[] getRaices() {
		// Variable arreglo
		double[] raices = new double[2];
		// Proceso
		if (raicesReales) {
			raices[0] = (-b + Math.sqrt(discriminante)) / (double) (2 * a);
			raices[1] = (-b - Math.sqrt(discriminante)) / (double) (2 * a);
		} else {
			raices[0] = raices[1] = 0;
		}
		// Reporte
		return raices;
	}

	public boolean sonRaicesReales() {
		return raicesReales;
	}
}

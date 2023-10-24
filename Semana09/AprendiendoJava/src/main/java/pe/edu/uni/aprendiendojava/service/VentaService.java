package pe.edu.uni.aprendiendojava.service;

public class VentaService {

	private static final double IGV;

	static {
		IGV = 0.18;
	}

	private VentaService() {
	}

	public static double calcImpuesto(double baseImponible) {
		return baseImponible * IGV;
	}
}

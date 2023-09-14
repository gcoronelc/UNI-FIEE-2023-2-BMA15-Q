package pe.edu.uni.proyectopunto.service;

import java.util.Random;

public class PuntoService {

	// Variables privadas
	private int x;
	private int y;

	/**
	 * Constructor por defecto.
	 */
	public PuntoService() {
		Random random = new Random();
		this.x = random.nextInt(50) * (random.nextInt(50) % 2 == 1 ? +1 : -1);
		this.y = random.nextInt(50) * (random.nextInt(50) % 2 == 1 ? +1 : -1);
	}

	/**
	 * Constructor adicional.
	 *
	 * @param x Coordenada en el eje X.
	 * @param y Coordenada en el eje Y.
	 */
	public PuntoService(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Retorna el valor de x.
	 *
	 * @return Retorna el valor de x.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Retorn el valor de y.
	 *
	 * @return Retorn el valor de y.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Determina el cuadrante en el que se encuentra el punto.
	 *
	 * @return Retorna el cuadrante, por ejemplo "Primer Cuadrante".
	 */
	public String getCuadrante() {
		String rpta;
		// Inicio del proceso
		rpta = "No se puede determinar.";
		rpta = (x > 0 && y > 0) ? "Primer cuadrante" : rpta;
		rpta = (x < 0 && y > 0) ? "Segundo cuadrante" : rpta;
		rpta = (x < 0 && y < 0) ? "Tercer cuadrante" : rpta;
		rpta = (x > 0 && y < 0) ? "Cuarto cuadrante" : rpta;
		// Fin del proceso
		return rpta;
	}

	/**
	 * Determina la distancia del punto al centro de coordenadas.
	 *
	 * @return Retorna la distancia.
	 */
	public double getDistancia() {
		double distancia;
		//Inicio de proceso
		distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		//Fin del proceso
		return distancia;
	}

}

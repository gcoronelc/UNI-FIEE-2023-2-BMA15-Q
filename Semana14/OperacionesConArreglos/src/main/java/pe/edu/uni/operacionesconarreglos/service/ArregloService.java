package pe.edu.uni.operacionesconarreglos.service;

import java.util.Random;

/**
 *
 * @author PROFESOR
 */
public class ArregloService {
	
	// Variables
	private int n;
	private int[] arreglo1;
	private int[] arreglo2;

	public ArregloService(int n) {
		this.n = n;
		generarArreglos();
	}

	private void generarArreglos() {
		arreglo1 = generarArreglo();
		arreglo2 = generarArreglo();
	}

	private int[] generarArreglo() {
		// Variables
		int[] arreglo = new int[n];
		Random random = new Random();
		//Proceso
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = random.nextInt(10) + 10;
		}
		// Reporte
		return arreglo;
	}

	public int[] getArreglo1() {
		return arreglo1;
	}

	public int[] getArreglo2() {
		return arreglo2;
	}
	
	
	public int[][] obtenerElementosIguales(){
		// Cantidad de elementos iguales
		int elemIguales = 0;
		for (int i = 0; i < arreglo1.length; i++) {
			elemIguales += (arreglo1[i]==arreglo2[i]?1:0);
		}
		// Creando la matriz
		int matriz[][] = new int[elemIguales][2];
		int fila=0;
		for (int i = 0; i < arreglo1.length; i++) {
			if (arreglo1[i]==arreglo2[i]){
				matriz[fila][0] = i;
				matriz[fila][1] = arreglo1[i];
				fila++;
			}
		}
		// Reporte
		return matriz;
	}
	
	public int[] productoVectores(){
		int[] arreglo3 = new int[n];
		for (int i = 0; i < n; i++) {
			arreglo3[i] = arreglo1[i] * arreglo2[i];
		}
		return arreglo3;
	}
	

}

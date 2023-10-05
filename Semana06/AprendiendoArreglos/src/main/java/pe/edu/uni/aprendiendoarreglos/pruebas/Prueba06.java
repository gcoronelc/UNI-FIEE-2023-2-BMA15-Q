package pe.edu.uni.aprendiendoarreglos.pruebas;

import java.util.Arrays;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba06 {

	public static void main(String[] args) {

		int[] arreglo = {43, 65, 12, 78, 18, 23, 98};
		
		// Ordenar el arreglo
		pintarArreglo(arreglo);
		//ordenar1(arreglo);
		Arrays.sort(arreglo);
		pintarArreglo(arreglo);
		System.out.println("Suma: " + sumaArreglo(arreglo));
		System.out.println("Suma: " + Arrays.stream(arreglo).sum());
		System.out.println("Suma pares: " 
				  + Arrays.stream(arreglo).filter(x->x%2==0).sum());
		System.out.println("Suma impares: " 
				  + Arrays.stream(arreglo).filter(x->x%2==1).sum());
	}

	private static void ordenar1(int[] arreglo) {
		for (int i = 0; i < (arreglo.length-1); i++) {
			for (int j = i+1; j < arreglo.length; j++) {
				if(arreglo[i]>arreglo[j]){
					int temp = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temp;
				}
			}
		}
	}

	private static void pintarArreglo(int[] arreglo) {
		System.out.print("Arreglo: ");
		for (int dato : arreglo) {
			System.out.print(dato + " ");
		}
		System.out.println("");
	}

	private static int sumaArreglo(int[] arreglo) {
		int suma = 0;
		for (int dato : arreglo) {
			suma += dato;
		}
		return suma;
	}

}

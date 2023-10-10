package pe.edu.uni.aprendiendoarreglos.pruebas;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

	public static void main(String[] args) {

		int[] arreglo1 = {43, 65, 78, 23, 98};

		int[] arreglo2;
		arreglo2 = new int[]{76,43,87,34,98,23};

		int[] arreglo = arreglo1;

		System.out.println("Suma: " + (arreglo[1] + arreglo[2]));

		for (Object dato : arreglo) {
			System.out.println(dato);
		}

		System.out.println("---------------");

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}

	}

}

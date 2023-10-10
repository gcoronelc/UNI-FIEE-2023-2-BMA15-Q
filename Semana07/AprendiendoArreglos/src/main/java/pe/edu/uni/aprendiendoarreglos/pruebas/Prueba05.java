package pe.edu.uni.aprendiendoarreglos.pruebas;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

	public static void main(String[] args) {

		int[][] matriz = {
			{45,23},
			{87,34,89,23,43,76,23},
			{65,78,23,54},
			{21,45,87,23,45}
		};
		
		// Filas
		for (int i = 0; i < matriz.length; i++) {
			String fila = "";
			for (int j = 0; j < matriz[i].length; j++) {
				int dato = matriz[i][j];
				fila += dato + "\t";
			}
			System.out.println(fila);
		}
		
		
		// Caso 2
		System.out.println("----------------------");
		for (int[] vector : matriz) {
			String fila = "";
			for (int j = 0; j < vector.length; j++) {
				int dato = vector[j];
				fila += dato + "\t";
			}
			System.out.println(fila);
		}
		
		
	}

}

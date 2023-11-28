package pe.edu.uni.operacionesconarreglos.prueba;

import pe.edu.uni.operacionesconarreglos.service.ArregloService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

    public static void main(String[] args) {
        // Datos
		  int n = 10;
		  // Proceso
		  ArregloService service = new ArregloService(n);
		  int[] arreglo1 = service.getArreglo1();
		  int[] arreglo2 = service.getArreglo2();
		  int[] arreglo3 = service.productoVectores();
		  int[][] matriz = service.obtenerElementosIguales();
		  // Reporte
		  printArray("Arreglo 1: ", arreglo1);
		  printArray("Arreglo 2: ", arreglo2);
		  printArray("Arreglo 3: ", arreglo3);
		  printElementosIguales(matriz);
    }

	private static void printArray(String titulo, int[] arreglo) {
		System.out.print(titulo);
		for (int i : arreglo) {
			System.out.print(i + ",");
		}
		System.out.println("");
	}

	private static void printElementosIguales(int[][] matriz) {
		System.out.println("ELEMENTOS IGUALES");
		for (int i = 0; i < matriz.length; i++) {
			int indice = matriz[i][0];
			int valor = matriz[i][1];
			System.out.println("Indice: " + indice + "   Valor: " + valor);
		}
	}
	 
	

}

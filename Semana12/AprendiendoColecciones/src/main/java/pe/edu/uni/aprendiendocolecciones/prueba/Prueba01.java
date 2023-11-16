package pe.edu.uni.aprendiendocolecciones.prueba;

import java.util.Arrays;
import java.util.List;
import pe.edu.uni.aprendiendocolecciones.service.GestionListas;

public class Prueba01 {

	public static void main(String[] args) {

		// Creaciones del service
		GestionListas bean = new GestionListas(10);
		List<Integer> lista1 = bean.getLista1();
		List<Integer> lista2 = bean.getLista2();
		List<Integer> diferencia = bean.getDiferencia();
		List<Integer> comun = bean.getComun();

		// Reportes
		mostrarLista("LISTA 1: ", lista1);
		mostrarLista("LISTA 2: ", lista2);
		mostrarLista("DIFERENCIA: ", diferencia);
		mostrarLista("COMUN: ", comun);

	}

	private static void mostrarLista(String etiqueta, List<Integer> lista) {
		System.out.print(etiqueta);
		System.out.println(Arrays.toString(lista.toArray()));
	}

}

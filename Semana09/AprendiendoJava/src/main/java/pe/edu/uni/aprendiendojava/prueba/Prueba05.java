package pe.edu.uni.aprendiendojava.prueba;

import java.util.Arrays;

public class Prueba05 {

	public static void main(String[] args) {
		
		String[] frutas = {
			"Pera",
			"manzana",
			"piña",
			"Maraculla",
			"Naranja",
			"Platano",
			"fResa"
		};

		int tamanio = frutas.length;
		for (int i = 0; i < (tamanio - 1); i++) {
			for (int j = i+1; j < tamanio; j++) {
				if(frutas[i].compareTo(frutas[j]) > 0){
					String temp = frutas[i];
					frutas[i] = frutas[j];
					frutas[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(frutas));
		
	}

}

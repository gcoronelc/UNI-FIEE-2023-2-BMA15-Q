package pe.edu.uni.ejemplopila.ejemplo;

import java.util.Stack;
import pe.edu.uni.ejemplopila.model.Libro;

public class Ejemplo02 {
	
	
	public static void main(String[] args) {
		
		Stack<Libro> pilaNombres = new Stack<>();
		
		System.out.println("Tamaño: " + pilaNombres.size());
		
		pilaNombres.push(new Libro("Java a Fondo", "Trini Castillo"));
		pilaNombres.push(new Libro("Programacion como debe ser.", ""));
		pilaNombres.push(new Libro("El Sutil Arte de que te Importe un Carajo", "Mark Manson"));
		pilaNombres.push(new Libro("Todo está jodido", "Mark Manson"));
		pilaNombres.push(new Libro("Lenguaje Java", "Gustavo Coronel"));
		
		
		System.out.println("Tamaño: " + pilaNombres.size());
		
		System.out.println("\n\nPILA:");
		while(!pilaNombres.empty()){
			System.out.println(pilaNombres.pop());
		}
		
				  
	}

}

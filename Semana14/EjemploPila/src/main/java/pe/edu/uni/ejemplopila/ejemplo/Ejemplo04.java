package pe.edu.uni.ejemplopila.ejemplo;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import pe.edu.uni.ejemplopila.model.Libro;

public class Ejemplo04 {
	
	
	public static void main(String[] args) {
		
		Queue<Libro> cola = new PriorityQueue<>();
		
		System.out.println("Tamaño: " + cola.size());
		
		cola.add(new Libro("Java a Fondo", "Trini Castillo"));
		cola.add(new Libro("Programacion como debe ser.", ""));
		cola.add(new Libro("El Sutil Arte de que te Importe un Carajo", "Mark Manson"));
		cola.add(new Libro("Todo está jodido", "Mark Manson"));
		cola.add(new Libro("Lenguaje Java", "Gustavo Coronel"));
		
		
		System.out.println("Tamaño: " + cola.size());
		
		System.out.println("\n\nPILA:");
		while(!cola.isEmpty()){
			System.out.println(cola.poll());
		}
		
				  
	}

}

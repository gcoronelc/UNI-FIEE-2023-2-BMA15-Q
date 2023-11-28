package pe.edu.uni.ejemplopila.ejemplo;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Ejemplo03 {

	public static void main(String[] args) {

		Queue<String> cola = new PriorityQueue<>();

		System.out.println("Tamaño: " + cola.size());

		cola.add("Gustavo");
		cola.add("Eliana");
		cola.add("Fernando");
		cola.add("Angela");
		cola.add("Susana");

		System.out.println("Tamaño: " + cola.size());

		System.out.println("\n\nPILA:");
		while (!cola.isEmpty()) {
			System.out.println(cola.poll());
		}

	}

}

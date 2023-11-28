package pe.edu.uni.ejemplopila.ejemplo;

import java.util.Stack;

public class Ejemplo01 {
	
	
	public static void main(String[] args) {
		
		Stack<String> pilaNombres = new Stack<>();
		
		System.out.println("Tamaño: " + pilaNombres.size());
		
		pilaNombres.push("Gustavo");
		pilaNombres.push("Eliana");
		pilaNombres.push("Fernando");
		pilaNombres.push("Angela");
		pilaNombres.push("Susana");
		
		System.out.println("Tamaño: " + pilaNombres.size());
		
		System.out.println("\n\nPILA:");
		while(!pilaNombres.empty()){
			System.out.println(pilaNombres.pop());
		}
		
				  
	}

}

package pe.edu.uni.ejemplodecola.prueba;

import pe.edu.uni.ejemplodecola.dto.Node;
import pe.edu.uni.ejemplodecola.service.Cola;

public class Prueba04 {

	public static void main(String[] args) {
		Cola cola1 = new Cola();
		cola1.encolar(new Node("Martha", null));
		cola1.encolar(new Node("Carlos", null));
		cola1.encolar(new Node("Susana", null));
		System.out.println("Cola: " + cola1.getCola());
	}
}

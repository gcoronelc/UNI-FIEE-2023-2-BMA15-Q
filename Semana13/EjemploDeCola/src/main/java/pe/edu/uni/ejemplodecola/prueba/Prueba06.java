package pe.edu.uni.ejemplodecola.prueba;

import pe.edu.uni.ejemplodecola.dto.Node;
import pe.edu.uni.ejemplodecola.service.Cola;
import pe.edu.uni.ejemplodecola.service.GestionService;

public class Prueba06 {
	
	public static void main(String[] args) {
		Cola cola1 = new Cola();
		cola1.encolar(new Node("Lima", null));
		cola1.encolar(new Node("Chiclayo", null));
		cola1.encolar(new Node("Arequipa", null));
		cola1.encolar(new Node("Cusco", null));
		Cola cola2 = new Cola();
		cola2.encolar(new Node("Suspiro a la limeña", null));
		cola2.encolar(new Node("King kong", null));
		cola2.encolar(new Node("Queso helado", null));
		cola2.encolar(new Node("Pan chuta", null));
		GestionService service = new GestionService();
		Cola colaUnica = service.juntarColas(cola1, cola2);
		System.out.println("Cola: " + colaUnica.getCola());
	}
}

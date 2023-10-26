package pe.edu.uni.aprendiendojava.prueba;

public class Prueba04 {

	public static void main(String[] args) {
		
		System.out.println("Caso 1: " + "fresa".equals("fresa"));
		System.out.println("Caso 2: " + "fresa".equals("Fresa"));
		System.out.println("Caso 3: " + "fresa".equalsIgnoreCase("Fresa"));
		
		System.out.println("======================");
		System.out.println("Caso 3: " + "fresa".compareTo("fresa"));
		System.out.println("Caso 4: " + "fresas".compareTo("fresaS"));

		
		
		
	}

}

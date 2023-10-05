package pe.edu.uni.aprendiendoarreglos.pruebas;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

    public static void main(String[] args) {
        
		 Object arregloLoco[] = new Integer[5];
		 
		 Integer[] arreglo = (Integer[]) arregloLoco;
		 
		 arreglo[0] = 78;
		 arreglo[1] = 68;
		 arreglo[2] = 50;
		 arreglo[3] = 71;
		 arreglo[4] = 74;
		 
		 System.out.println("Suma: " + (arreglo[1] + arreglo[2]));
		  
		 
		 for (Object dato : arreglo) {
			 System.out.println(dato);
		 }
		 
		 System.out.println("---------------");
		 
		 for (int i = 0; i < arreglo.length; i++) {
			 System.out.println(arreglo[i]);
		 }
		  
    }

}


package pe.edu.uni.proyecto2_quispe.pruebas;

import pe.edu.uni.proyecto2_quispe.service.Ecuacion;

public class Prueba02 {
    
    public static void main(String[] args) {
        // Hallando las raíces de la ecuación
        Ecuacion service = new Ecuacion(1, 1, -1);
        System.out.println("Primera ecuación:");
        double[] raices = service.getRaices();
        System.out.println("x1 = " + raices[0]);
        System.out.println("x2 = " + raices[1]);
        // Cuando no tiene raíces reales
        service = new Ecuacion(1, 0, -4);
        System.out.println("Segunda ecuación:");
        raices = service.getRaices();
        System.out.println("x1 = " + raices[0]);
        System.out.println("x2 = " + raices[1]);
    }
}

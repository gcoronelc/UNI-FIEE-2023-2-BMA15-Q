
package pe.edu.uni.proyecto2_quispe.pruebas;

import pe.edu.uni.proyecto2_quispe.service.Ecuacion;

public class Prueba01 {
    
    public static void main(String[] args) {
        // Caso: Tiene raíces reales
        Ecuacion service = new Ecuacion(1, 1, -1);
        System.out.println("La primera ecuación: " + service.tipoDeRaices());
        // Caso: No tiene raíces reales
        service = new Ecuacion(1, 0, -4);
        System.out.println("La segunda ecuación: " + service.tipoDeRaices());
    }
}

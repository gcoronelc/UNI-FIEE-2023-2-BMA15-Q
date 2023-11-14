
package pe.edu.uni.proyecto1_quispe.pruebas;

import pe.edu.uni.proyecto1_quispe.service.TrianguloIsosceles;

public class Prueba02 {
    
    public static void main(String[] args) {
        // Triángulo inválido
        TrianguloIsosceles figura = new TrianguloIsosceles(-1, 2);
        System.out.println("Condición: " + figura.esValido());
        // Cálculo de área y perímetro
        System.out.println("--------------------");
        figura = new TrianguloIsosceles(6, 4);
        System.out.println("Triángulo válido: " + figura.esValido());
        System.out.println("Perímetro: " + figura.calcularPerimetro());
        System.out.println("Área: " + figura.calcularArea());
    }
}

package pe.edu.uni.aprendiendocolecciones.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GestionListas {

	private List<Integer> lista1;
	private List<Integer> lista2;

	public GestionListas(int n) {
		lista1 = generaLista(n);
		lista2 = generaLista(n);
	}

	public List<Integer> getLista1() {
		return lista1;
	}

	public List<Integer> getLista2() {
		return lista2;
	}
	
	public List<Integer> getDiferencia(){
		Set<Integer> diferencia = new HashSet<>();
		for(Integer dato1: lista1){
			int cont = 0;
			for(Integer dato2: lista2){
				if(dato1.intValue()==dato2.intValue()){
					cont++;
					break;
				}
			}
			if(cont == 0){
				diferencia.add(dato1);
			}
		}
		return new ArrayList<>(diferencia);
	}
	
	
	public List<Integer> getComun(){
		Set<Integer> set1 = new HashSet<>(lista1);
		Set<Integer> set2 = new HashSet<>(lista2);
		set1.retainAll(set2);
		return new ArrayList<>(set1);
	}
	
	// Metodos privados
	private List<Integer> generaLista(int n) {
		List<Integer> lista = new ArrayList<>();
		Random rnd = new Random();
		for (int i = 1; i < n; i++) {
			lista.add(rnd.nextInt(20) + 10);
		}
		return lista;
	}

}

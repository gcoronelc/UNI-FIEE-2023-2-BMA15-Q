package pe.edu.uni.ejemplodecola.service;

import pe.edu.uni.ejemplodecola.dto.Node;

public class GestionService {
	
	public Cola juntarColas(Cola cola1, Cola cola2){
		Cola colaUnica = new Cola();
		adjuntarCola(colaUnica, cola1);
		adjuntarCola(colaUnica, cola2);
		return colaUnica;
	}

	private void adjuntarCola(Cola colaUnica, Cola cola) {
		Node aux;
		aux = cola.desencolar();
		while(aux != null) {
			colaUnica.encolar(aux);
			aux = cola.desencolar();
		}
	}

}

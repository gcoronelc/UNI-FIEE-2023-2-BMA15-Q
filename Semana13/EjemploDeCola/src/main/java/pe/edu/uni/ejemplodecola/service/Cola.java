package pe.edu.uni.ejemplodecola.service;

import pe.edu.uni.ejemplodecola.dto.Node;

public class Cola {

	private int longitud;
	private Node cabecera;
	private Node cola;

	public Cola() {
		cabecera = null;
		cola = null;
		longitud = 0;
	}

	public int getLongitud() {
		return longitud;
	}

	public String getCola() {
		if (cabecera == null) {
			return "[]";
		}
		String repo = "[ " + cabecera.getDato();
		Node temp = cabecera.getSiguiente();
		while (temp != null) {
			repo += " -> " + temp.getDato();
			temp = temp.getSiguiente();
		}
		repo += " ]";
		return repo;
	}

	public void encolar(Node nodo) {
		longitud++;
		nodo.setSiguiente(null); // por que va al final
		if (cabecera == null) { // Primer elemento de la cola
			cabecera = nodo;
			cola = nodo;
			return;
		}
		// Cuando no esta vacio
		cola.setSiguiente(nodo);
		cola = nodo;
	}

	public Node desencolar() {
		if(cabecera==null){
			return null;
		}
		longitud--;
		Node aux = cabecera;
		cabecera = aux.getSiguiente();
		aux.setSiguiente(null);
		if (cabecera == null) {
			cola = null;
		}
		return aux;
	}

}

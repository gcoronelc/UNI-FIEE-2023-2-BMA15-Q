package pe.edu.uni.ejemplodecola.dto;

public class Node {

	private String dato;
	private Node siguiente;

	public Node() {
	}

	public Node(String dato, Node siguiente) {
		this.dato = dato;
		this.siguiente = siguiente;
	}

	public Node(String dato) {
		this.dato = dato;
		this.siguiente = null;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public Node getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Node siguiente) {
		this.siguiente = siguiente;
	}

}

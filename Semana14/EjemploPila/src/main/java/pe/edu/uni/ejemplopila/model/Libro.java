package pe.edu.uni.ejemplopila.model;

public class Libro implements Comparable<Libro>{

	private String titulo;
	private String autor;

	public Libro() {
	}

	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		String texto = "['titulo':'" + titulo + "', 'autor':'" + autor + "']";
		return texto;
	}

	@Override
	public int compareTo(Libro t) {
		return t.getTitulo().compareTo(titulo) * (-1);
	}

}

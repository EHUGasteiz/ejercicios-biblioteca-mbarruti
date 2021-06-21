
package biblioteteca;

import java.util.ArrayList;
import java.util.List;
import  java.util.Collections;

public class Libro {
	private String isbn;
	private String titulo;
	private int anyoPublicacion;
	private String genero;
	private List<String> autores;
	
	
	public Libro(String pIsbn, String pTitulo, int pAnyoPublicacion, String pGenero, List<String> pAutores) {
		isbn = pIsbn;
		titulo = pTitulo;
		anyoPublicacion = pAnyoPublicacion;
		genero = pGenero;
		autores = new ArrayList<>(pAutores); // O Collections.unmodifiableList(pAutores) si no se admite añadir autores
	}


	public String getIsbn() {
		return isbn;
	}


	public String getTitulo() {
		return titulo;
	}


	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}


	public String getGenero() {
		return genero;
	}


	public List<String> getAutores() {
		return Collections.unmodifiableList(autores);
	}
	
}

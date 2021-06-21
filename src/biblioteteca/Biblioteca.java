package biblioteteca;

import static java.util.Comparator.comparing;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Biblioteca {
	private static Biblioteca mBiblioteca = new Biblioteca();
	private List<Libro> listaLibros;

	private Biblioteca() {
		listaLibros = new ArrayList<>();
	}

	public static Biblioteca getBiblioteca() {
		return mBiblioteca;
	}

	public void addLibro(Libro pLibro) {
		listaLibros.add(pLibro);
	}
	
	/**
	 * getPublicacionesPorAutor
	 * @return devuelve un mapa (diccionario) que para cada autor, indica el número de libros escritos
	 */
	public Map<String, Long> getPublicacionesPorAutor() {
		// TODO: Ejercicio 1
		return null;
	}
	
	/**
	 * getAutorMasProlifico
	 * @return el autor que más libros ha escrito. 
     * @throws NuSuchElementException si la lista de libros es vacía
	 */
	public String getAutorMasProlifico() {
		// TODO: Ejercicio 2
		return null;
	}
	
   /**
    * getAutorMasProlificoYNumPublicaciones
    * @return Un Optional que, si la lista de libros no es vacia, contiene el autor más prolifico y
    *     el número de libros escritos. Si la lista de libros es vacio, el optional está vacio
    */
	public Optional<Entry<String, Long>> getAutorMasProlificoYNumPublicaciones() {
		// TODO: Ejercicio 3
		return null;
	}

	/**
	 * getPublicacionesAutorSoloYVarios
	 * @return un diccionario que indica el número de libros escritos por un autor (true) y 
	 * el número de libros con varios autores (false)
	 */
	public Map<Boolean, Long> getPublicacionesAutorSoloYVarios() {
		// TODO: Ejercicio 4
		return null;
	}
	
	/**
	 * getHistogramaPorAnyoYGenero
	 * @return Devuelve un mapa que por cada año, contiene la distribución de libros por genero.
	 */
	public Map<Integer, Map<String, Long>> getHistogramaPorAnyoYGenero() {
		// TODO: Ejercicio 5
		return null;
	}

	

	


	

}

package biblioteteca;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Biblioteca biblioteca = Biblioteca.getBiblioteca();

		// Añadir libros
		biblioteca.addLibro(new Libro("isbn1", "Título 1", 2018, "Misterio", List.of("Autor1", "Autor2")));
		biblioteca.addLibro(new Libro("isbn2", "Título 2", 2018, "Misterio", List.of("Autor1", "Autor3")));
		biblioteca.addLibro(new Libro("isbn3", "Título 3", 2019, "Misterio", List.of("Autor4")));
		biblioteca.addLibro(new Libro("isbn4", "Título 4", 2019, "Historia", List.of("Autor5", "Autor2")));
		biblioteca.addLibro(new Libro("isbn5", "Título 5", 2019, "Historia", List.of("Autor1", "Autor2")));
		biblioteca.addLibro(new Libro("isbn6", "Título 6", 2020, "Misterio", List.of("Autor1", "Autor6")));
		biblioteca.addLibro(new Libro("isbn7", "Título 7", 2020, "Misterio", List.of("Autor7", "Autor8")));
		biblioteca.addLibro(new Libro("isbn9", "Título 8", 2020, "Acción", List.of("Autor9")));
		biblioteca.addLibro(new Libro("isbn9", "Título 9", 2020, "Ciencia ficción", List.of("Autor10")));

		Map<Integer, Map<String, Long>> histograma = biblioteca.getHistogramaPorAnyoYGenero();
		// Print the results
		System.out.println("Histograma");
		histograma.entrySet().stream().forEach(ProgramaPrincipal::printHistogramEntry);
		
		String autorMasProlifico = biblioteca.getAutorMasProlifico();
		System.out.println(String.format("\nAutor más prolífico: %s", autorMasProlifico));
		
		Optional<Entry<String, Long>> autorMasProlificoYNum = biblioteca.getAutorMasProlificoYNumPublicaciones();
		autorMasProlificoYNum.ifPresent(p -> {System.out.printf("\nAutor más prolífico: %s\tPublicaciones: %d\n", p.getKey(), p.getValue());});
		
		
		
		Map<String,Long> publicacionesPorAutor = biblioteca.getPublicacionesPorAutor();
		System.out.println("\nPublicaciones por autor");
		publicacionesPorAutor.entrySet().stream().forEach(ProgramaPrincipal::printAutorPublicaciones);
		
		Map<Boolean, Long> librosAutorSoloYVarios = biblioteca.getPublicacionesAutorSoloYVarios();
		System.out.println("\nPublicaciones con un solo autor y publicaciones con varios");
		librosAutorSoloYVarios.entrySet().stream().forEach(ProgramaPrincipal::printAutorOVarios);

	}
	
	private static void printHistogramEntry(Map.Entry<Integer, Map<String, Long>> pEntry) {
		System.out.printf("Año: %d\n", pEntry.getKey());
		pEntry.getValue().entrySet().stream().forEach(
				e -> {System.out.printf("\t%s: %d\n", e.getKey(), e.getValue());});
	}
	
	private static void printAutorPublicaciones(Map.Entry<String, Long> pEntry) {
		System.out.printf("Autor: %s\tPublicaciones: %d\n", pEntry.getKey(), pEntry.getValue());
	}
	
	private static void printAutorOVarios(Map.Entry<Boolean, Long> pEntry) {
		System.out.printf("Solo un autor: %s\tPublicaciones: %d\n", pEntry.getKey(), pEntry.getValue());
	}
	
}
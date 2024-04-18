package Ejercicio13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad  implements Estrategia{
	
	public List<Pelicula> sugerirPeliculas(Decodificador d) {
		ArrayList<Pelicula> l = d.getPeliculas();
		return l.stream()
				.sorted((p1,p2) -> p2.getAñoE().compareTo(p1.getAñoE()))
				.collect(Collectors.toList());
	}
}

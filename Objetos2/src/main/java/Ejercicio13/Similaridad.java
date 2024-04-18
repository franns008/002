package Ejercicio13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements Estrategia{
	
	public List<Pelicula> sugerirPeliculas(Decodificador d) {
		ArrayList<Pelicula> l = d.getPeliculasV();
		return l.get(0).getPeliR().stream()
				.sorted((p1,p2) -> p2.getAñoE().compareTo(p1.getAñoE()))
				.collect(Collectors.toList()); /*
				Consultar esto!
				*/
	}
}

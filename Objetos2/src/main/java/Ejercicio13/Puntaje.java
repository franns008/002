package Ejercicio13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements Estrategia{
	public List<Pelicula> sugerirPeliculas(Decodificador d) {
		ArrayList<Pelicula> l = d.getPeliculas();
		return l.stream()
				.sorted((p1,p2) -> Double.compare(p2.getPuntaje(),p1.getPuntaje()))
				.collect(Collectors.toList());
	}
}

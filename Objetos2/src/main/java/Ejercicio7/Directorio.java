package Ejercicio7;

import java.util.*;
import java.time.LocalDate;

public class Directorio extends Dato{
	
	private ArrayList<Dato> datos;
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
			this.datos = new ArrayList<>();
	}
	
	public void agregarDato(Dato d) {
		this.datos.add(d);
	}
	
	public double calcularTamaño() {
		return 32.0 + datos.stream()
		.mapToDouble(d -> d.calcularTamaño()).sum();
	}

	@Override
	public Archivo masGrande() {
		return this.datos.stream()
				.map(d1 -> d1.masGrande()).sorted((d1,d2) -> Double.compare(d2.calcularTamaño(), d1.calcularTamaño()))
				.findFirst()
				.orElse(null);
	}
	
	public Archivo masNuevo() {
		return this.datos.stream()
				.map(d -> d.masNuevo())
				.sorted((d1,d2) -> ChronoUnit.)
	}
}

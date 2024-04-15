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
				.map(d1 -> d1.masGrande())
				.max((d1,d2) -> Double.compare(d1.calcularTamaño(), d2.calcularTamaño()))
				.orElse(null);
	}
	
	public Archivo masNuevo() {
		return this.datos.stream()
				.map(d -> d.masNuevo())
				.sorted((dato1, dato2) -> dato2.getFechaCreacion().compareTo(dato1.getFechaCreacion()))
				.findAny()
				.orElse(null);
	}
	
	public Dato buscarNombre(String n) {
		return this.datos.stream()
				.map(d -> d.buscarNombre(n))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
	}
}
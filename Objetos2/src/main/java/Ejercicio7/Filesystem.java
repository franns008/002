package Ejercicio7;

import java.util.*;
import java.time.*;

public abstract class Filesystem {
	private ArrayList<Dato> datos;
	
	public Filesystem() {
		this.datos = new ArrayList();
	}
	
	public double tamañoOcupado() {
		return this.datos.stream()
				.mapToDouble(d -> d.calcularTamaño())
				.sum();
	}
	
	public Archivo archivoMasGrande() {
		return this.datos.stream()
				.map(d1 -> d1.masGrande()).sorted((d1,d2) -> Double.compare(d2.calcularTamaño(), d1.calcularTamaño()))
				.findFirst()
				.orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return this.datos.stream()
				.map(d1 -> this.masGrande()).sorted((d1,d2) -> Double.compare(d2.calcularTamaño(), d1.calcularTamaño()))
				.findFirst()
				.orElse(null);
	}
	
	public Dato buscar(String nombre) {
		
	}
	
	public String listadoDeContenido() {
		
	}
	
}

package Ejercicio7;

import java.util.*;
import java.util.stream.Collectors;
import java.time.*;

public  class Filesystem {
	private ArrayList<Dato> datos;
	
	public Filesystem() {
		this.datos = new ArrayList();
	}
	
	public void agregarContenido(Dato d) {
		this.datos.add(d);
	}
	
	public double tamañoOcupado() {
		return this.datos.stream()
				.mapToDouble(d -> d.calcularTamaño())
				.sum();
	}
	
	public Archivo archivoMasGrande() {
		return this.datos.stream()
				.map(d1 -> d1.masGrande())
				.max((d1,d2) -> Double.compare(d1.calcularTamaño(), d2.calcularTamaño()))
				.orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return this.datos.stream()
				.map(d -> d.masNuevo())
				.max((dato1, dato2) -> dato1.getFechaCreacion().compareTo(dato2.getFechaCreacion()))
				.orElse(null);
	}
	
	public Dato buscar(String nombre) {
		return this.datos.stream()
				.map(d -> d.buscarNombre(nombre))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
			
	}
	
	public List buscarTodos(String n){
		return this.datos.stream()
				.filter(d -> d.miNombre(n))
				.collect(Collectors.toList());
	}
	
	public String listadoDeContenido() {
		return this.datos.stream()
				.map(d -> d.getNombre())
				.collect(Collectors.joining("\n"));
	}
	
}
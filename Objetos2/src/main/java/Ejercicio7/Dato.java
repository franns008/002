package Ejercicio7;

import java.time.LocalDate;

public abstract class Dato {
	private String nombre;
	private LocalDate fechaCreacion;
	
	public Dato(String nombre, LocalDate fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	public String getNombre() {
		return "/"+this.getNombre();
	}
	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}

	public boolean miNombre(String n) {
		return this.nombre==n;
	}
	
	public abstract double calcularTamaño();
	
	public abstract Archivo masGrande();

	public abstract Archivo masNuevo();
	
	public abstract Dato buscarNombre(String n);
}
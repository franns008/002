package Ejercicio15;

import java.time.LocalDate;
import java.util.List;

class ArchivoConcreto implements Archivo{
	private String nombre;
	private String extension;
	private double tamaño;
	private LocalDate fechaC;
	private LocalDate fechaM;
	private String permisos;
	
	
	
	public ArchivoConcreto(String nombre, String extension, double d, LocalDate fechaC, LocalDate fechaM,
			String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = d;
		this.fechaC = fechaC;
		this.fechaM = fechaM;
		this.permisos = permisos;
	}

	public String prettyPrint() {
		return "Datos del archivo:\n";
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public String getTamaño() {
		return ""+tamaño;
	}

	public String getFechaC() {
		return fechaC.toString();
	}

	public String getFechaM() {
		return fechaM.toString();
	}

	public String getPermisos() {
		return this.permisos;
	}
	
	
}

package Ejercicio7;

import java.time.LocalDate;

public class Archivo extends Dato{
	private double tamaño;

	public Archivo(String nombre, LocalDate fechaCreacion, double tamaño) {
		super(nombre, fechaCreacion);
		this.tamaño = tamaño;
	}
	
	public double calcularTamaño() {
		return this.tamaño;
	}

	@Override
	public Archivo masGrande() {
		// TODO Auto-generated method stub
		return this;
	}
	
	public Archivo masNuevo() {
		return this;
	}
	
}

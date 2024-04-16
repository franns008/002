package Ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private Estado e;
	private String nombre;
	private LocalDate fechaIni;
	private LocalDate fechaFin;
	private String objetivo;
	private double margenG;
	private int numIntegrantes;
	private double montoIntegranteDia;
	
		
	public Proyecto(Estado e, String nombre, LocalDate fechaIni, LocalDate fechaFin, String objetivo, double margenG,
			int numIntegrantes, double montoIntegranteDia) {
		super();
		this.e = new EnConstruccion(this);;
		this.nombre = nombre;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.margenG = margenG;
		this.numIntegrantes = numIntegrantes;
		this.montoIntegranteDia = montoIntegranteDia;
	}
	
	public void cambiarEstado(Estado e) {
		this.e = e;
	}

	public double costoProyecto() {
		return ChronoUnit.DAYS.between(fechaIni, fechaFin) *(this.numIntegrantes*this.montoIntegranteDia);
	}
	
	public void aprobarEtapa() {
		this.e.aprobarEtapa();
	}
	
	public double precioProyecto() {
		return this.costoProyecto()* this.margenG;
	}
	
	public void modificarMargen(double margen) {
		this.e.modificarMargen(margen);;
	}
	
	public void cancelarProyecto() {
		this.e.cancelarProyecto();
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
}

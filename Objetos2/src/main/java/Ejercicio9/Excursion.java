package Ejercicio9;

import java.util.*;
import java.util.stream.Collectors;
import java.time.*;

public class Excursion {
	private String nombre;
	private LocalDate fechaIni;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private ArrayList<Usuario> inscriptos;
	private ArrayList<Usuario> espera;
	private Estado e;
	
	public Excursion(String nombre, LocalDate fechaIni, LocalDate fecaFin, 
			String puntoEncuentro, double costo,int cupoMin, int cupoMax) {
		this.nombre = nombre;
		this.fechaIni = fechaIni;
		this.fechaFin = fecaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.inscriptos = new ArrayList();
		this.espera = new ArrayList();
		this.e = new MenorAMinimo(this);
	}
	
	public void cambiarEstado(Estado e) {
		this.e = e;
	}
	
	public String obtenerInformacion() {
		return this.e.obtenerInformacion();
	}
	
	public void inscribir(Usuario u) {
		this.e.inscribir(u);
	}
	
	public void agregarInscripto(Usuario u) {
		this.inscriptos.add(u);
	}
	
	public void agregarEspera(Usuario u) {
		this.espera.add(u);
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaIni() {
		return fechaIni;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public double getCosto() {
		return costo;
	}

	public String getPuntoEncuentro() {
		return this.puntoEncuentro;
	}
	
	public int faltantesMin() {
		return this.cupoMin-this.inscriptos.size();
	}
	
	public int faltantesMax() {
		return this.cupoMax-this.inscriptos.size();
	}
	
	public ArrayList<Usuario> getInscriptos() {
		return inscriptos;
	}

	public ArrayList<Usuario> getEspera() {
		return espera;
	}

	public String obtenerMails() {
	    return this.inscriptos.stream()
	            .map(u -> u.getEmail())
	            .collect(Collectors.joining("\n"));
	}
}

package Ejercicio13;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private Year añoE;
	private ArrayList<Pelicula> peliR;
	private double puntaje;
	
	public Pelicula(String titulo, double puntaje, Year añoE) {
		super();
		this.titulo = titulo;
		this.añoE = añoE;
		this.peliR = new ArrayList();
		this.puntaje = puntaje;
	}
	
	public void agregarPeliSim(Pelicula p) {
		if(!peliR.contains(p)) {
			this.peliR.add(p);
			p.agregarPeliSim(this);
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public Year getAñoE() {
		return añoE;
	}

	public ArrayList<Pelicula> getPeliR() {
		return peliR;
	}

	public double getPuntaje() {
		return puntaje;
	}
	
	
}

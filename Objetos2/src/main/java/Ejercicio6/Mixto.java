package Ejercicio6;

import java.util.*;

public class Mixto implements Topologia{

	private ArrayList<Topologia> componentes;
	
	public Mixto(Topologia t1, Topologia t2, Topologia t3, Topologia t4) {
		this.componentes = new ArrayList<Topologia>();
		this.componentes.add(t1);
		this.componentes.add(t2);
		this.componentes.add(t3);
		this.componentes.add(t4);
	}
	
	public double proporcionAgua() {
		return (this.componentes.stream()
				.mapToDouble(c -> c.proporcionAgua())
				.sum() / 4); // YO LO HUBIESE HECHO DE OTRA MANERA, HUBIESE DIVIDO POR
							// LA CANTIDAD DE ELEMENTOS DE LA LISTA
	}	
	
	public Topologia ObtenerComponente(int i) {
		return this.componentes.get(i);
	}
	
	public boolean equals (Agua a) {
		return false;
	}
	
	public boolean equals (Tierra t) {
		return false;
	}
	
	public boolean equals (Mixto t) {
			for (int i = 0; i < componentes.size(); i++) { 
	            if(!t.ObtenerComponente(i).equals(this.componentes.get(i))) {
	            	return false;
	            }
	        }
			return true;
			
	}

	@Override
	public boolean equals(Topologia t) {
		return t.equals(this);
	}
}

package Ejercicio19;

public class Personaje {
	private int arma;
	private String nombre;
	private int armadura;
	
	public Personaje(int arma, String nombre, int armadura ) { 
		this.arma=arma;
		this.armadura=armadura;
		this.nombre=nombre;                 
	}

	public void setArma(int arma) {
		this.arma = arma;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	
}

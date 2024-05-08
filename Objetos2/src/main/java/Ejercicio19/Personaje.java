package Ejercicio19;

public class Personaje {
	private Arma arma;
	private String habilidad;
	private Armadura armadura;
	private int vida;
	
	public Personaje() {                
	}

	
	
	public String getHabilidad() {
		return habilidad;
	}



	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public void setHabilidad(String nombre) {
		this.habilidad = nombre;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void atacar(Personaje p) {
		p.recibirPelea(this.arma);
	}
	
	public void recibirPelea(Arma a) {
		this.vida = vida - this.armadura.recibe(a);
	}
	
	public int getVida() {
		return this.vida;
	}
}

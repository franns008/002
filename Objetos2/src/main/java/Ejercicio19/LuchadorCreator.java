package Ejercicio19;

public class LuchadorCreator extends BuilderPersonaje{
	
	public LuchadorCreator() {
		p = new Personaje(); 
	}
	
	public void equiparArma() {
		this.p.setArma(new Espada());
	}
	
	public void equiparArmadura() {
		this.p.setArmadura(new Acero());
	}
	
	public void equiparHabilidad() {
		this.p.setHabilidad("Ataque cuerpo a cuerpo");
	}
	
}

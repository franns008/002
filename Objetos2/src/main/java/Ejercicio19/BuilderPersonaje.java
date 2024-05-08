package Ejercicio19;

public abstract class BuilderPersonaje {
	
	protected Personaje p;
	
	public BuilderPersonaje() {
		p = new Personaje(); 
	}
	
	public void reset(){
		this.p= new Personaje();
	}
	
	public Personaje make() {
		return p;
	}
	
	public void indicarVida() {
		this.p.setVida(100);
	}
	
	public abstract void equiparArma(); 
	
	public abstract void equiparArmadura(); 
	
	public abstract void equiparHabilidad(); 
	


	
	
}

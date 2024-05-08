package Ejercicio19;

public class MagoCreator extends BuilderPersonaje{

	public MagoCreator() {
		p = new Personaje(); 
	}

	@Override
	public void equiparArma() {
		this.p.setArma(new Baston());
		
	}

	@Override
	public void equiparArmadura() {
		this.p.setArmadura(new Cuero());
	}

	@Override
	public void equiparHabilidad() {
		this.p.setHabilidad("Magia");
		
	}
	
	
}

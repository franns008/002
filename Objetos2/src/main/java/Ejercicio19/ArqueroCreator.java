package Ejercicio19;

public class ArqueroCreator extends BuilderPersonaje{
	
	public ArqueroCreator() {
		p = new Personaje(); 
	}

	@Override
	public void equiparArma() {
		this.p.setArma(new Arco());
		
	}

	@Override
	public void equiparArmadura() {
		this.p.setArmadura(new Cuero());
	}

	@Override
	public void equiparHabilidad() {
		this.p.setHabilidad("Tirador");
		
	}
	
}

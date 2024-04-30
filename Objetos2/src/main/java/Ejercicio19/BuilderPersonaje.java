package Ejercicio19;

public abstract class BuilderPersonaje {
	
	private Personaje p;
	
	
	
	public void crearPersonaje() {
		this agregarArmadura();
		this agregarHabilidad();
		this agregarArma();
	}

}

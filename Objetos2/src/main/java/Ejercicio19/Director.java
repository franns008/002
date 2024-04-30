package Ejercicio19;

public class Director {
	private BuilderPersonaje builder;

	public Director(BuilderPersonaje builder) {
		super();
		this.builder = builder;
	}
	
	public void cambiarBuilder(BuilderPersonaje b) {
		this.builder=b;
	}
	
	public Personaje crear() {
		
		return null;
	}
}

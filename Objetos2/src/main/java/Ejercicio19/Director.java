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
		this.builder.reset();
		this.builder.equiparArma();
		this.builder.equiparArmadura();
		this.builder.equiparHabilidad();
		this.builder.indicarVida();
		return builder.make();
	}
}

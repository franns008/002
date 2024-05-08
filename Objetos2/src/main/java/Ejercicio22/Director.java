package Ejercicio22;

public class Director {
	private BuilderAbstract builder;
	
	public Director() {
		builder = new Clasico();
	}
	
	public void cambiarBuilder(BuilderAbstract builder) {
		this.builder = builder;
	}
	
	public Sandwich crear() {
		this.builder.reset();
		this.builder.agregarPan();
		this.builder.agregarAderezo();
		this.builder.agregarPrincipal();
		this.builder.agregarAdicional();
		return this.builder.make();
	}
}

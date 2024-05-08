package Ejercicio22;

public abstract class BuilderAbstract {
	protected Sandwich sandwich;
	
	public BuilderAbstract() {
		this.sandwich = new Sandwich();
	}
	
	public Sandwich make() {
		return this.sandwich;
	}
	
	public void reset() {
		this.sandwich = new Sandwich();
	}
	
	public abstract void agregarPan();
	public abstract void agregarAderezo(); 
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();
	
}

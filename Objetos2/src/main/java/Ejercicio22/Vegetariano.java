package Ejercicio22;

public class Vegetariano extends BuilderAbstract {

	public Vegetariano() {
		super();
	}
	
	public void agregarPan() {
		this.sandwich.setPan("Pan con semillas");
		this.sandwich.sumarPrecio(120);
	}
	
	public void agregarAderezo() {
	
	}
	
	public void agregarPrincipal() {
		this.sandwich.setPrincipal("provoleta grillada");
		this.sandwich.sumarPrecio(200);
	}
	
	public void agregarAdicional() {
		this.sandwich.setAdicional("berenjenas al escabeche");
		this.sandwich.sumarPrecio(100);
	}
}

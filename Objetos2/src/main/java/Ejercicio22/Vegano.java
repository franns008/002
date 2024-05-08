package Ejercicio22;

public class Vegano extends BuilderAbstract {

	public Vegano() {
		super();
	}
	
	public void agregarPan() {
		this.sandwich.setPan("Integral");
		this.sandwich.sumarPrecio(100);
	}
	
	public void agregarAderezo() {
		this.sandwich.setAderezo("Salsa criolla");
		this.sandwich.sumarPrecio(20);
	}
	
	public void agregarPrincipal() {
		this.sandwich.setPrincipal("Milanesa de girgolas");
		this.sandwich.sumarPrecio(500);
	}
	
	public void agregarAdicional() {
	
	}
}

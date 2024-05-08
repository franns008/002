package Ejercicio22;

public class Clasico extends BuilderAbstract{

	public Clasico() {
		super();
	}
	
	public void agregarPan() {
		this.sandwich.setPan("Brioche");
		this.sandwich.sumarPrecio(100);
	}
	
	public void agregarAderezo() {
		this.sandwich.setAderezo("Mayonesa");
		this.sandwich.sumarPrecio(20);
	}
	
	public void agregarPrincipal() {
		this.sandwich.setPrincipal("Carne de ternera");
		this.sandwich.sumarPrecio(300);
	}
	
	public void agregarAdicional() {
		this.sandwich.setAdicional("tomate");
		this.sandwich.sumarPrecio(80);
	}
}

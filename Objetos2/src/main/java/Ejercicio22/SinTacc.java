package Ejercicio22;

public class SinTacc extends BuilderAbstract{

	public SinTacc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void agregarPan() {
		this.sandwich.setPan("pan de chipá");
		this.sandwich.sumarPrecio(150);
	}
	
	public void agregarAderezo() {
		this.sandwich.setAderezo("Salsa tartara");
		this.sandwich.sumarPrecio(18);
	}
	
	public void agregarPrincipal() {
		this.sandwich.setPrincipal("Carne de pollo");
		this.sandwich.sumarPrecio(250);
	}
	
	public void agregarAdicional() {
		this.sandwich.setAdicional("Verduras grilladas");
		this.sandwich.sumarPrecio(200);
	}
}

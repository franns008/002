package Ejercicio22;

public class Subway {
	private Director d;
	
	public Subway() {
		this.d = new Director();
	}
	
	public Sandwich crearSandwichClasico() {
		this.d.cambiarBuilder(new Clasico());
		return this.d.crear();
	}
	
	public Sandwich crearSandwichVegetariano() {
		this.d.cambiarBuilder(new Vegetariano());
		return this.d.crear();
	}
	
	public Sandwich crearSandwichVegano() {
		this.d.cambiarBuilder(new Vegano());
		return this.d.crear();
	}
	
	public Sandwich crearSandwichSinTacc() {
		this.d.cambiarBuilder(new SinTacc());
		return this.d.crear();
	}
}

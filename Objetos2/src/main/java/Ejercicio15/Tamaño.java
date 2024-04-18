package Ejercicio15;

public class Tamaño extends Decorador{
	
	public Tamaño (Archivo a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return this.a.prettyPrint()+" "+this.getTamaño();
	}
	
}

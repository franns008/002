package Ejercicio15;

public class Nombre extends Decorador{

	public Nombre(Archivo a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return this.a.prettyPrint()+" "+this.getNombre();
	}
}

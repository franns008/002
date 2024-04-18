package Ejercicio15;

public class Extension extends Decorador{
	
	
	public Extension (Archivo a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return this.a.prettyPrint()+" "+this.getExtension();
	}
}

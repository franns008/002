package Ejercicio15;

public class FechaCreacion extends Decorador{
	
	public FechaCreacion (Archivo a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return this.a.prettyPrint()+" "+this.getFechaC();
	}
}

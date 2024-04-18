package Ejercicio15;

public class FechaModificacion extends Decorador {
	
	public FechaModificacion (Archivo a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return this.a.prettyPrint()+" "+this.getFechaM();
	}
}

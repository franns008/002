package Ejercicio15;

public class Permisos extends Decorador{
	
	public Permisos (Archivo a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return this.a.prettyPrint()+" "+this.getPermisos();
	}
}

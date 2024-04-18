package Ejercicio15;

public abstract class Decorador implements Archivo{
	
	protected Archivo a;

	public Decorador(Archivo a) {
		super();
		this.a = a;
	}
	
	public abstract String prettyPrint();
	public String getNombre() {
		return this.a.getNombre();
	}
		
	public String getExtension() {
		return this.a.getExtension();
	}
	public String getTamaño() {
		return this.a.getTamaño();
	}
	public String getFechaC() {
		return this.a.getFechaC();
	}
	public String getFechaM(){
		return this.a.getFechaM();
	}
	public String getPermisos() {
		return this.a.getPermisos();
	}
	
}

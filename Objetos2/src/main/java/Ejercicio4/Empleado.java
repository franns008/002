package Ejercicio4;

public abstract class Empleado {
	private String nombre;
	private String legajo;
	public Empleado(String nombre, String legajo) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
	}
	
	public abstract double basico();
	public abstract double adicional();
	public double descuento(){ 
		return (this.basico()*0.13+this.adicional()*0.05);
	}
	
	public double sueldos() {
		return this.basico()+this.adicional()-this.descuento();
	}
}

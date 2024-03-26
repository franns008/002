package Ejercicio4;

public class Pasante extends Empleado{
	private int cantE;


	public Pasante(String nombre, String legajo, int cantE) {
		super(nombre, legajo);
		this.cantE = cantE;
	}
	
	public double basico() {
		return 20000;
	}
	
	public double adicional() {
		return 2000*this.cantE;
	}
	
}

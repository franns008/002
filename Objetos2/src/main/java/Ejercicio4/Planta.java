package Ejercicio4;

public class Planta extends Empleado{
	private boolean casado;
	private int hijos;
	private int añosAnt;
	public Planta(String nombre, String legajo, boolean casado, int hijos, int añosAnt) {
		super(nombre, legajo);
		this.casado = casado;
		this.hijos = hijos;
		this.añosAnt = añosAnt;
	}
	
	public double basico() {
		return 50000;
	}
	
	public double adicional() {
		if(casado) {
			return 5000+2000*this.hijos+2000*this.añosAnt;
		}else {
			return 2000*this.hijos+2000*this.añosAnt;
		}
	}
}

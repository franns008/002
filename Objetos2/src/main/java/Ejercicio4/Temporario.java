package Ejercicio4;

public class Temporario extends Empleado{
	private int cantH;
	private boolean casado;
	private int hijos;
	
	public Temporario(int cantH,boolean c,int h,String nombre,String legajo) {
		super(nombre,legajo);
		this.cantH = cantH;
		this.hijos = h;
		this.casado = c;
	}


	public double basico() {
		return 20000+this.cantH*300;
	}
	public double adicional() {
		if(casado) {
			return 5000+hijos*2000;
		}else {
			return hijos*2000;
		}
	}
}

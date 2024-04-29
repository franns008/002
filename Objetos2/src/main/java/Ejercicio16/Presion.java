package Ejercicio16;

public class Presion extends Decorador{

	public Presion(Temperatura c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	
	public String displayData() {
		return this.c.displayData()+"Presión atmosf: "+this.c.getPresion();
	}

}

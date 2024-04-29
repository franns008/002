package Ejercicio16;

public class Promedio extends Decorador{

	public Promedio(Temperatura c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	
	public String displayData() {
		return this.c.displayData()+" Promedio:"+this.c.getTemperaturas().stream()
											.mapToDouble( c -> c.doubleValue())
											.average()
											.orElse(0.0);
	}
}

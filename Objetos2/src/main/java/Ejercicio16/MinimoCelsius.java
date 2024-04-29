package Ejercicio16;

public class MinimoCelsius extends Decorador{
	
	
	public MinimoCelsius(Temperatura c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public String displayData() {
		return this.c.displayData()+" Mínimo:"+(this.getTemperaturas().stream()
										.min((c1,c2) -> c1.compareTo(c2))
										.orElse(0.0)-32)/1.8;
	}
}

package Ejercicio16;

public class MaximoCelsius extends Decorador {
	
	public MaximoCelsius(Temperatura c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public String displayData() {
		return this.c.displayData()+" Máximo:"+((this.getTemperaturas().stream()
										.max((c1,c2) -> c1.compareTo(c2))
										.orElse(0.0))-32)/1.8;
	}
}

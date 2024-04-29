package Ejercicio16;

public class MinimoFahrenheit extends Decorador{

	public MinimoFahrenheit(Temperatura c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		return this.c.displayData()+" Mínimo:"+this.getTemperaturas().stream()
				.min((c1,c2) -> c1.compareTo(c2))
				.orElse(0.0);
	}
}

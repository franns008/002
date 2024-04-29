package Ejercicio16;

public class TemperaturaCelsius extends Decorador{

	public TemperaturaCelsius(Temperatura c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public String displayData() {
		return c.displayData()+" Temperatura C "+((this.c.getTemperatura()-32)/1.8);
	}
}

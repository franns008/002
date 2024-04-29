package Ejercicio16;

import java.util.List;

public class Decorador implements Temperatura {
	public Temperatura c;

	public Decorador(Temperatura c) {
		super();
		this.c = c;
	}
	
	public double getTemperatura() {
		return this.c.getTemperatura();
	}
	
	public double getPresion() {
		return this.c.getPresion();
	}
	
	public double getRadiacionSolar() {
		return this.c.getRadiacionSolar();
	}
	
	public List<Double> getTemperaturas(){
		return this.c.getTemperaturas();
	}
	
	public String displayData(){
		return this.c.displayData();
	}
}

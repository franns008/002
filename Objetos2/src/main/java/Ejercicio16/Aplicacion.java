package Ejercicio16;

import java.util.*;

public class Aplicacion implements Temperatura {
	private HomeWheaterStation hs;

	public Aplicacion(HomeWheaterStation hs) {
		super();
		this.hs = hs;
	}
	
	public String displayData() {
		return "";
	}
	
	public double getPresion() {
		return this.hs.getPresion();
	}
	
	public double getRadiacionSolar() {
		return this.hs.getRadiacionSolar();
	}
	
	public double getTemperatura() {
		return this.getTemperatura();
	}
	
	public List<Double> getTemperaturas(){
		return this.hs.getTemperaturas();
	}
}

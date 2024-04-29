package Ejercicio16;

import java.util.*;

public class HomeWheaterStation {
	private double Temperatura;
	private double presion;
	private double radiacionSolar;
	private List temperaturas;
	public HomeWheaterStation(double temperatura, double presion, double radiacionSolar) {
		super();
		Temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturas = new ArrayList();
	}
	
	public double getTemperatura() {
		return Temperatura;
	}
	
	public double getPresion() {
		return presion;
	}
	
	public double getRadiacionSolar() {
		return radiacionSolar;
	}
	
	public List getTemperaturas() {
		return temperaturas;
	} 
	
	public String displayData(){
		return "Temperatura F: " + this.getTemperatura() +
		   	  "Presión atmosf: " + this.getPresion() +
		   	  "Radiación solar: " + this.getRadiacionSolar();
		}

	
}

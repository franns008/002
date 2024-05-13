package Ejercicio23;

import java.util.*;

public class Pasaje {
	private Pasajero pasajero;
	private ArrayList<Servicio> vuelo;
	private ArrayList asiento;
	private double costoBase;
	
	public Pasaje(Pasajero pasajero, ArrayList<Servicio> vuelo, ArrayList asiento, double costo) {
		super();
		this.pasajero=pasajero;
		this.vuelo = vuelo;
		this.asiento = asiento;
		this.costoBase =costo;
	}
	
	public double multiHop() {
		return 1; // preguntar que onda con esto tambien 
	}
	
	public double rateDiario() {
		return 1;   //preguntar que onda con esto
	}
	
	public double rateRoundTrip() {
		if((this.vuelo.stream() .mapToInt(v -> v.cantTramos()).sum())>3) {
			return 0.93;
		}else {
			return 1;
		}
	}
	
	public double getCostoBase() {
		return this.costoBase;
	}
	
	public double costoPasaje() {
		return this.costoBase*this.multiHop()*this.rateDiario()*this.rateRoundTrip();
	}
}

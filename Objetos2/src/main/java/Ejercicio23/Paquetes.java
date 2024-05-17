package Ejercicio23;

import java.util.ArrayList;

public class Paquetes extends Servicio{
	private double peso;
	private double dimension;
	
	public Paquetes(ArrayList<Ticket> tickets, Pasajero pasajero, double peso, 
			double dimension, double costoBase) {
		super(tickets, pasajero,costoBase*3000);
		this.peso = peso;
		this.dimension = dimension;
	}
	
	public double costoServicio(){
		return this.costoBase*this.rateDiario()*this.multiHop();
	}
}

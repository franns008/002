package Ejercicio23;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

public abstract class Servicio {
	protected LocalDate dia;
	protected double costoBase;
	protected Map<String,Double> diario;
	protected ArrayList<Ticket> tickets;
	private Pasajero pasajero;
	
	public Servicio(ArrayList<Ticket> tickets,Pasajero pasajero, double costoBase) {
		this.costoBase = costoBase;
		this.tickets =tickets;
		this.pasajero = pasajero;
		this.dia= LocalDate.now();
		diario.put("Monday", 1.0);
        diario.put("Tuesday", 1.01);
        diario.put("Wednesday", 0.99);
        diario.put("Thursday", 0.95);
        diario.put("Friday", 1.0);
        diario.put("Saturday", 1.01);
        diario.put("Sunday", 1.01);
        dia=LocalDate.now();
	}
	
	public double multiHop() {
		if(this.tickets.size()>3) {
			return 0.93;
		}else {
			return 1;
		}
	}
	
	public double rateDiario() {
		return this.diario.get(dia.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
	}
	
	public double getCostoBase() {
		return this.costoBase;
	}
	
	public abstract double costoServicio();
}

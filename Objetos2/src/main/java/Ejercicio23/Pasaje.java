package Ejercicio23;

import java.time.*;
import java.time.format.TextStyle;
import java.util.*;

public class Pasaje extends Servicio{
	private LocalDate dia;

	private ArrayList asiento;

	
	public Pasaje(Pasajero pasajero, ArrayList<Ticket> tickets, 
			double costoBase, ArrayList asiento) {
		super(tickets,pasajero,costoBase);
		this.asiento = asiento;
	}
	
	
	public double rateRoundTrip() {
		if(this.tickets.get(this.tickets.size())
				.mismoDestino(this.tickets.get(0).getCiudadOrigen())) {
			return 0.95;
		}else {
			return 1;
		}
	}
	
	public double costoServicio() {
		return this.costoBase*this.multiHop()*this.rateDiario()*this.rateRoundTrip();
	}
}

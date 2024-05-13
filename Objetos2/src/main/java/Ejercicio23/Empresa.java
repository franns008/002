package Ejercicio23;

import java.util.*;
import java.time.*;

public class Empresa {
	public ArrayList<Servicio> servicios;
	public ArrayList<Pasajero> pasajeros;
	public ArrayList<Pasaje> pasajes;
	public Empresa() {
		this.servicios = new ArrayList();
		this.pasajeros = new ArrayList();
		this.pasajes = new ArrayList();
	}
	
	public Pasaje crearPasaje(Pasajero p, ArrayList<Servicio>vuelos,ArrayList asiento,int costo) {
		Pasaje pasaje =new Pasaje(p,vuelos,asiento,costo);
		this.pasajes.add(pasaje);
		return pasaje;
	}
	
	public int horasDeVueloTotalAvion(Avion avion) {
		return this.servicios.stream()
				.mapToInt(s -> s.horasDeVuelo(avion.getModelo()))
				.sum();
	}
	
	public int horasDeVueloFechaAvion(Avion avion,LocalDate fechaIni, LocalDate fechaFin) {
		return this.servicios.stream()
				.mapToInt(s -> s.horasDeVueloFecha(avion.getModelo(),fechaIni,fechaFin))
				.sum();
	}
	
	public double eficienciaTarifas() {
		double total = this.pasajes.stream()
				.mapToDouble(p -> p.costoPasaje())
				.sum();
		return total- this.pasajes.stream().mapToDouble(p -> p.getCostoBase()).sum();
	}
	
}

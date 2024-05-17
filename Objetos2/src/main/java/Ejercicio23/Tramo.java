package Ejercicio23;

import java.time.*;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

public class Tramo extends Vuelo {
	private LocalDate dia;
	private LocalDateTime horaRealSalida;
	private int asientosUtilizados;
	private Configuracion avion;
	public Tramo(String origen, String destino, LocalDateTime horaSalida, Duration duracion,
			LocalDate dia, LocalDateTime horaRealSalida, Configuracion avion) {
		super(origen,destino,horaSalida, duracion);
		this.dia = dia;
		this.horaRealSalida = horaRealSalida;
		this.asientosUtilizados = 0;
		this.avion = avion;
	}
	
	
	public boolean reservarAsiento(int cant) {
		if(this.avion.hayLugar(cant+this.asientosUtilizados)) {
			this.asientosUtilizados+=cant;
			return true;
		}else {
			return false; // Aca puede ir un null object 
		}
	}
	
	public int horasDeVuelo(String modelo) {
		if(avion.soyEse(modelo)) {
			return this.duracion.toHoursPart();
		}else {
			return 0;
		}
			
	}
	
	public int horasDeVueloFecha(String modelo,LocalDate diaIni,LocalDate diaFin) {
		if((this.dia.isAfter(diaIni) || this.dia.isEqual(diaIni) || this.dia.isBefore(diaFin)
				|| this.dia.isEqual(diaFin))&& this.avion.soyEse(modelo) ) {
			return this.duracion.toHoursPart();
		}else {
			return 0;
		}
			
	}
	
	public LocalDateTime horaEstimadaSalida() {
		return this.horaSalida;
	}
	
	public LocalDateTime horaLLegada() {
		return this.horaRealSalida.plus(this.duracion);	
	}
	
	public Duration duracion() {
		return this.duracion;
	}
	
	public double getPromedioOcupacion() {
		return this.asientosUtilizados/this.avion.getCapacidad();
	}
}

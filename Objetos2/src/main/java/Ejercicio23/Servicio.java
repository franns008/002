package Ejercicio23;

import java.time.*;
import java.util.ArrayList;

public class Servicio extends Vuelo {
	
	private LocalDate dia;
	private LocalDateTime horaRealSalida;
	private int asientosUtilizados;
	private Configuracion avion;
	public Servicio(LocalDateTime horaSalida, Duration duracion,
			LocalDate dia, LocalDateTime horaRealSalida, Configuracion avion) {
		super(horaSalida, duracion);
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
	
	public int cantTramos() {
		return this.tramos.size();
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

package Ejercicio23;

import java.util.*;
import java.time.*;


public class Vuelo {
	protected String origen;
	protected String destino;
	protected LocalDateTime horaSalida;
	protected Duration duracion;
	public Vuelo(String origen, String destino,LocalDateTime horaSalida, Duration duracion) {
		this.destino=destino;
		this.origen=origen;
		this.horaSalida = horaSalida;
		this.duracion = duracion;
	}
	
	public LocalDateTime horaLLegada() {
		return this.horaSalida.plus(this.duracion);	
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}
	
	
}

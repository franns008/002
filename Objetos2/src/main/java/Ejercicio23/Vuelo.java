package Ejercicio23;

import java.util.*;
import java.time.*;


public class Vuelo {
	protected ArrayList<Tramo> tramos;
	protected ArrayList<String> dias;
	protected LocalDateTime horaSalida;
	protected Duration duracion;
	public Vuelo(LocalDateTime horaSalida, Duration duracion) {
		super();
		this.tramos = new ArrayList();
		this.dias = new ArrayList();
		this.horaSalida = horaSalida;
		this.duracion = duracion;
	}
	
	public LocalDateTime horaLLegada() {
		return this.horaSalida.plus(this.duracion);	
	}
}

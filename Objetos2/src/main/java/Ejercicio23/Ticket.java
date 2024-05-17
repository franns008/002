package Ejercicio23;

public class Ticket {
	private Tramo servicio;
	
	public Ticket(String ciudadIni) {
		super();
		this.servicio = servicio;
	}
	
	public boolean mismoDestino(String des) {
		return this.getCiudadDest().equals(des);
	}

	public String getCiudadOrigen() {
		return this.servicio.getOrigen();
	}

	public String getCiudadDest() {
		return this.servicio.getDestino();
	}
	
}

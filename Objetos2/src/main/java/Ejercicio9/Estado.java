package Ejercicio9;

public abstract class Estado {
	protected Excursion e;

	public Estado(Excursion e) {
		super();
		this.e = e;
	}
	
	public String obtenerInformacion() {
		return "Nombre "+this.e.getNombre()+" costo: "+this.e.getCosto()+" fechaInicio "+
	this.e.getFechaIni()+" fecha fin "+this.e.getFechaFin()+" punto de encuentro "
				+this.e.getPuntoEncuentro();
	}
	
	public abstract void inscribir(Usuario u);

}

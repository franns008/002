package Ejercicio9;

public class Minimo extends Estado {

	public Minimo(Excursion e) {
		super(e);
		// TODO Auto-generated constructor stub
	}
	
	public void inscribir(Usuario u) {
		this.e.agregarInscripto (u);
		if(this.e.faltantesMax() == 0) {
			this.e.cambiarEstado(new Maximo (e));
		}
	}
	public String obtenerInformacion() {
		return super.obtenerInformacion()+" mails "+
	this.e.obtenerMails()+" faltantes Max"+this.e.faltantesMax();
	}
}

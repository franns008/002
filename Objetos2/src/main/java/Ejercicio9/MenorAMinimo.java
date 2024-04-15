package Ejercicio9;

public class MenorAMinimo extends Estado {

	public MenorAMinimo(Excursion e) {
		super(e);
		// TODO Auto-generated constructor stub
	}
	
	public void inscribir(Usuario u) {
		this.e.agregarInscripto (u);
		if(this.e.faltantesMin() == 0) {
			this.e.cambiarEstado(new Minimo (e));
		}
	}
	
	public String obtenerInformacion() {
		return super.obtenerInformacion()+" faltantes min "+this.e.faltantesMin();
	}
}

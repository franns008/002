package Ejercicio11;

public class EnEvaluacion extends Estado{ {
	public EnEvaluacion(Proyecto p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	public void aprobarEtapa() {
		this.p.cambiarEstado(new Confirmado(p));
	}
}

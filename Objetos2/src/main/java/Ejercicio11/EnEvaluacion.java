package Ejercicio11;

public class EnEvaluacion extends Estado{ 
	public EnEvaluacion(Proyecto p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	public void modificarMargen(double margen) {
		if(margen>=0.11 && margen<=0.15) {
			this.p.cambiarMargen(margen);
		}
	}
	
	public void aprobarEtapa() {
		this.p.cambiarEstado(new Confirmado(p));
	}
}

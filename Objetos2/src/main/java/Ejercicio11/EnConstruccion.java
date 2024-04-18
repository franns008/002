package Ejercicio11;

public class EnConstruccion extends Estado{
	public EnConstruccion(Proyecto p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	public void modificarMargen(double margen) {
		if(margen>=0.08 && margen<=0.1) {
			this.p.cambiarMargen(margen);
		}
	}
	
	public void aprobarEtapa() {
		if(this.p.precioProyecto()>0) {
			this.p.cambiarEstado(new EnEvaluacion(p));
		}else {
			 throw new RuntimeException("No se puede pasar a la etapa 'En Evaluacion' ya que el proyecto posee un precio de $0");
		}

	}
}



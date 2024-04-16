package Ejercicio11;

public class EnConstruccion extends Estado{{
	public EnConstruccion(Proyecto p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	public void aprobarEtapa() {
		if(this.p.precioProyecto()>0) {
			this.p.cambiarEstado(new EnEvaluacion(p));
		}else {
			 throw new RuntimeException(" El precio debe ser mayor a 0");
		}

	}
}



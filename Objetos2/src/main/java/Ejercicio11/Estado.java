package Ejercicio11;

public abstract class Estado {
	protected Proyecto p;

	public Estado(Proyecto p) {
		super();
		this.p = p;
	}
	
	public void cancelarProyecto() {
		this.p.setObjetivo("Cancelado");
		this.p.cambiarEstado(new Cancelado(p));
	}
	
	public abstract void aprobarEtapa();
	
	public abstract void modificarMargen((double margen);
	
}

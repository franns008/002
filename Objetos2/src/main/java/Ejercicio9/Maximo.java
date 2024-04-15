package Ejercicio9;

public class Maximo extends Estado{

	public Maximo(Excursion e) {
		super(e);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void inscribir(Usuario u) {
		this.e.agregarEspera(u);
	}
	
}

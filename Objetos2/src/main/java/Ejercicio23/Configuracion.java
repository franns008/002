package Ejercicio23;

public class Configuracion extends Avion{
	private int CantAsientos;

	public Configuracion(String modelo, int cantAsientos) {
		super(modelo);
		CantAsientos = cantAsientos;
	}
	
	public boolean hayLugar(int cant) {
		if(cant>this.CantAsientos) {
			return false;
		}else {
			return true;
		}
	}
	
	public int getCapacidad() {
		return this.CantAsientos;
	}
	
	public boolean soyEse(String modelo) {
		return this.getModelo().equals(modelo);
	}
}

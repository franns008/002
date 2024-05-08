package Ejercicio22;

public class Sandwich {
	
	private String pan;
	private String aderezo;
	private String adicional;
	private String principal;
	private int precio;
	
	public Sandwich() {
		this.precio =0;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public void setAderezo(String aderezo) {
		this.aderezo = aderezo;
	}

	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	
	public void sumarPrecio(int costo) {
		precio+=costo;
	}
	
}

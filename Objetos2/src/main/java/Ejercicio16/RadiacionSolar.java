package Ejercicio16;

public class RadiacionSolar extends Decorador {

	public RadiacionSolar(Temperatura c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public String displayData() {
		return this.c.displayData()+" Radiación solar: "+this.c.getRadiacionSolar();
	}
}

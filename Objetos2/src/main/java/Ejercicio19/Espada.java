package Ejercicio19;

public class Espada implements Arma {
	public int pelear(Cuero c) {
		return 8;
	}
	
	public int pelear(Acero a) {
		return 5;
	}
	
	public int pelear(Hierro h) {
		return 3;
	}
}

package Ejercicio19;

public class Baston implements Arma {
	public int pelear(Cuero c) {
		return 2;
	}
	
	public int pelear(Acero a) {
		return 1;
	}
	
	public int pelear(Hierro h) {
		return 1;
	}
}

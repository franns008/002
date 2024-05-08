package Ejercicio19;

public class Arco implements Arma {
	public int pelear(Cuero c) {
		return 5;
	}
	
	public int pelear(Acero a) {
		return 2;
	}
	
	public int pelear(Hierro h) {
		return 3;
	}
}

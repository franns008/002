package Ejercicio19;

public class Cuero implements Armadura{
	public int  recibe (Arma a) {
		return a.pelear(this);
	}
}

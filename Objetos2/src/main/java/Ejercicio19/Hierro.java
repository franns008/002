package Ejercicio19;

public class Hierro implements Armadura{
	
	public int  recibe (Arma a) {
		return a.pelear(this);
	}
}

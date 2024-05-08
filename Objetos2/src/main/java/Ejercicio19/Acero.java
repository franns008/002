package Ejercicio19;

public class Acero implements Armadura{
	
	public int  recibe (Arma a) {
		return a.pelear(this);
	}
}

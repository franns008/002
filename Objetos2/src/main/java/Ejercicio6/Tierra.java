package Ejercicio6;

public class Tierra implements Topologia{
	
	public double proporcionAgua() {
		return 0;
	}


	public boolean equals(Topologia t) {
		return t.proporcionAgua() == 0;
	}
	
}

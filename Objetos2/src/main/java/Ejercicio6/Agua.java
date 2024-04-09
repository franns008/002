package Ejercicio6;

public class Agua implements Topologia {
	
	public double proporcionAgua() {
		return 1;
	}
	
	public boolean equals(Topologia t) {
		return t.proporcionAgua() == 1;
	}
}

package Ejercicio6;

public class Agua implements Topologia {
	
	public double proporcionAgua() {
		return 1;
	}
	
	public boolean equals(Topologia t) {
		if (t.proporcionAgua()== 1) {
			return true;
		}else {
			return false;
		}
	}
}

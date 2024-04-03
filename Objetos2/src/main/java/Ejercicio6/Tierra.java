package Ejercicio6;

public class Tierra implements Topologia{
	
	public double proporcionAgua() {
		return 0;
	}


	public boolean equals(Topologia t) {
		if (t.proporcionAgua()== 0) {
			return true;
		}else {
			return false;
		}
	}
	
}

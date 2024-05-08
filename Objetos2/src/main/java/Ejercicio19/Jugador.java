package Ejercicio19;

public class Jugador {

	private Director director;
	
	public Jugador( Director d) {
		this.director = d;
	}
	
	public Personaje crearArquero() {
		 this.director.cambiarBuilder(new ArqueroCreator());
		 return this.director.crear();
	}
	
	public Personaje crearLuchador() {
		 this.director.cambiarBuilder(new LuchadorCreator());
		 return this.director.crear();
	}
	
	
	public Personaje crearMago() {
		 this.director.cambiarBuilder(new MagoCreator());
		 return this.director.crear();
	}
}

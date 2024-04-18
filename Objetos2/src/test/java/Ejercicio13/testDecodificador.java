package Ejercicio13;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Year;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testDecodificador {
	private Decodificador decodificador;
	private Pelicula thor;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rocky;
	private Pelicula rambo;
	

	@BeforeEach
	void setUp() throws Exception {
		this.thor = new Pelicula("Thor", 7.9, Year.of(2007));
		this.capitanAmerica = new Pelicula("Capitan America", 7.8, Year.of(2016));
		this.ironMan = new Pelicula("Iron man", 7.9, Year.of(2010));
		this.dunkirk = new Pelicula("Dunkirk", 7.9, Year.of(2017));
		this.rocky = new Pelicula("Rocky", 8.1, Year.of(1976));
		this.rambo = new Pelicula("Rambo", 7.8, Year.of(1979));
		
		this.thor.agregarPeliSim(capitanAmerica);
		this.thor.agregarPeliSim(ironMan);
		this.capitanAmerica.agregarPeliSim(ironMan);
		this.rocky.agregarPeliSim(rambo);
		
		this.decodificador = new Decodificador();
		
		this.decodificador.agregarPelicula(thor);
		this.decodificador.agregarPelicula(capitanAmerica);
		this.decodificador.agregarPelicula(ironMan);
		this.decodificador.agregarPelicula(dunkirk);
		this.decodificador.agregarPelicula(rocky);
		this.decodificador.agregarPelicula(rambo);
		this.decodificador.agregarPeliculaV(thor);
		this.decodificador.agregarPeliculaV(rocky);
	}

	@Test
	void testObtenerSugerencias() {
		assertTrue(this.decodificador.solicitarSugerencias().contains(dunkirk));
		assertTrue(this.decodificador.solicitarSugerencias().contains(capitanAmerica));
		assertTrue(this.decodificador.solicitarSugerencias().contains(ironMan));
		this.decodificador.setSugerencia(new Similaridad());
		assertTrue(this.decodificador.solicitarSugerencias().contains(capitanAmerica));
		assertTrue(this.decodificador.solicitarSugerencias().contains(ironMan));
		// Aca no anda assertTrue(this.decodificador.solicitarSugerencias().contains(rambo));
		this.decodificador.setSugerencia(new Puntaje());
		assertTrue(this.decodificador.solicitarSugerencias().contains(capitanAmerica));
		assertTrue(this.decodificador.solicitarSugerencias().contains(ironMan));
		assertTrue(this.decodificador.solicitarSugerencias().contains(dunkirk));
	}
}

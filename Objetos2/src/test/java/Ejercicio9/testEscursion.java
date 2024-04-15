package Ejercicio9;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testEscursion {
	private Excursion excursion;
	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;

	@BeforeEach
	public void setUp() throws Exception {
		this.excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2023, 4, 6), LocalDate.of(2023, 4, 8), 
									   "Terminal de Ómnibus de La Plata", 5000,1,2);
		this.usuario1 = new Usuario("Kendrick", "Lamar", "kdot@gmail.com");
		this.usuario2 = new Usuario("Agustin", "Cruz", "acru1@gmail.com");
		this.usuario3 = new Usuario("Tony", "Soprano", "tonysoprano@gmail.com");
		System.out.println(this.excursion.obtenerInformacion()); 
		this.excursion.inscribir(usuario1);
		System.out.println(this.excursion.obtenerInformacion());
		this.excursion.inscribir(usuario2);
		System.out.println(this.excursion.obtenerInformacion());
	}

	@Test
	public void testInscribir() {
		this.excursion.inscribir(usuario3);
		assertEquals(1,this.excursion.getEspera().size());
		assertEquals(2,this.excursion.getInscriptos().size());
		assertTrue(this.excursion.getInscriptos().contains(usuario1));
		assertTrue(this.excursion.getInscriptos().contains(usuario2));
		assertFalse(this.excursion.getInscriptos().contains(usuario3));
		assertTrue(this.excursion.getEspera().contains(usuario3));
	}
}

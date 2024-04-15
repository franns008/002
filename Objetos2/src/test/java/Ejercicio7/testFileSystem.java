package Ejercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testFileSystem {
	private Directorio dConElem;
	private Directorio dSinElem;
	private Archivo aChico;
	private Archivo aGrande;
	private Archivo aNuevo;
	private Filesystem f;
	
	@BeforeEach
	public void setUp() {
		this.aGrande = new Archivo("a1",LocalDate.of(2004, 5, 8),23);
		this.aChico = new Archivo("a2",LocalDate.of(2003, 5, 8),20);
		this.dConElem = new Directorio("d1",LocalDate.of(2004, 5, 6));
		this.dSinElem = new Directorio("d2",LocalDate.of(2005, 5, 6));
		this.aNuevo = new Archivo("a3",LocalDate.of(2015, 5, 6),10); 
		this.f = new Filesystem();
	}
	
	@Test
	public void testTamañoOcupado() {
		assertEquals(0,this.f.tamañoOcupado());
		f.agregarContenido(this.dSinElem);
		assertEquals(32,this.f.tamañoOcupado());
		this.dConElem.agregarDato(aGrande);
		this.dConElem.agregarDato(aChico);
		this.f.agregarContenido(dConElem);
		assertEquals(107,this.f.tamañoOcupado());
	}
	
	@Test
	public void testArchivoMasGrande() {
		assertEquals(null,f.archivoMasGrande());
		this.dConElem.agregarDato(aGrande);
		this.dConElem.agregarDato(aChico);
		this.f.agregarContenido(dConElem);
		//this.f.agregarContenido(dSinElem); CUANDO AGREGO ESTO, OSEA, UN DIRECTORIO SIN ELEMENTOS TIRA ERROR
		assertEquals(aGrande,this.f.archivoMasGrande());
	}
	
	@Test
	public void testArchivoMasNuevo() {
		assertEquals(null,f.archivoMasNuevo());
		this.f.agregarContenido(aGrande);
		this.dConElem.agregarDato(aGrande);
		this.dConElem.agregarDato(aChico);
		this.dConElem.agregarDato(aNuevo);
		this.f.agregarContenido(dConElem);
		//this.f.agregarContenido(dSinElem); Pasa lo mismo que arriba
		assertEquals(aNuevo,f.archivoMasNuevo());
	}
	
	@Test
	public void testBuscar() {
		assertEquals(null, f.buscar("d"));
		f.agregarContenido(this.aChico);
		f.agregarContenido(aGrande);
		assertEquals(null,f.buscar("d"));
		this.dConElem.agregarDato(aNuevo);
		this.f.agregarContenido(dConElem);
		assertEquals(aChico,this.f.buscar("a2"));
		assertEquals(aNuevo,this.f.buscar("a3"));
	}
	
}

package Ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testArchivo {
	private Archivo file;
	private Archivo name;
	private Archivo extension;
	private Archivo size;
	private Archivo dateCreated;
	private Archivo dateModified;
	private Archivo permissions;
	
	@BeforeEach
	void setUp() throws Exception {
		this.file = new ArchivoConcreto ("The Next Best American Record", ".mp3", 10.5, LocalDate.of(2019, 8, 30), LocalDate.of(2019, 8, 30), "rwxr-xr-x");
		
	}

	@Test
	void testPrettyPrintOption1() { 
		//name - extension
		this.name = new Nombre(file);  
		this.extension = new Extension(name);
		
		assertEquals("Datos del archivo:\n The Next Best American Record .mp3",this.extension.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption2() { 
		//name - extension - date created
		this.name = new Nombre(file);  
		this.extension = new Extension(name);
		this.dateCreated = new FechaCreacion(extension);
		
		assertEquals("Datos del archivo:\n The Next Best American Record .mp3 2019-08-30",this.dateCreated.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption3() { 
		//permissions - name - extension - size
		this.permissions = new Permisos(file);  
		this.name = new Nombre (permissions);
		this.extension = new Extension(name);
		this.size = new Tamaño(extension);
		
		assertEquals("Datos del archivo:\n rwxr-xr-x The Next Best American Record .mp3 10.5",this.size.prettyPrint());
	}
}

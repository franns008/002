package Ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testTopologia {
	private Agua agua;
	private Tierra tierra;
	private Mixto mixto1;
	private Mixto mixto2a;
	private Mixto mixto2;
	
	@BeforeEach
	public void setUp() {
		this.agua = new Agua();
		this.tierra = new Tierra();
		this.mixto1 = new Mixto(agua,tierra,agua,tierra);
		this.mixto2 = new Mixto(agua,tierra,agua,mixto1);
		this.mixto2a =new Mixto(tierra,agua,agua,mixto1);
	}
	
	@Test
	public void testProporcionAgua() {
		assertEquals(0.5, this.mixto1.proporcionAgua());
		assertEquals(1,this.agua.proporcionAgua());
		assertEquals(0, this.tierra.proporcionAgua());
		assertEquals(0.625,this.mixto2.proporcionAgua());
		assertEquals(0.625,this.mixto2a.proporcionAgua());
	}
	@Test
	public void testEquals() {
		assertEquals(true,this.agua.equals(agua));
		assertEquals(false,this.agua.equals(tierra));
		assertEquals(false,mixto1.equals(mixto2));
		assertEquals(false,mixto1.equals(tierra));
		assertEquals(false,mixto2.equals(mixto2a));
	}
}

package Ejercicio24;


import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testProcessStep {
	private MixingTank tank;
	private ProcessStep light;
	private ProcessStep purge;
	
	@BeforeEach
	public void setUp() {
		tank = new MixingTankSTUB();
		light = new LightMix();
		purge = new Purge();
	}
	
	@Test
	public void testExecute() {
		this.light.execute(tank);
		assertEquals(true,this.light.isDone());
		this.purge.execute(tank);
		assertEquals(true,this.purge.isDone());
	}
	
	
}
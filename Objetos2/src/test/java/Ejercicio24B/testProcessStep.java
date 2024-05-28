package Ejercicio24B;

import org.junit.jupiter.api.BeforeEach;
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
		tank = new MixingTankMock();
		light = new LightMix();
		purge = new Purge();
	}
	
	@Test
	public void testExecute() {
		this.light.execute(tank);
		assertEquals(2,this.tank.getTimeElapsed());
		assertEquals(10,this.tank.temperature());
		assertEquals(5,this.tank.getMixerPower());
		assertEquals(true,this.light.isDone());
		this.purge.execute(tank);
		assertEquals(4,this.tank.getTimeElapsed());
		assertEquals(0,this.tank.temperature());
		assertEquals(0,this.tank.getMixerPower());
		assertEquals(true,this.light.isDone());
	}
}

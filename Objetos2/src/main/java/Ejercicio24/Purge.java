package Ejercicio24;

public class Purge extends ProcessStep {
	
	public boolean basicExecute(MixingTank tank) {
		return (tank.heatPower(0)&&
				tank.mixerPower(0)&&
				tank.purge());
	}

}

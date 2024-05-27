package Ejercicio24;

public class LightMix extends ProcessStep {
	
	public boolean basicExecute(MixingTank tank) {
		return (tank.heatPower(20) &&
				tank.mixerPower(5));
	}
}

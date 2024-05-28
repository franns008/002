package Ejercicio24B;

public class LightMix extends ProcessStep {
	
	public boolean basicExecute(MixingTank tank) {
		double temp = tank.temperature(); 
		tank.setHeatPower(100);
		tank.setTimeElapsed(2);
		if(tank.temperature()-temp == 10 ){
		   tank.setMixerPower(5);
		   return true;
		}else {
		  return false;
		}

	}
}

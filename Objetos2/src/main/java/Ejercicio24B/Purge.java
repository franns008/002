package Ejercicio24B;

public class Purge extends ProcessStep {
	
	public boolean basicExecute(MixingTank tank) {
		if (tank.upTo() == 0) {
		   return false;
		} else {
		 tank.setHeatPower(0);
		 tank.setMixerPower(0);
		 tank.purge(); 
		 tank.setTimeElapsed(4);
		 if (tank.upTo() != 0){
			return false;
		 }
		 	return true;
		}

	}

}

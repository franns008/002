package Ejercicio24B;



public class MixingTankMock extends MixingTank {
		

		public boolean setHeatPower(int percentage) {
			this.heatPower=percentage;
			return true;
		}
		
		public boolean setMixerPower(int percentage) {
			this.mixerPower=percentage;
			return true;
		}
		
		public boolean purge() {
			return true;
		}
		
		public double upTo() {
			return this.volume;
		}

		@Override
		public int temperature() {
			if(this.getHeatPower()==100) {
				return this.timeElapsed*5;
			}
			if(this.getHeatPower()==75) {
				return this.timeElapsed*4;
			}
			if(this.getHeatPower()==50) {
				return this.timeElapsed*2;
			}
			if(this.getHeatPower()==25) {
				return this.timeElapsed*1;
			}
			return this.timeElapsed*0;
		}
}

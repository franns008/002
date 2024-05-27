package Ejercicio24;



public class MixingTankSTUB extends MixingTank {
	

		public boolean heatPower(int percentage) {
			return true;
		}
		
		public boolean mixerPower(int percentage) {
			return true;
		}
		
		public boolean purge() {
			return true;
		}
		
		public double upTo() {
			return 50;
		}

		@Override
		public double temperature() {
			return 41;
		}
}

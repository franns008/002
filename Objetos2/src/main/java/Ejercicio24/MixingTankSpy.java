package Ejercicio24;



public class MixingTankSpy extends MixingTank {
	
		
	public MixingTankSpy(int heatPower, int mixerPower) {
		super(heatPower, mixerPower);
		// TODO Auto-generated constructor stub
	}

	public boolean heatPower(int percentage) {
		this.heatPower = percentage;
		return true;
	}
	
	public boolean mixerPower(int percentage) {
		this.mixerPower=percentage;
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
		return 5;
	}
	
}

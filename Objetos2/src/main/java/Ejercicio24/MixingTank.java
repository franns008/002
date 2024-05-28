package Ejercicio24;

public abstract class MixingTank {
	
	protected int heatPower;
	protected  int mixerPower;
	
	
	
	public MixingTank(int heatPower, int mixerPower) {
		super();
		this.heatPower = heatPower;
		this.mixerPower = mixerPower;
	}
	public abstract boolean heatPower(int percentage);
	public abstract boolean mixerPower(int percentage);
	public abstract boolean purge();
	public abstract double upTo();
	public abstract double temperature();
	
	public int getMixerPower() {
		return this.mixerPower;
	}
	
	public int getHeatPower() {
		return this.heatPower;
	}
}

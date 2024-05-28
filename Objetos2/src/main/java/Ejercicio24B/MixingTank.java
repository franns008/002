package Ejercicio24B;

public abstract class MixingTank {
	
	protected int temperature;
	protected int volume;
	protected int heatPower;
	protected int mixerPower;
	protected int timeElapsed;
	
	
	public MixingTank() {
		super();
		this.volume = 100;
		this.heatPower = 0;
		this.mixerPower = 0;
	}
	public abstract boolean setHeatPower(int percentage);
	public abstract boolean setMixerPower(int percentage);
	public abstract boolean purge();
	public abstract double upTo();
	public abstract int temperature();
	
	
	public int getHeatPower() {
		return heatPower;
	}
	
	public int getMixerPower() {
		return mixerPower;
	}
	
	public void setTimeElapsed(int time) {
		this.timeElapsed = time;
	}

	public int getTimeElapsed() {
		return this.timeElapsed;
	}
}

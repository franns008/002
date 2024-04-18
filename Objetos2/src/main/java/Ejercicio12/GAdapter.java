package Ejercicio12;

public class GAdapter implements Connection {
	public GConnection g;

	public GAdapter() {
		super();
		this.g = new GConnection();
	}
	
	public String sendData(String data, long crc) {
		return this.g.transmit(data, crc);
	}
	
	public String pict() {
		return this.g.getSymb();
	}
}

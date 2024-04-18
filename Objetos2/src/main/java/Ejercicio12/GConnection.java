package Ejercicio12;

public class GConnection {
	public String symb;

	public GConnection() {
		this.symb = "Simbolo 4G";
	}
	
	public String transmit(String data, long crc) {
		return "transmitting data with 4G Connection";
	}
	
	public String getSymb() {
		return this.symb;
	}
}

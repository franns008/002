package Ejercicio12;

public class WifiConn implements Connection {
	public String pict;
	
	public WifiConn() {
		this.pict="Simbolo Wifi";
	}
	
	public String sendData(String data, long crc) {
		return "transmitting data with Wifi Connection";
	}
	
	public String pict() {
		return this.pict;
	}
	
}

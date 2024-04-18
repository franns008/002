package Ejercicio12;

public class Dispositivo {
	public Calculator crcCalculator;
	public Display display;
	public Ringer ringer;
	public Connection c;
	
	public Dispositivo() {
		this.c = new GAdapter();
		this.crcCalculator = new CRC16_Calculator();
		this.display = new Display();
		this.ringer = new Ringer();
	}
	
	public String send (String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.c.sendData(data,crc);
	}
	
	public String conectarCon (Connection connection) {
		this.c= connection;
		this.display.showBanner(connection.pict());
		this.ringer.ring();
		return "connection changed";
	}
	
	public String configurarCRC (Calculator calculator) {
		this.crcCalculator = calculator;
		return "crc calculator changed";
	}
}

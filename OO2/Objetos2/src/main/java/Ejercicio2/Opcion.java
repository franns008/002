package Ejercicio2;

public interface Opcion {
	
	public abstract int enfrentarseCon(Opcion opcion);
	public abstract int enfrentarseCon(Piedra piedra);
	public abstract int enfrentarseCon(Papel papel);
	public abstract int enfrentarseCon(Tijera tijera);
	
}

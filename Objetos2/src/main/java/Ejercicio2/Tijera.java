package Ejercicio2;

public class Tijera implements Opcion {

	@Override
	public int enfrentarseCon(Opcion opcion) {
		return opcion.enfrentarseCon(this);
	}

	@Override
	public int enfrentarseCon(Piedra piedra) {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int enfrentarseCon(Papel papel) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int enfrentarseCon(Tijera tijera) {
		// TODO Auto-generated method stub
		return 2;
	}

}

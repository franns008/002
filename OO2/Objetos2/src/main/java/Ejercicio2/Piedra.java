package Ejercicio2;

public class Piedra implements Opcion {

	@Override
	public int enfrentarseCon(Opcion opcion) {
		return opcion.enfrentarseCon(this);
	}

	@Override
	public int enfrentarseCon(Piedra piedra) {
		// TODO Auto-generated method stub
		return 2;
	}
	public int enfrentarseCon(Tijera tijera) {
		// TODO Auto-generated method stub
		return 3;
	}

	public int enfrentarseCon(Papel Papel) {
		// TODO Auto-generated method stub
		return 1;
	}

}

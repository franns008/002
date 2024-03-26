package Ejercicio2;

public class Test {

	public static void main(String[] args) {
		Papel pa = new Papel();
		Tijera ti = new Tijera();
		Piedra pi = new Piedra();
		if(pa.enfrentarseCon(pi) == 1) {
			System.out.print("Pierde  "+1);
		}else if(pa.enfrentarseCon(pi) == 2){
			System.out.print("Empate  "+2);
		}else{
			System.out.print("Gana  "+3);
		}
	} 

}

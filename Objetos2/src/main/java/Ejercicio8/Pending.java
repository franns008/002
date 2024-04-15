package Ejercicio8;

import java.time.*;

public class Pending extends Estado{
	
	public Pending(ToDoItem item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		this.item.cambiarEstado(new InProgress(this.item));
		this.item.iniciar(Instant.now());;
	}
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	public void finish() {
		
	}
	@Override
	public Duration workedTime() {
		throw new RuntimeException("El objeto ToDoItem se encuentra finalizado");
	}
}


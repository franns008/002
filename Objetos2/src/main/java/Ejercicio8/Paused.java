package Ejercicio8;

import java.time.*;

public class Paused extends Estado{
	
	
	public Paused(ToDoItem item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	public void start() {
		
	}
	public void togglePause() {
		this.item.cambiarEstado(new InProgress(this.item));
	}
	public void finish() {
		this.item.cambiarEstado(new Finished(this.item));
		this.item.finalizar(Instant.now());
	}
	
	
}

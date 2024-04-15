package Ejercicio8;

import java.time.*;

public class InProgress extends Estado{
	

	public InProgress(ToDoItem item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	public void start() {
		
	}
	public void togglePause() {
		this.item.cambiarEstado(new Paused(this.item));
	}
	public void finish() {
		this.item.cambiarEstado(new Finished(this.item));
		this.item.finalizar(Instant.now());
	}
	
}

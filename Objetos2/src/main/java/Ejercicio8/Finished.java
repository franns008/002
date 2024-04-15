package Ejercicio8;

import java.time.*;

public class Finished extends Estado{
	
	
	public Finished(ToDoItem item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	public void start() {
		
	}
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public void finish() {
		
	}
	public Duration workedTime() {
		return Duration.between(this.item.getInicio(), this.item.getFin());
	}
	@Override
	public void addComment(String comment) {
		
	}
}

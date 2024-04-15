package Ejercicio8;

import java.time.*;;

public abstract class Estado {
	protected ToDoItem item;
	
	
	public Estado(ToDoItem item) {
		super();
		this.item = item;
	}
	
	public void addComment(String comment) {
		this.item.agregarComEstado(comment); // duda aca, porque tengo dos metodos para "hacer lo mismo"
		
	}
	
	public ToDoItem getItem() {
		return this.item;
	}
	
	public Duration workedTime() {
		return Duration.between(this.item.getInicio(), Instant.now());
	}
	
	public abstract void start();
	public abstract void togglePause();
	public abstract void finish();
	
}

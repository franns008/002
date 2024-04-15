package Ejercicio8;

import java.time.*;
import java.util.*;
public class ToDoItem {
	
	private String name;
	private ArrayList<String> comentarios;
	private Estado estado;
	private Instant inicio;
	private Instant fin;
	
	public ToDoItem(String name) {
		this.estado = new Pending(this);
		this.name = name;
		this.comentarios = new ArrayList();
	}
	
	public void cambiarEstado(Estado e) {
		this.estado = e;
	}
	
	public void start() {
		this.estado.start();
	}
	
	public void togglePause() {
		this.estado.togglePause();
	}
	
	public void finish() {
		this.estado.finish();
	}

	public Duration workedTime() {
		return this.estado.workedTime();
	}
	public void addComments(String comment) {
		this.estado.addComment(comment);
	}
	
	public void iniciar(Instant i) {
		this.inicio = i;
	}

	public void finalizar (Instant i) {
		this.fin = i;
	}
	public Instant getInicio() {
		return inicio;
	}

	public Instant getFin() {
		return fin;
	}
	
	public void agregarComEstado(String c) {
		this.comentarios.add(c);
	}
	
}

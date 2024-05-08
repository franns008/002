package Ejercicio21;
import java.util.*;

import java.time.*;

public class Mamifero extends AbstractMamifero {

	public Mamifero(String nombre){
		super(nombre);
	}
	public String getIdentificador() {
		return Identificador;
	}

	public void setIdentificador(String identificador) {
		Identificador = identificador;
	}

	public String getEspecie() {
		return Especie;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.FechaNacimiento = fechaNacimiento;
	}

	public void setEspecie(String especie) {
		Especie = especie;
	}

	public void setPadre(Mamifero padre) {
		Padre = padre;
	}

	public AbstractMamifero getPadre() {
		return Padre;
	}
	
	public void setMadre(Mamifero madre) {
		Madre = madre;
	}
	
	public AbstractMamifero getMadre() {
		return Madre;
	}
	public AbstractMamifero getAbueloMaterno() {
		return this.Madre.getPadre();
	}
	
	public AbstractMamifero getAbuelaMaterna() {
		return this.Madre.getMadre();
	}
	
	public AbstractMamifero getAbueloPaterno() {
		return this.Padre.getPadre();
	}
	
	public AbstractMamifero getAbuelaPaterna() {
		return this.Padre.getMadre();
	}
	public boolean tieneComoAncestroA(AbstractMamifero unMamifero) {
		return (this.tieneAncestro(this.getMadre(), unMamifero) || this.tieneAncestro(this.getPadre(),unMamifero));
	}
	
	private boolean tieneAncestro(AbstractMamifero parent, AbstractMamifero unMamifero) {
		return (unMamifero.equals(parent) || parent.tieneComoAncestroA(unMamifero));
	}
}

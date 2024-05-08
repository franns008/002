package Ejercicio21;

import java.time.LocalDate;

public abstract class AbstractMamifero {
	protected String Identificador;
	
	protected String Especie;
	
	protected LocalDate FechaNacimiento;
	
	protected AbstractMamifero Madre;
	
	protected AbstractMamifero Padre;
	
	public AbstractMamifero(String nombre){
		this.Identificador = nombre;
		this.Especie = null;
		this.Madre = new NullMamifero("");
		this.Padre = new NullMamifero("");
	}
	
	public abstract String getIdentificador();
	public abstract void setIdentificador (String especie);
	public abstract String getEspecie();
	public abstract void setFechaNacimiento(LocalDate fechaNacimiento);
	public abstract void setEspecie(String especie);
	public abstract void setPadre(Mamifero padre);
	public abstract AbstractMamifero getPadre();
	public abstract void setMadre(Mamifero madre);
	public abstract AbstractMamifero getMadre();
	public abstract AbstractMamifero getAbueloMaterno();
	public abstract AbstractMamifero getAbuelaMaterna();
	public abstract AbstractMamifero getAbueloPaterno();
	public abstract AbstractMamifero getAbuelaPaterna();
	public abstract boolean tieneComoAncestroA(AbstractMamifero unMamifero);
}

package Ejercicio21;

import java.time.LocalDate;

public class NullMamifero  extends AbstractMamifero{

	public NullMamifero(String nombre) {
		super(nombre);
	}

	@Override
	public String getIdentificador() {
		return null;
	}

	@Override
	public void setIdentificador(String especie) {
	
	}

	@Override
	public String getEspecie() {
		return null;
	}

	@Override
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		
	}

	@Override
	public void setEspecie(String especie) {
		
	}

	@Override
	public void setPadre(Mamifero padre) {
	
		
	}

	@Override
	public Mamifero getPadre() {
		return null;
	}

	@Override
	public void setMadre(Mamifero madre) {
		
	}

	@Override
	public Mamifero getMadre() {
		return null;
	}

	@Override
	public Mamifero getAbueloMaterno() {
		return null;
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		return null;
	}

	@Override
	public Mamifero getAbueloPaterno() {
		return null;
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		return null;
	}

	@Override
	public boolean tieneComoAncestroA(AbstractMamifero unMamifero) {
		return false;
	}

}

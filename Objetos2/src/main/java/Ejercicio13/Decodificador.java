package Ejercicio13;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private Estrategia e;
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Pelicula> peliculasV;
	
	public Decodificador() {
		super();
		this.e = new Novedad();
		this.peliculas = new ArrayList();
		this.peliculasV = new ArrayList();
	}
	
	public void agregarPelicula(Pelicula p) {
		this.peliculas.add(p);
	}
	
	public void agregarPeliculaV(Pelicula p) {
		this.peliculasV.add(p);
	}
	
	public void setSugerencia(Estrategia e) {
		this.e = e;
	}
	
	public List solicitarSugerencias() {
		return this.e.sugerirPeliculas(this);
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public ArrayList<Pelicula> getPeliculasV() {
		return peliculasV;
	}

}

package Ejercicio1;

import java.util.*;

public class Twitter {
	
	private ArrayList<Usuario> usuarios;
	
	public Twitter() {
		usuarios = new ArrayList();
	}
	public Usuario crearUsuario (String nombre) {
		if (usuarios.stream()
				.anyMatch(usuario -> usuario.nombreIgual(nombre))) {
			return null;
		}else {
			Usuario usuario = new Usuario(nombre);
			usuarios.add(usuario);
			return usuario;
		}
	}
	
	public boolean eliminarUsuario(String nombre) {
		Usuario usuario = usuarios.stream()
				.filter(user -> user.nombreIgual(nombre))
				.findFirst()
				.orElse(null);
		if (usuario==null) {
			return false;
		}else {
			usuario.eliminarTweets(); // ¿Hace falta?, si yo elimino el usuario ¿El garbage colector no elimina tambien la lista de tweets?
			this.usuarios.remove(usuario);
			return true;
		}
	}
	
	public Tweet crearTweet(String texto,Usuario usuario) {
		return usuario.CrearTweet(texto);
	}
	
	public Retweet crearRetweet(Tweet tweet, Usuario usuario) {
		return usuario.CrearReTweet(tweet);
	}
}

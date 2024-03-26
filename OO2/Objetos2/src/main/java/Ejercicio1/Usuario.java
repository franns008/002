package Ejercicio1;

import java.util.*;

public class Usuario {
	private String screenName;
	
	private ArrayList<Posteo> Tweets; 
	
	public Usuario (String screenName) {
		this.screenName =screenName;
		this.Tweets = new ArrayList<Posteo>();
	}
	
	public Tweet CrearTweet(String texto) {
		if (texto.length()>1 && texto.length()<280){
		Tweet tweet =  new Tweet(texto); /* preguntar porque anda mal*/
		this.Tweets.add(tweet);
		return tweet;
		}else {
			return null;
		}
	}
	
	public Retweet CrearReTweet(Tweet tweet) {
		Retweet reTweet =  new Retweet(tweet);
		this.Tweets.add(reTweet);
		return reTweet;
	}
	
	public boolean nombreIgual(String nombre) {
		return screenName.equals(nombre);
	}
	
	public int CantTweets() {
		return this.Tweets.size();
	}
	public void eliminarTweets() {
		this.Tweets.stream().forEach(p -> p.eliminar());
	}
}

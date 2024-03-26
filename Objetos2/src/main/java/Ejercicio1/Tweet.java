package Ejercicio1;

import java.util.*;

public class Tweet implements Posteo{
	private String texto;
	
	private ArrayList<Retweet> reTweets;
	
	public Tweet (String texto) {
		this.texto = texto;
		this.reTweets = null;
	}
	
	public void agregarReTweet(Retweet retweet) {
		this.reTweets.add(retweet);
	}
	
	public String verPosteo() {
		return this.texto;
	}
	public void eliminar() {
		this.reTweets.stream().forEach(r -> r.eliminar());
	}
}

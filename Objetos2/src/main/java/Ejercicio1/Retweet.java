package Ejercicio1;

public class Retweet implements Posteo  {
	
	private Tweet tweet;
	
	public Retweet (Tweet tweet) {
		this.tweet = tweet;
	}
	
	public String verPosteo() {
		if(tweet == null) {
			return null;
		}else {
			return tweet.verPosteo();
		}
	}
	public void eliminar() {
		this.tweet = null;
	}
}

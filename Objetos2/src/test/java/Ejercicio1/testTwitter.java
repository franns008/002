package Ejercicio1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testTwitter {
	
	private Twitter twitter;
	private Usuario usuarioConTwits;
	private Usuario usuarioSinTwits;
	private Usuario usuarioConRetwits;

	@BeforeEach
	public void incializar() {
		this.twitter = new Twitter();
		usuarioConTwits = twitter.crearUsuario("Juan");
		usuarioSinTwits = twitter.crearUsuario("Francisco");
		usuarioConRetwits = twitter.crearUsuario("Ricardo");
	}
	
	@Test
	public void testCrearUsuario() {
		assertEquals(null,twitter.crearUsuario("Juan"));
		assertNotEquals(null,twitter.crearUsuario("Pedro"));
	}
	
	@Test
	public void testEliminar() {
		assertEquals(true,twitter.eliminarUsuario("Juan"));
		assertEquals(false,twitter.eliminarUsuario("Lucas"));
		assertEquals(false,twitter.eliminarUsuario("Juan"));
	}
	
	@Test
	public void testTweets() {
		assertNotEquals(null,twitter.crearTweet("Hola", usuarioConRetwits));
		assertNotEquals(null,twitter.crearTweet("Hola2", usuarioConRetwits));
		assertEquals(null,twitter.crearTweet("", usuarioConRetwits));
		assertEquals(null,twitter.crearTweet("HOLAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAA A   A  AAA "
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA "
				+ "  A A KN JAHJ AHKJAJ KLJA KLNA KLNKLA KL AKLN KAKA  AFADLJ NSKLHA A NKL NAKLN ", usuarioConRetwits));
		assertEquals(2,usuarioConRetwits.CantTweets());
		
	}
	
	@Test
	public void testReTweets() {
		Tweet tweets = twitter.crearTweet("hola1", usuarioConTwits);
		Retweet retweet = twitter.crearRetweet(tweets, usuarioConRetwits);
		assertEquals("hola1",retweet.verPosteo());
		assertEquals(1,usuarioConRetwits.CantTweets());
	}
	
}

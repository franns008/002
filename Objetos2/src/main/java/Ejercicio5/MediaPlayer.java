package Ejercicio5;

import java.util.*;

public class MediaPlayer {

	private  ArrayList<Media> media;

	public MediaPlayer() {
		super();
		this.media = new ArrayList();
	}
	
	public void play() {
		media.stream()
			.forEach(m -> m.play());
	}
	
}

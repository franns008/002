package Ejercicio5;

public class VideoStreamAdapter implements Media {
	private VideoStream videoStream;
	
	public VideoStreamAdapter() {
		this.videoStream = new VideoStream();
	}
	
	public String play() {
		return this.videoStream.reproduce();
	}
}

public class Balloon extends Aircraft {
	public Balloon(String name, int longitude, int latitude, int height) {
		super(name, longitude, latitude, height);
	}

	@Override
	public void	updateWeather(String weather){
		System.out.println("Balloon " + name + " réagit à la météo: " + weather);
	}
}

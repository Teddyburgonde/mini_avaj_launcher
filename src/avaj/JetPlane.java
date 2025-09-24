public class JetPlane extends Aircraft {
	public JetPlane(String name, int longitude, int latitude, int height) {
		super(name, longitude, latitude, height);
	}

	@Override
	public void	updateWeather(String weather){
		System.out.println("JetPlane " + name + " réagit à la météo: " + weather);
	}
}

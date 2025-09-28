package avaj.aircraft;

public class JetPlane extends Aircraft {
	public JetPlane(String name, int longitude, int latitude, int height) {
		super(name, longitude, latitude, height);
	}

	@Override
	public void	updateWeather(String weather){
		// - appliquer les règles météo (modifier latitude/height)
		// - utiliser Logger.log(...)
	}
}

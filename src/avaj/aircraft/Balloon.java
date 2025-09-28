package avaj.aircraft;

public class Balloon extends Aircraft {
	public Balloon(String name, int longitude, int latitude, int height) {
		super(name, longitude, latitude, height);
	}

	@Override
	public void	updateWeather(String weather){
		// - appliquer les règles météo (modifier longitude/latitude/height)
		// - utiliser Logger.log(...) 
	}
}

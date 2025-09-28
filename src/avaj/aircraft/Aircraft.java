package avaj.aircraft;

public abstract class Aircraft {

	protected String name;
	protected int longitude;
	protected int latitude;
	protected int height;

	public Aircraft(String name, int longitude, int latitude, int height){
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
		this.height = height;
	}

	public abstract void updateWeather(String weather);
}
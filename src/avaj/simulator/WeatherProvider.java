package avaj.simulator;

public class WeatherProvider {

	private static WeatherProvider instance = new WeatherProvider();

    private WeatherProvider() {}

    public static WeatherProvider getProvider() {
        return instance;
    }

	public String getCurrentWeather(/* Coordinates coordinates */) {
		// ⚠️ Version finale : dépendra des coordonnées
		int random = (int)(Math.random() * 4);
		if (random == 0)
			return "SUN";
		if (random == 1)
			return "RAIN";
		if (random == 2)
			return "FOG";
		else
			return "SNOW";
	}
}
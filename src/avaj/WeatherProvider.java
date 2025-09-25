public class WeatherProvider {

	public String getCurrentWeather() {
		
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
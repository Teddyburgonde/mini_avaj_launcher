public class WeatherTower {

	private WeatherProvider provider = new WeatherProvider();

	public void changeWeather(Aircraft aircraft) {
		String weather = provider.getCurrentWeather();
		aircraft.updateWeather(weather);
	}
}

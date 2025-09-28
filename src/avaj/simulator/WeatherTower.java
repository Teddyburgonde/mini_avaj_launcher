package avaj.simulator;

import java.util.ArrayList;
import java.util.List;
import avaj.aircraft.Aircraft;

public class WeatherTower {

    private List<Aircraft> observers = new ArrayList<>();

    public void register(Aircraft aircraft) {
        observers.add(aircraft);
        // ⚠️ Version finale : Logger.log("Tower says: " + aircraft + " registered to weather tower.")
    }

    public void unregister(Aircraft aircraft) {
        observers.remove(aircraft);
        // ⚠️ Version finale : Logger.log("Tower says: " + aircraft + " unregistered from weather tower.")
    }

    public void changeWeather() {
        String weather = WeatherProvider.getProvider().getCurrentWeather(/* coords */);
        for (Aircraft a : observers) {
            a.updateWeather(weather);
        }
    }
}
package avaj.aircraft;

import avaj.simulator.Logger;
import avaj.simulator.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {

    private WeatherTower tower;

    public JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = tower.getWeather(this.coordinates);

        switch (weather) {
            case "SUN":
                this.coordinates = new Coordinates(
                    coordinates.getLongitude(),
                    coordinates.getLatitude() + 10,
                    coordinates.getHeight() + 2
                );
                Logger.log(this + ": It's sunny. Let's enjoy the view.");
                break;

            case "RAIN":
                this.coordinates = new Coordinates(
                    coordinates.getLongitude(),
                    coordinates.getLatitude() + 5,
                    coordinates.getHeight()
                );
                Logger.log(this + ": Damn rain! Slowing down.");
                break;

            case "FOG":
                this.coordinates = new Coordinates(
                    coordinates.getLongitude(),
                    coordinates.getLatitude() + 1,
                    coordinates.getHeight()
                );
                Logger.log(this + ": Can't see anything in this fog.");
                break;

            case "SNOW":
                this.coordinates = new Coordinates(
                    coordinates.getLongitude(),
                    coordinates.getLatitude(),
                    coordinates.getHeight() - 7
                );
                Logger.log(this + ": OMG! Winter is coming! We're gonna freeze.");
                break;
        }

        // Clamp la hauteur max à 100
        if (this.coordinates.getHeight() > 100) {
            this.coordinates = new Coordinates(
                this.coordinates.getLongitude(),
                this.coordinates.getLatitude(),
                100
            );
        }

        // Atterrissage si height <= 0
        if (this.coordinates.getHeight() <= 0) {
            Logger.log(this + " landing.");
            tower.unregister(this);
        }
    }

    @Override
    public void registerTower(WeatherTower tower) {
        this.tower = tower;
        tower.register(this);
        Logger.log("Tower says: " + this + " registered to weather tower.");
    }
}

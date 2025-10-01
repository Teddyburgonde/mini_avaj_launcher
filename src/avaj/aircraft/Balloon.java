package avaj.aircraft;

public class Balloon extends Aircraft {
	
	public Balloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	private static final Logger logger = Logger.getLogger(Balloon.class.getName());
	protected WeatherTower tower;

	@Override
	public void updateConditions(String weather) {
		switch (weather) {
			case "SUN":
				this.coordinates = new Coordinates(
					coordinates.getLongitude() + 2,
					coordinates.getLatitude(),
					coordinates.getHeight() + 4
				);
				logger.info(this + ": Let's enjoy the good weather and take some pics.");
				break;
		
			case "RAIN":
				this.coordinates = new Coordinates(
					coordinates.getLongitude(),
					coordinates.getLatitude(),
					coordinates.getHeight() - 5
				);
				logger.info(this + ": Damn you rain! You messed up my balloon.");
				break;
		
			case "FOG":
				this.coordinates = new Coordinates(
					coordinates.getLongitude(),
					coordinates.getLatitude(),
					coordinates.getHeight() - 3
				);
				logger.info(this + ": Can't see anything! This fog is dangerous.");
				break;
		
			case "SNOW":
				this.coordinates = new Coordinates(
					coordinates.getLongitude(),
					coordinates.getLatitude(),
					coordinates.getHeight() - 15
				);
				Logger.log(this + ": It's snowing. We're gonna crash!");
				break;
		}

		if (this.coordinates.getHeight() > 100) {
			this.coordinates = new Coordinates(
				this.coordinates.getLongitude(),
				this.coordinates.getLatitude(),
				100
			);
		}
		
		// Si l'avion doit atterrir
		if (this.coordinates.getHeight() <= 0) {
			logger.info(this + " landing at [" 
				+ coordinates.getLongitude() + ", " 
				+ coordinates.getLatitude() + "].");
		
			if (tower != null) {
				tower.unregister(this);
	}
}
	}	
}
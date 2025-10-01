package avaj.aircraft;

public class Helicopter extends Aircraft {
	public Helicopter(String name, int longitude, int latitude, int height) {
		super(name, longitude, latitude, height);
	}
	@Override
	public void updateWeather(String weather) {

	}
}




// package avaj.aircraft;

// import avaj.simulator.Logger;
// import avaj.simulator.WeatherTower;

// public class Balloon extends Aircraft implements Flyable {

//     private WeatherTower tower;

//     public Balloon(String name, Coordinates coordinates) {
//         super(name, coordinates);
//     }

//     @Override
//     public void updateConditions() {
//         String weather = tower.getWeather(this.coordinates);

//         switch (weather) {
//             case "SUN":
//                 this.coordinates = new Coordinates(
//                     coordinates.getLongitude() + 2,
//                     coordinates.getLatitude(),
//                     coordinates.getHeight() + 4
//                 );
//                 Logger.log(this + ": Let's enjoy the good weather and take some pics.");
//                 break;

//             case "RAIN":
//                 this.coordinates = new Coordinates(
//                     coordinates.getLongitude(),
//                     coordinates.getLatitude(),
//                     coordinates.getHeight() - 5
//                 );
//                 Logger.log(this + ": Damn you rain! You messed up my balloon.");
//                 break;

//             case "FOG":
//                 this.coordinates = new Coordinates(
//                     coordinates.getLongitude(),
//                     coordinates.getLatitude(),
//                     coordinates.getHeight() - 3
//                 );
//                 Logger.log(this + ": Can't see anything! This fog is dangerous.");
//                 break;

//             case "SNOW":
//                 this.coordinates = new Coordinates(
//                     coordinates.getLongitude(),
//                     coordinates.getLatitude(),
//                     coordinates.getHeight() - 15
//                 );
//                 Logger.log(this + ": It's snowing. We're gonna crash!");
//                 break;
//         }

//         // Hauteur maximale 100
//         if (this.coordinates.getHeight() > 100) {
//             this.coordinates = new Coordinates(
//                 this.coordinates.getLongitude(),
//                 this.coordinates.getLatitude(),
//                 100
//             );
//         }

//         // Atterrissage si height <= 0
//         if (this.coordinates.getHeight() <= 0) {
//             Logger.log(this + " landing.");
//             tower.unregister(this);
//         }
//     }

//     @Override
//     public void registerTower(WeatherTower tower) {
//         this.tower = tower;
//         tower.register(this);
//         Logger.log("Tower says: " + this + " registered to weather tower.");
//     }
// }

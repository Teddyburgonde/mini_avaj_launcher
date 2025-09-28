package avaj.aircraft;

public class AircraftFactory {
	public static Aircraft newAircraft(String type, String name, int longitude, int latitude, int height) {
		if (type.equals("Balloon")) {
			return new Balloon(name, longitude, latitude, height);
		}
		else if (type.equals("JetPlane")){
			return new JetPlane(name, longitude, latitude, height);
		}
		// Dans la version finale : gérer aussi Helicopter
		return null;
	}
}

package avaj.aircraft;

public class AircraftFactory {
	public static Aircraft newAircraft(String type, String name, Coordinates coordinates) {
		if (type.equals("Balloon")) {
			return new Balloon(name, coordinates);
		}
		else if (type.equals("JetPlane")){
			return new JetPlane(name, coordinates);
		}
		else if (type.equals("Helicopter")){
			return new Helicopter(name, coordinates);
		}
		return null;
	}
}
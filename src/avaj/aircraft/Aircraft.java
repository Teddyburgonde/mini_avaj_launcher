package avaj.aircraft;

public abstract class Aircraft {

	protected String name;
	protected Coordinates coordinates;
	protected long id;
	private static long idCounter = 0;

	public Aircraft(String name, Coordinates coordinates){
		this.name = name;
		this.coordinates = coordinates;
		this.id = nextId();
	}

	protected long nextId() {
		return ++idCounter;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "#" + this.name + "(" + this.id + ")";
	}
}

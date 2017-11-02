package exercise2;

public class Location {
	private final String local;
	private final String building;

	public Location(String local, String building) {
		this.local = local;
		this.building = building;
	}

	public String getLocal() {
		return local;
	}

	public String getBuilding() {
		return building;
	}
}

import java.util.ArrayList;

public class Airport extends Station{
	private ArrayList<Plane> planes = new ArrayList<Plane>();
	private int planeAmount = 0;
	
	public Airport(City city, ArrayList<Plane> planes) {
		super(city);
	for (Plane plane : planes) {
		plane.setAirport(this);
	}
		this.planes = planes;
	}
	public Airport(City city) {
		super(city);
	}
	public ArrayList<Plane> getPlanes() {
		return planes;
	}
	public void setPlanes(ArrayList<Plane> planes) {
		for (Plane plane : planes) {
			plane.setAirport(this);
			planeAmount++;
		}
		this.planes = planes;
	}
	public int getPlaneAmount() {
		return planeAmount;
	}
	public void setPlaneAmount(int planeAmount) {
		this.planeAmount = planeAmount;
	}
	public void addPlane(Plane plane) {
		plane.setAirport(this);
		planes.add(plane);
		planeAmount++;
	}
}

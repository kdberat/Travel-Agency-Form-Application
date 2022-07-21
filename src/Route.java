import java.util.ArrayList;

public class Route {
	private double time;
	private ArrayList<City> cities = new ArrayList<City>();
	private ArrayList<Bus> busses = new ArrayList<Bus>();
	private ArrayList<Plane> planes = new ArrayList<Plane>();
	
	public Route(ArrayList<City> cities) {
		this.cities = cities;
	}

	public Route(City city1, City city2) {
		cities.add(city1); cities.add(city2);
	}
	
	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public ArrayList<City> getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}
	
	public ArrayList<Bus> getBusses() {
		return busses;
	}

	public void setBusses(ArrayList<Bus> busses) {
		this.busses = busses;
	}

	public ArrayList<Plane> getPlanes() {
		return planes;
	}

	public void setPlanes(ArrayList<Plane> planes) {
		this.planes = planes;
	}

	public void addBus(Bus bus) {
		busses.add(bus);
	}
	
	public void addPlane(Plane plane) {
		planes.add(plane);
	}
	
	public double calculateDistance() {
		double lat1=0,lat2=0,lon1=0,lon2=0,distance=0;
		for (int i = 0; i < cities.size()-1 ; i++) {
			
				lat1 = cities.get(i).getLatitude() ;
				lon1 = cities.get(i).getLongtitude();

				lat2 = cities.get(i+1).getLatitude();
				lon2 = cities.get(i+1).getLongtitude();
				
				var R = 6371; // Radius of the earth in km
				var dLat = deg2rad(lat2-lat1);  // deg2rad below
				var dLon = deg2rad(lon2-lon1); 
				var a = 
				Math.sin(dLat/2) * Math.sin(dLat/2) +
				Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * 
				Math.sin(dLon/2) * Math.sin(dLon/2); 
				var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
				var d = R * c; // Distance in km
				distance += d;
		}	

		       return (int)distance;
	}
	
	public double deg2rad(double deg) {
		return deg * (Math.PI/180);
	}
	
	public double calculateTime(Vehicle veicle) {
		time = this.calculateDistance()/(double)veicle.getAverageSpeed();
		return time;
	}
	
	public boolean hasAvailableBus() {
		if(getBusses().isEmpty()) {
			return false;
		}
		return true;
	}
	
	public boolean hasAvailablePlane() {
		if(getPlanes().isEmpty()) {
			return false;
		}
		return true;
	}
}

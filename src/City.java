
public class City {
	private double latitude;
	private double longtitude;
	private String cityName;
	private BusStation BusStation;
	private Airport airport;
	
	public City(double latitude, double longtitude, String cityName) {
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.cityName = cityName;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return  cityName;
	}

	public double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}

	public BusStation getBusStation() {
		return BusStation;
	}

	public void setBusStation(BusStation busStation) {
		BusStation = busStation;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}

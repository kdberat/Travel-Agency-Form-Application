import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class Bus extends Vehicle{
	private ArrayList<Assistant> assistants = new ArrayList<Assistant>();
	private ArrayList<Driver> drivers = new ArrayList<Driver>();
	private BusStation busStation;
	private boolean stopOver;
	private String seatOrder;
	private int seatlineCount;
	private boolean seats[];
	
	public Bus(double fuelPerKm, int seatAmount, int averageSpeed, String model,String company, ArrayList<Passanger> passangers,
			String depatureTime, Route route, BusStation busStation, String seatOrder, int seatlineCount) throws ParseException{
		super(fuelPerKm, seatAmount, averageSpeed, model, company, passangers, depatureTime, route);
		this.busStation = busStation;
		this.seatOrder = seatOrder;
		this.seatlineCount = seatlineCount;
		if(route.getCities().size() > 2) stopOver = true;
		calculateSeatAmount();
		seats = new boolean[super.getSeatAmount()];
		clearSeats();
	}

	public ArrayList<Assistant> getAssistants() {
		return assistants;
	}

	public void setAssistants(ArrayList<Assistant> assistants) {
		this.assistants = assistants;
	}

	@Override
	public String toString() {
		return "Bus [assistants=" + assistants + ", drivers=" + drivers + ", busStation=" + busStation + ", stopOver="
				+ stopOver + ", seatOrder=" + seatOrder + ", seatlineCount=" + seatlineCount + ", seats="
				+ Arrays.toString(seats) + "]";
	}

	public ArrayList<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(ArrayList<Driver> drivers) {
		this.drivers = drivers;
	}

	public boolean isStopOver() {
		return stopOver;
	}

	public void setStopOver(boolean stopOver) {
		this.stopOver = stopOver;
	}

	public String getSeatOrder() {
		return seatOrder;
	}

	public void setSeatOrder(String seatOrder) {
		this.seatOrder = seatOrder;
	}

	public int getSeatlineCount() {
		return seatlineCount;
	}

	public void setSeatlineCount(int seatlineCount) {
		this.seatlineCount = seatlineCount;
	}

	public boolean[] getSeats() {
		return seats;
	}

	public void setSeats(boolean[] seats) {
		this.seats = seats;
	}
	
	public BusStation getBusStation() {
		return busStation;
	}

	public void setBusStation(BusStation busStation) {
		this.busStation = busStation;
	}

	public void addDriver(Driver driver) {
		driver.setRoute(this.getRoute());
		drivers.add(driver);
	}
	
	public void addAssistant(Assistant assistant) {
		assistant.setRoute(this.getRoute());
		assistants.add(assistant);
	}
	
	public void updateSeats(int seatNumber) {
		seats[seatNumber] = true;
	}
	
	public void clearSeats() {
		for (boolean seat : seats) {
			seat = false;
		}
	}
	public void arrive() {
		if(this.isStopOver() == true) {
			System.out.println("We won't be able to make stop over");
		}
		this.busStation.setBusAmount(this.busStation.getBusAmount()-1);
		ArrayList<City> cities = super.getRoute().getCities();
		this.setCityInRightNow(cities.get(cities.size()-1));
		this.busStation.getBusses().remove(this);
		getCityInRightNow().getBusStation().addBuss(this);
		this.busStation = getCityInRightNow().getBusStation();
		this.getRoute().getBusses().remove(this);
		clearSeats();	
	}
	
	public void makeStopOver() {
		if(this.isStopOver() == true) {
			this.busStation.setBusAmount(this.busStation.getBusAmount()-1);
			ArrayList<City> cities = super.getRoute().getCities();
			this.setCityInRightNow(cities.get(cities.indexOf(getCityInRightNow())+1));
			this.busStation.getBusses().remove(this);
			getCityInRightNow().getBusStation().addBuss(this);
			this.busStation = getCityInRightNow().getBusStation();
		}
		else {
			System.out.println("This route has no stop overs");
		}
	}
	
	public double calculateCost() {
	    double personelCost = 0;
		for (Assistant assistant : assistants) {
			personelCost += assistant.getWage();
		}
		for (Driver driver : drivers) {
			personelCost += driver.getWage();
		}
		double fuelCost = this.getFuelPerKm()*this.getRoute().calculateDistance();
		this.getCost().setTotalCost((personelCost+fuelCost)/this.getSeatAmount());
		return (personelCost+fuelCost)/this.getSeatAmount();
	}
	
	public void calculateSeatAmount() {
		if(this.seatOrder == "2+2") super.setSeatAmount(4*seatlineCount);
		else super.setSeatAmount(3*seatlineCount);
	}
}
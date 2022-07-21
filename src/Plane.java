import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;

public class Plane extends Vehicle{
	private ArrayList<Hostess> hostesses = new ArrayList<Hostess>();
	private ArrayList<Pilot> pilots = new ArrayList<Pilot>();
	private Airport airport;
	private String seatOrder;
	private int seatlineCount;
	private int vipCount;
	private boolean seats[];
	private boolean vipSeats[];

	public Plane(double fuelPerKm, int seatAmount, int averageSpeed, String model,String company, ArrayList<Passanger> passangers,
			String depatureTime, Route route, ArrayList<Hostess> hostesses,
			ArrayList<Pilot> pilots, Airport airport, String seatOrder, int seatlineCount, int vipCount,
			boolean[] seats, boolean[] vipSeats) throws ParseException{
		super(fuelPerKm, seatAmount, averageSpeed, model, company, passangers, depatureTime, route);
		this.hostesses = hostesses;
		this.pilots = pilots;
		this.airport = airport;
		this.seatOrder = seatOrder;
		this.seatlineCount = seatlineCount;
		this.vipCount = vipCount;
		this.seats = seats;
		this.vipSeats = vipSeats;
		calculateSeatAmount();
		seats = new boolean[super.getSeatAmount()];
		clearSeats();
		this.vipSeats= new boolean[vipCount];
	}

	public ArrayList<Hostess> getHostesses() {
		return hostesses;
	}

	public void setHostesses(ArrayList<Hostess> hostesses) {
		this.hostesses = hostesses;
	}

	public ArrayList<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(ArrayList<Pilot> pilots) {
		this.pilots = pilots;
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

	public int getVipCount() {
		return vipCount;
	}

	public void setVipCount(int vipCount) {
		this.vipCount = vipCount;
	}

	public boolean[] planes() {
		return seats;
	}

	public void setSeats(boolean[] seats) {
		this.seats = seats;
	}
	
	public boolean[] getSeats() {
		return seats;
	}

	public boolean[] getVipSeats() {
		return vipSeats;
	}

	public void setVipSeats(boolean[] vipSeats) {
		this.vipSeats = vipSeats;
	}
	
	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public void updateSeats(int seatNumber) {
		seats[seatNumber] = true;
	}
	
	public void updateVipSeats(int seatNumber) {
		vipSeats[seatNumber] = true;
	}
	
	public void addPilot(Pilot pilot) {
		pilot.setRoute(this.getRoute());
		pilots.add(pilot);
	}
	
	public void addHostess(Hostess hostess) {
		hostess.setRoute(this.getRoute());
		hostesses.add(hostess);
	}
	
	public void clearSeats() {
		for (boolean seat : seats) {
			seat = false;
		}
		for (boolean seat : vipSeats) {
			seat = false;
		}
	}
	
	public void arrive() {
		this.airport.setPlaneAmount(this.airport.getPlaneAmount()-1);
		ArrayList<City> cities = super.getRoute().getCities();
		City lastCity = cities.get(cities.size()-1);
		this.setCityInRightNow(lastCity);
		this.airport.getPlanes().remove(this);
		getCityInRightNow().getAirport().addPlane(this);
		this.airport = getCityInRightNow().getAirport();
		this.getRoute().getPlanes().remove(this);
		clearSeats();
	}
	
	public double calculateCost() {
	    double personelCost = 0;
		for (Hostess hostesse : hostesses) {
			personelCost += hostesse.getWage();
		}
		for (Pilot pilot : pilots) {
			personelCost += pilot.getWage();
		}
		double fuelCost = this.getFuelPerKm()*this.getRoute().calculateDistance();
		this.getCost().setTotalCost((personelCost+fuelCost)/(this.getSeatAmount()+this.getVipCount()));
		return (personelCost+fuelCost)/(this.getSeatAmount()+this.getVipCount());
	}
	
	
	public void calculateSeatAmount() {
		if(this.seatOrder == "3+3") super.setSeatAmount(6*seatlineCount+vipCount); 
		else super.setSeatAmount(10*seatlineCount+vipCount); //3+4+3
	}
}

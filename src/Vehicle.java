import java.util.ArrayList;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Vehicle {
	private double fuelPerKm;
	private int seatAmount;
	private int averageSpeed;
	private String model;
	private ArrayList<Passanger> passangers = new ArrayList<Passanger>();
	private Date depatureTime = new Date();
	private Date arrivingTime = new Date();
	private Route route;
	private String company;
	private City cityInRightNow;
	private Cost cost = new Cost();
	
	public Vehicle(double fuelPerKm, int seatAmount, int averageSpeed, String model,String company, ArrayList<Passanger> passangers,
			String depatureTime, Route route)  throws ParseException {
		this.company = company;
		this.fuelPerKm = fuelPerKm;
		this.averageSpeed = averageSpeed;
		this.model = model;
		this.passangers = passangers;
		this.depatureTime = StringToDate(depatureTime);
		this.arrivingTime.setHours(this.depatureTime.getHours() + (int)route.calculateTime(this));
		this.route = route;
	}
	public double getFuelPerKm() {
		return fuelPerKm;
	}
	public void setFuelPerKm(double fuelPerKm) {
		this.fuelPerKm = fuelPerKm;
	}

	public int getSeatAmount() {
		return seatAmount;
	}

	public void setSeatAmount(int seatAmount) {
		this.seatAmount = seatAmount;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public ArrayList<Passanger> getPassangers() {
		return passangers;
	}

	public void setPassangers(ArrayList<Passanger> passangers) {
		this.passangers = passangers;
	}

	public Date getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(String depatureTime) throws ParseException {
		this.depatureTime = StringToDate(depatureTime);
	}

	public Date getArrivingTime() {
		return arrivingTime;
	}

	public void setArrivingTime(String arrivingTime) throws ParseException{
		this.arrivingTime = StringToDate(arrivingTime);
	}
	 public int getAverageSpeed() {
		return averageSpeed;
	}
	 
	public void setAverageSpeed(int averageSpeed) {
		this.averageSpeed = averageSpeed;
	}
	
	public Route getRoute() {
		return route;
	}
	
	public void setRoute(Route route) {
		this.cityInRightNow = route.getCities().get(0);
		this.route = route;
	}
	
	public City getCityInRightNow() {
		return cityInRightNow;
	}

	public void setCityInRightNow(City cityInRightNow) {
		this.cityInRightNow = cityInRightNow;
	}
	
	public double calculateFuelPrice() {
		 return 1;
	 }

	public Cost getCost() {
		return cost;
	}
	
	public void setCost(Cost cost) {
		this.cost = cost;
	}
	
	public Date StringToDate(String s) throws ParseException{

	    Date result = null;
	    try{
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        result  = dateFormat.parse(s);
	    }

	    catch(ParseException e){
	        e.printStackTrace();

	    }
	    return result ;
	}
	
	public abstract void calculateSeatAmount();
	
	public abstract void arrive();
	
	public abstract double calculateCost();
}

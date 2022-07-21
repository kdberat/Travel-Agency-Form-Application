import java.util.ArrayList;

public class BusStation extends Station{
	private ArrayList<Bus> busses = new ArrayList<Bus>();
	private int busAmount = 0;
	public BusStation(City city, ArrayList<Bus> busses) {
		super(city);
		for (Bus bus : busses) {
			busAmount++;
			bus.setBusStation(this);
		}
		this.busses = busses;
	}
	
	public BusStation(City city) {
		super(city);
	}
	
	public ArrayList<Bus> getBusses() {
		return busses;
	}
	
	public void setBusses(ArrayList<Bus> busses) {
		for (Bus bus : busses) {
			bus.setBusStation(this);
			busAmount++;
		}
		this.busses = busses;
	}
	
	public int getBusAmount() {
		return busAmount;
	}
	
	public void setBusAmount(int busAmount) {
		this.busAmount = busAmount;
	}
	
	public void addBuss(Bus bus) {
		bus.setBusStation(this);
		busses.add(bus);
		busAmount++;
	}
}


public class BusEmployee extends Employee{
	private int hourlyWage;
	
	public BusEmployee(String name, String tcNo, int age, Route route, int hourlyWage) {
		super(name, tcNo, age, route);
		this.hourlyWage = hourlyWage;
	}
 
	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public void calculateWage() { //PerHour
		this.setWage((int) this.getRoute().getTime()*hourlyWage);
	}
}

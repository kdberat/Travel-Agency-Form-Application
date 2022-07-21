
public class PlaneEmployee extends Employee{
	private int wagePerKm;
	public PlaneEmployee(String name, String tcNo, int age, Route route,int wagePerKm) {
		super(name, tcNo, age, route);
		this.wagePerKm = wagePerKm;
	}

	public int getWagePerKm() {
		return wagePerKm;
	}

	public void setWagePerKm(int wagePerKm) {
		this.wagePerKm = wagePerKm;
	}

	public void calculateWage() { //Per Kilometer
		this.setWage((int) this.getRoute().calculateDistance()*wagePerKm);
	}
}

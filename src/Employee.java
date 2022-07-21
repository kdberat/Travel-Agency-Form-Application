
public abstract class Employee extends Person{
	private int wage;
	private double star = 0;
	
	public Employee(String name, String tcNo, int age, Route route) {
		super(name, tcNo, age, route);
	}
	public int getWage() {
		calculateWage();
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public double getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public void updateStar(int star) {
		if(this.star != 0) {
			this.star += star;
			this.star /= 2;
		}
		else {
			this.star = star;
		}
	}
	public abstract void calculateWage();
}

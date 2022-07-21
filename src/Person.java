
public class Person {
	private String name;
	private String tcNo;
	private int age;
	private Route route;
	
	public Person(String name, String tcNo, int age, Route route) {
		this.name = name;
		this.tcNo = tcNo;
		this.age = age;
		this.route = route;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	
}

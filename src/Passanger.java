import java.util.Scanner; 

public class Passanger extends Person{
	private int seatNumber;
	private boolean choice;
	private boolean vip = false;
	
	public Passanger(String name, String tcNo, int age,boolean vip) {
		super(name, tcNo, age, null);
		this.vip = vip;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	public boolean payment(Bus bus) {
		return true;
	}
	
	public int buyTickets(Route route, boolean choice, boolean vip, Bus bus , int seatNumber , Plane plane) {
		this.choice = choice;
		if(choice) {
			if(route.getBusses().get(route.getBusses().indexOf(bus)).getSeats()[seatNumber] == true) {
				System.out.println("That seat has been taken");
				return 0;
			}
			route.getBusses().get(route.getBusses().indexOf(bus)).updateSeats(seatNumber);
			this.seatNumber = seatNumber;
			this.setRoute(route);
		}
		else {
			if(vip) {
				if(route.getPlanes().get(route.getPlanes().indexOf(plane)).getVipSeats()[seatNumber] == true) {
					System.out.println("That seat has been taken");
					return 0;
				}
				route.getPlanes().get(route.getPlanes().indexOf(plane)).updateVipSeats(seatNumber);
			}
			else {
				if(route.getPlanes().get(route.getPlanes().indexOf(plane)).getSeats()[seatNumber] == true) {
					System.out.println("That seat has been taken");
					return 0;
				}
				route.getPlanes().get(route.getPlanes().indexOf(plane)).updateSeats(seatNumber);
			}
			this.seatNumber = seatNumber;
			this.setRoute(route);
		}
		if(this.payment(bus)) {
			System.out.println("Your seat has been succesfully arranged");
			return 1;
		}
		else {
			System.out.println("Payment error");
			return 0;
		}
	}
	
	public void giveStars() {	
		Scanner scanner = new Scanner(System.in);
		int star;
		if(choice) {
			for (Bus bus : this.getRoute().getBusses()) {
				if(bus.getPassangers().contains(this)) {
					System.out.print("Rate our main driver(0-5): ");
					while(true) {
						star = scanner.nextInt();
						if(star <= 5 && star >= 0) {
							bus.getDrivers().get(0).updateStar(star);
							break;
						}
						System.out.print("\nInvalid value please try again: ");
					}
					System.out.print("Rate our backup driver(0-5): ");
					while(true) {
						star = scanner.nextInt();
						if(star <= 5 && star >= 0) {
							bus.getDrivers().get(1).updateStar(star);
							break;
						}
						System.out.print("\nInvalid value please try again: ");
					}
					System.out.print("Rate our main assistant(0-5): ");
					while(true) {
						star = scanner.nextInt();
						if(star <= 5 && star >= 0) {
							bus.getAssistants().get(0).updateStar(star);
							break;
						}
						System.out.print("\nInvalid value please try again: ");
					}
					System.out.print("Rate our backup assistant(0-5): ");
					while(true) {
						star = scanner.nextInt();
						if(star <= 5 && star >= 0) {
							bus.getAssistants().get(1).updateStar(star);
							break;
						}
						System.out.print("\nInvalid value please try again: ");
					}
				}			
			}
		}
		else {
			for (Plane plane : this.getRoute().getPlanes()) {
				if(plane.getPassangers().contains(this)) {
					System.out.print("Rate our main pilot(0-5): ");
					while(true) {
						star = scanner.nextInt();
						if(star <= 5 && star >= 0) {
							plane.getPilots().get(0).updateStar(star);
							break;
						}
						System.out.print("\nInvalid value please try again: ");
					}
					System.out.print("Rate our backup pilot(0-5): ");
					while(true) {
						star = scanner.nextInt();
						if(star <= 5 && star >= 0) {
							plane.getPilots().get(1).updateStar(star);
							break;
						}
						System.out.print("\nInvalid value please try again: ");
					}
					System.out.print("Rate our main hostess(0-5): ");
					while(true) {
						star = scanner.nextInt();
						if(star <= 5 && star >= 0) {
							plane.getHostesses().get(0).updateStar(star);
							break;
						}
						System.out.print("\nInvalid value please try again: ");
					}
					System.out.print("Rate our backup hostess(0-5): ");
					while(true) {
						star = scanner.nextInt();
						if(star <= 5 && star >= 0) {
							plane.getHostesses().get(1).updateStar(star);
							break;
						}
						System.out.print("\nInvalid value please try again: ");
					}
				}			
			}
		}
		scanner.close();	
	}
}

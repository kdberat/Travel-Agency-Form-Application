import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		ArrayList<City> cities = new ArrayList<City>();
		ArrayList<City> citiesStop = new ArrayList<City>();
		ArrayList<Bus> buses = new ArrayList<Bus>();
		
		City ankara = null, istanbul = null, corum = null;
		try {
			Bus kamilkoc5 = new Bus(6, 0, 90, "Mercedes tourismo","Kamilkoc" ,null, null, null, null, null, 0);
			buses.add(kamilkoc5);
			BusStation ankaraOtogar = new BusStation(ankara, buses);
			BusStation istanbulOtogar = new BusStation(istanbul);
			BusStation CorumOtogar = new BusStation(corum);
			

			ankara = new City(40, 33 ,"Ankara");
			istanbul = new City(38, 29,"Istanbul");
			corum = new City(40, 34, "Corum");
			
			ankaraOtogar.setCity(ankara);
			istanbulOtogar.setCity(istanbul);
			CorumOtogar.setCity(corum);
			
			cities.add(ankara);
			cities.add(istanbul);
			
			citiesStop.add(ankara);
			citiesStop.add(istanbul);
			citiesStop.add(corum);
			
			ankara.setBusStation(ankaraOtogar);
			istanbul.setBusStation(istanbulOtogar);
			
			Route ankara_istanbul = new Route(cities);
			ankara_istanbul.addBus(kamilkoc5);
			
			Route ankara_istanbul_stop = new Route(citiesStop);
			System.out.format("%.1f \n", ankara_istanbul_stop.calculateDistance());
			
			Driver driver = new Driver("Umut Demirel", "1354351531", 42, ankara_istanbul, 16);
			Assistant assistant = new Assistant("Erol Demirel", "135546546", 28, ankara_istanbul, 13);
		
			kamilkoc5.setRoute(ankara_istanbul);
			kamilkoc5.addAssistant(assistant);
			kamilkoc5.addDriver(driver);

			System.out.println(ankara_istanbul.calculateDistance());
			System.out.format("%.1f \n",kamilkoc5.getRoute().calculateTime(kamilkoc5));
			
			System.out.println("Ankara-Istanbul:  " + ankara_istanbul.hasAvailableBus());
			System.out.println("In ankara: "+ankaraOtogar.getBusAmount());
			System.out.println("In Istanbul: "+istanbulOtogar.getBusAmount());
			System.out.println(ankaraOtogar.getBusses().get(0).getModel());
			System.out.println(kamilkoc5.getBusStation().getCity().getCityName());
			kamilkoc5.arrive();
			System.out.println(istanbulOtogar.getBusses().get(0).getModel());
			System.out.println(kamilkoc5.getBusStation().getCity().getCityName());
			System.out.println("In ankara: "+ankaraOtogar.getBusAmount());
			System.out.println("In Istanbul: "+istanbulOtogar.getBusAmount());		
			System.out.println("Ankara-Istanbul:  " + ankara_istanbul.hasAvailableBus());
			
			System.out.println(driver.getWage());
			System.out.println(assistant.getWage());
			
			System.out.println(assistant.getStar());
			assistant.updateStar(5);
			System.out.println(assistant.getStar());
			assistant.updateStar(2);
			System.out.println(assistant.getStar());
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
}

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Inventory {


	private ArrayList<Assistant> assistants = new ArrayList<Assistant>();
	private ArrayList<Driver> drivers = new ArrayList<Driver>();
	private ArrayList<Bus> busses = new ArrayList<Bus>();
	
	private ArrayList<Hostess> hostesses = new ArrayList<Hostess>();
	private ArrayList<Pilot> pilots = new ArrayList<Pilot>();
	private ArrayList<Plane> planes = new ArrayList<Plane>();

	
	private ArrayList<BusStation> busStations = new ArrayList<BusStation>();
	private ArrayList<Airport> airports = new ArrayList<Airport>();
	
	private ArrayList<Route> routes = new ArrayList<Route>();
	private ArrayList<City> cities = new ArrayList<City>();

	public Inventory() {
		
		City[] citiesData = {new City(37, 35, "Adana"), new City(37, 38, "Ad�yaman"), new City(38, 30, "Afyon"),  new City(39, 43, "A�r�"), new City(40, 35, "Amasya"), new City(39, 32, "Ankara") ,  new City(36, 30, "Antalya"), new City(41, 41, "Artvin") , new City(37, 27, "Ayd�n"), new City(40, 30,  "Bilecik"), new City(39, 40,  "Bing�l"), 
				new City(38, 42, "Bitlis"), new City(40, 31, "Bolu"), new City(37, 30, "Burdur"),  new City(40, 29, "Bursa"), new City(40, 26, "�anakkale"), new City(40, 33, "�ank�r�") ,  new City(40, 34, "�orum"), new City(37, 30,"Denizli") , new City(37, 29, "Diyarbak�r"), new City(41, 26,   "Edirne"), new City(38, 39,  "Elaz��"), 
				new City(39, 39, "Erzincan"), new City(39, 41, "Erzurum"), new City(39, 30, "Eski�ehir"),  new City(37, 37, "Gaziantep"), new City(40, 38, "Giresun"), new City(40, 39, "G�m��hane") ,  new City(37, 43, "Hakkari"), new City(36, 36,"Hatay") , new City(37, 30, "Isparta"), new City(36,34,  "Mersin"), new City(41, 28,   "�stanbul"), 
				new City(38, 27, "�zmir"), new City(40, 43, "Kars"), new City(41, 33, "Kastamonu"),  new City(38, 35,  "Kayseri"), new City(39,33, "K�rklareli"), new City(39, 34, "K�r�ehir") ,  new City(40, 29,  "Kocaeli"), new City(39, 29,"K�tahya") , new City(38, 38, "Malatya"), new City(38, 27,  "Manisa"), new City(37, 36,   "Kahramanmara�"), 
				new City(37, 40, "Mardin"), new City(37, 28, "Mu�la"), new City(38, 41, "Mu�"),  new City(38, 34, "Nev�ehir"), new City(37, 34, "Ni�de"), new City(40, 37, "Ordu") ,  new City(41,40,  "Rize"), new City(40 ,30 ,"Sakarya") , new City(41, 36, "Samsun"), new City(37, 41,  "Siirt"), new City(42, 35,   "Sinop"), 
				new City(39, 37, "Sivas"), new City(40, 27, "Tekirda�"), new City(40, 36, "Tokat"),  new City(41, 39, "Trabzon"), new City(39, 39,  "Tunceli"), new City(37, 38,"�anl�urfa") ,  new City(38, 29,  "U�ak"), new City(38, 43,"Van") , new City(39, 34,  "Yozgat"), new City(41, 31,  "Zonguldak"), new City(38, 34,  "Aksaray"), 
				new City(40, 40, "Bayburt"), new City(37, 33, "Karaman"), new City(39, 33, "K�r�kkale"),  new City(37, 41, "Batman"), new City(0, 0,  "��rnak"), new City(41, 32,"Bart�n") ,  new City(41, 42,  "Ardahan"), new City(39, 44,"I�d�r") , new City(40, 29,  "Yalova"), new City(36, 37,  "Kilis"), new City(37, 36,  "Osmaniye"),  new City(40, 31,  "D�zce")
		};
		for (City city : citiesData) {
			cities.add(city);
		}
		
		BusStation[] busStationsData = {new BusStation(cities.get(5)), new BusStation(cities.get(32)), new BusStation(cities.get(20)),new BusStation(cities.get(0)), new BusStation(cities.get(12))};
		
		for (BusStation station : busStationsData) {
			busStations.add(station);
			for (City city : citiesData) {
				if(station.getCity() == city) city.setBusStation(station);
			}
		}
		
		System.out.println(cities.get(12).getCityName());
		Airport[] airportsData = {new Airport(cities.get(5)), new Airport(cities.get(32)), new Airport(cities.get(20)),new Airport(cities.get(0)),new Airport(cities.get(33))};
		
		for (Airport airport : airportsData) {
			airports.add(airport);
			for (City city : citiesData) {
				if(airport.getCity() == city) city.setAirport(airport);
			}
		}
		
		Route ankara_istanbul = new Route(cities.get(5),cities.get(32));
		ArrayList<City> stopByCities = new ArrayList<City>();
		stopByCities.add(cities.get(5)); stopByCities.add(cities.get(12)) ;stopByCities.add(cities.get(32));
		Route ankara_istanbul_stopBy = new Route(stopByCities);
		Route edirne_Adana= new Route(cities.get(20),cities.get(0));
		Route ankara_izmir= new Route(cities.get(5),cities.get(33));
		
		
		Driver[] driversData = {new Driver("Ahmet Kaplan", "74523658244", 38, ankara_istanbul, 16),new Driver("H�sn� Sar�", "85478569213", 38, ankara_istanbul, 16),new Driver("Samet G�ndo�an", "92356485215", 28, ankara_istanbul_stopBy, 16),new Driver("Senih Y�ld�r�m", "62315452578", 23, ankara_istanbul_stopBy, 16),new Driver("Umut Demirel","45362158792", 20, edirne_Adana, 16),new Driver("�ahin Dost", "32612235485", 44, edirne_Adana, 16)};
		
		for (Driver driver : driversData) {
			drivers.add(driver);
		}
		
		Assistant[] assistantsData = {new Assistant("Samet Kaplan", "74523658244", 38, ankara_istanbul, 16),new Assistant("Hakan Sar�", "85478569213", 38, ankara_istanbul, 16),new Assistant("Mehmet G�ndo�an", "92356485215", 28, ankara_istanbul_stopBy, 16),new Assistant("Salim Y�ld�r�m", "62315452578", 23, ankara_istanbul_stopBy, 16),new Assistant("Semih Demirel","45362158792", 20, edirne_Adana, 16), new Assistant("Sami Dost", "32612235485", 44, edirne_Adana, 16)};
		
		for (Assistant assistant : assistantsData) {
			assistants.add(assistant);
		}
		
		try {
			Bus[] busesData = { new Bus(6, 0, 90, "Mercedes tourismo","Kamilkoc" ,null, "2022-01-09 17:03:00", ankara_istanbul_stopBy, null, "2+1", 9), new Bus(5.5, 0, 110, "Otokan","Metro", null, "2022-01-09 17:03:00",  ankara_istanbul, null,"2+2", 9), new Bus(6, 0, 90, "Temsa","G�ven Turizm", null, "2022-13-01 10:30:20", edirne_Adana, null, "2+1", 11)};
			int i = 0;
			for (Bus bus : busesData) {
				bus.addDriver(driversData[i]);
				bus.addAssistant(assistantsData[i]);
				if(i == 1) i=0;
				else i++;
				busses.add(bus);
			}	
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Hata" + e);
		}
		
        Pilot[] pilotData = {new Pilot("Ahmet Kaplan", "74523658244", 38, ankara_istanbul, 16),new Pilot("H�sn� Sar�", "85478569213", 38, ankara_istanbul, 16),new Pilot("Samet G�ndo�an", "92356485215", 28,ankara_izmir , 16),new Pilot("Senih Y�ld�r�m", "62315452578", 23,ankara_izmir , 16),new Pilot("Umut Demirel","45362158792", 20, edirne_Adana, 16),new Pilot("�ahin Dost", "32612235485", 44, edirne_Adana, 16)};
		
		for (Pilot pilot : pilotData) {
			pilots.add(pilot);
		}
		
		Hostess[] hostessData = {new Hostess("Samet Kaplan", "74523658244", 38, ankara_istanbul, 16),new Hostess("Hakan Sar�", "85478569213", 38, ankara_istanbul, 16),new Hostess("Mehmet G�ndo�an", "92356485215", 28, ankara_izmir, 16),new Hostess("Salim Y�ld�r�m", "62315452578", 23, ankara_izmir, 16),new Hostess("Semih Demirel","45362158792", 20, edirne_Adana, 16), new Hostess("Sami Dost", "32612235485", 44, edirne_Adana, 16)};
		
		for (Hostess hostess : hostessData) {
			hostesses.add(hostess);
		}
		
		try {
			Plane[] planesData = { new Plane(50,150,300,"Airbus380","Pegasus",null,"2022-01-09 17:03:00",ankara_istanbul,null,null,null,"3+3",20,50,null,null)};
			int i = 0;
			for (Plane plane : planesData) {
				plane.addPilot(pilotData[i]);
				plane.addHostess(hostessData[i]);
				if(i == 1) i=0;
				else i++;
				planes.add(plane);
			}	
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Hata" + e);
		}
		
		
	}

	public ArrayList<Assistant> getAssistants() {
		return assistants;
	}

	public void setAssistants(ArrayList<Assistant> assistants) {
		this.assistants = assistants;
	}

	public ArrayList<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(ArrayList<Driver> drivers) {
		this.drivers = drivers;
	}

	public ArrayList<Bus> getBusses() {
		return busses;
	}

	public void setBusses(ArrayList<Bus> busses) {
		this.busses = busses;
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

	public ArrayList<Plane> getPlanes() {
		return planes;
	}

	public void setPlanes(ArrayList<Plane> planes) {
		this.planes = planes;
	}

	public ArrayList<BusStation> getBusStations() {
		return busStations;
	}

	public void setBusStations(ArrayList<BusStation> busStations) {
		this.busStations = busStations;
	}

	public ArrayList<Airport> getAirports() {
		return airports;
	}

	public void setAirports(ArrayList<Airport> airports) {
		this.airports = airports;
	}

	public ArrayList<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(ArrayList<Route> routes) {
		this.routes = routes;
	}

	public ArrayList<City> getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}
	
}

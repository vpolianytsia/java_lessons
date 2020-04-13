package Exe;

import java.util.Map;
import java.util.Scanner;

import Base.IBus;
import BasicTypes.FreightTransportationBus;
import HumanBuses.*;
import Storage.Storage;

public class Executor {
	
	private static final Scanner scan = new Scanner(System.in);
	private static final Storage storage = new Storage();
	 
	public static void main(String[] args) {
		
		PublicBus firstBus = new PublicBus("CE1100AB", "Kyiv", "Chernivtsi", 20);
		
		SchoolBus secondBus = new SchoolBus("CE1010AB", "Kyiv", "Lviv", 36);
		
		TouristBus thirdBus = new TouristBus("AA1123VV", "Kharkiv", "Lviv", 80);
		
		FreightTransportationBus firstTransportBus = new FreightTransportationBus("AB1010CE", "Lviv", "Chernivtsi", 3600.0);
		FreightTransportationBus secondTransportBus = new FreightTransportationBus("CE3432OE", "Chernivtsi", "Lviv", 3600.0);
		
		// Init data
		storage.setPublicBus(firstBus);
		storage.setSchoolBus(secondBus);
		storage.setTouristBus(thirdBus);
		storage.setFreightBus("test", firstTransportBus);
		storage.setFreightBus("test2", secondTransportBus);
		
		System.out.println("Hello!");
		
		chooseTransportationBusType();
	}
	
	public static void chooseTransportationBusType() {
		System.out.println("What type of transportation do you want to interact with? Enter:");
		System.out.println("1 - public bus");
		System.out.println("2 - school bus");
		System.out.println("3 - tourist bus");
		System.out.println("4 - freight bus");
		System.out.println("0 - for exit");
		
		int chooseBusType;

		while (true) {
			int inChooseBusType = scan.nextInt();
			
			if (inChooseBusType == 0) {
				System.out.println("Good luck!");
				return;
			}
			
			if (inChooseBusType >= 0 || inChooseBusType < 5) {
				chooseBusType = inChooseBusType;
				break;
			} else {
				System.out.println("Bad value! Input valid value:");
			}	
		}

		chooseAction(chooseBusType);
	}
	
	public static void chooseAction(int busType) {
		System.out.println("What do you want to do? Enter:");
		System.out.println("1 - for add bus");
		System.out.println("2 - for delete bus");
		System.out.println("3 - for buses information");
		System.out.println("4 - for return back");
		
		int chooseAction = scan.nextInt();
		switch (chooseAction) {
		case 1:
			createAndAddBus(busType);
			break;
		case 2:
			removeBus(busType);
			break;
		case 3:
			printResults(busType);
			break;
		case 4:
			chooseTransportationBusType();
		default:
			System.out.println("Invalid value!");
			chooseAction(busType);
			break;
		}
	}
	
	public static void createAndAddBus(int busType) {
		IBus bus = createBus(busType);
		
		String label = null;
		if (busType == 4) {
			System.out.println("Input label for freight bus:");
			label = scan.next();
		}
		
		switch (busType) {
		case 1:
			storage.setPublicBus(bus);
			break;
		case 2:
			storage.setSchoolBus(bus);
			break;
		case 3:
			storage.setTouristBus(bus);
			break;
		case 4:
			storage.setFreightBus(label, bus);
			break;
		}
		
		System.out.println("Successfully added!");
		chooseAction(busType);
	}
	
	public static IBus createBus(int busType) {
		System.out.println("Input next parameters:");
		
		System.out.println("Car number");
		String carNumber = scan.next();

		System.out.println("Start point");
		String startPoint = scan.next();
		
		System.out.println("End point");
		String endPoint = scan.next();
		
		double param;
		
		if (busType == 4) {
			System.out.println("Load capacity");
			param = scan.nextDouble();
		} else {
			System.out.println("Passangers count");
			int passangersCount = scan.nextInt();
			param = (double)passangersCount; // TODO think about this
		}
		
		
		IBus bus = null;
		
		switch (busType) {
		case 1:
			bus = new PublicBus(carNumber, startPoint, endPoint, (int)param);
			break;
		case 2:
			bus = new SchoolBus(carNumber, startPoint, endPoint, (int)param);
			break;
		case 3:
			bus = new TouristBus(carNumber, startPoint, endPoint, (int)param);
			break;
		case 4:
			bus = new FreightTransportationBus(carNumber, startPoint, endPoint, param);
			break;
		
		}

		return bus;
	}
	
	public static void removeBus(int busType) {
		String label = null;
		int index = 0;
		
		if (busType == 4) {
			System.out.println("Input label:");
			label = scan.next();
		} else {
			System.out.println("Input index:");
			index = scan.nextInt();
		}
		// TODO methods for check exists value
		
		switch (busType) {
		case 1:
			storage.removePublicBus(index);
			break;
		case 2:
			storage.removeSchoolBus(index);
			break;
		case 3:
			// TODO index is not available in "Set". We must remove elem by obj?
			break;
		case 4:	
			storage.removeFreightBus(label);
			break;
		}
		
		System.out.println("Successfully removed!");
		chooseAction(busType);
	}
	
	public static void printResults(int busType) {
		switch (busType) {
		case 1:
			for (IBus bus : storage.getListPublicBuses()) {
				System.out.println(bus.getFormattedRoute());
			}
			break;
		case 2:
			for (IBus bus : storage.getListSchoolBuses()) {
				System.out.println(bus.getFormattedRoute());
			}
			break;
		case 3:
			for (IBus bus : storage.getSetOfTourist()) {
				System.out.println(bus.getFormattedRoute());
			}
			break;
		case 4:	
			for (Map.Entry<String, IBus> entry : storage.getMapFreightBus().entrySet()) {
			    System.out.println("Key: " + entry.getKey() + " Value: "
			        + entry.getValue().getFormattedRoute());
			}
			break;
		}
		chooseAction(busType);
	}
}

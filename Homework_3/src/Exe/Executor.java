package Exe;

import BasicTypes.FreightTransportationBus;
import HumanBuses.*;
import Storage.Storage;
import Menu.Menu;

public class Executor {	 
	public static void main(String[] args) {
		
		PublicBus firstBus = new PublicBus("CE1100AB", "Kyiv", "Chernivtsi", 20);
		
		SchoolBus secondBus = new SchoolBus("CE1010AB", "Kyiv", "Lviv", 36);
		
		TouristBus thirdBus = new TouristBus("AA1123VV", "Kharkiv", "Lviv", 80);
		
		FreightTransportationBus firstTransportBus = new FreightTransportationBus("AB1010CE", "Lviv", "Chernivtsi", 3600.0);
		FreightTransportationBus secondTransportBus = new FreightTransportationBus("CE3432OE", "Chernivtsi", "Lviv", 3600.0);
		
		Storage storage = new Storage();
		
		System.out.println(firstBus.generateRandomTransportNumber()); // default method
		// Init data
		storage.setPublicBus(firstBus);
		storage.setSchoolBus(secondBus);
		storage.setTouristBus(thirdBus);
		storage.setFreightBus("test", firstTransportBus);
		storage.setFreightBus("test2", secondTransportBus);
		
		System.out.println("Hello!");
		Menu menu = new Menu(storage);
		menu.chooseTransportationBusType();
	}
	
	
}

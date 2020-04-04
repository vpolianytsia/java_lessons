package Exe;

import BasicTypes.FreightTransportationBus;
import HumanBuses.*;
import Depot.BusDepot;
import BusShedule.BusShedule;

public class Executor {
	
	public static void main(String[] args) {
		PublicBus firstBus = new PublicBus("CE1100AB", "Kyiv", "Chernivtsi", 20);
		firstBus.setDispatchTime("8:00");
		firstBus.setArrivalTime("23:00");
		/*firstBus.setStartPoint("Kyiv");
		firstBus.setEndPoint("Chernivtsi");
	
		System.out.println(firstBus.getRouteAndShedule());*/
		
		SchoolBus secondBus = new SchoolBus("CE1010AB", "Kyiv", "Lviv", 36);
		FreightTransportationBus transportBus = new FreightTransportationBus("AB1010CE", "Lviv", "Chernivtsi", 3600.0);
		
		BusDepot depot = new BusDepot();
		
		depot.setBus(firstBus);
		System.out.println(depot.getBus().getFormattedRoute());
		
		depot.setBus(secondBus);
		System.out.println(depot.getBus().getFormattedRoute());
		
		depot.setBus(transportBus);
		System.out.println(depot.getBus().getFormattedRoute());
		
		firstBus.runCommand("transaction");
		firstBus.runCommand(5);
		firstBus.runCommand(7.00);
		
		
		 BusShedule arg = BusShedule.MONDAY;
		 //arg = BusShedule.TUESDAY;
		 
        switch (arg)
        {
            case MONDAY:
            	System.out.println("Monday. 8:00 Chernivtsi - 20:00 Kyiv");
            	break;
            case WEDNESDAY:
                System.out.println("Wednesday. 15:35 Chernivtsi - 21:19 Lviv"); 
                break;
            case FRIDAY:
                System.out.println("Friday. 19:46 Chernivtsi - 11:15 Odessa");
                break;
            case SUNDAY:
                System.out.println("Sunday. 06:50 Chernivtsi - 11:35 Ternopil");
                break;
            default:
                System.out.println("Sorry, day off");
                break;
        }
	}
}

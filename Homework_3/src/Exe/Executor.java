package Exe;

import HumanBuses.PublicBus;

public class Executor {
	
	public static void main(String[] args) {
		PublicBus firstBus = new PublicBus();
		firstBus.setDispatchTime("8:00");
		firstBus.setArrivalTime("23:00");
		firstBus.setStartPoint("Kyiv");
		firstBus.setEndPoint("Chernivtsi");

		System.out.println(firstBus.getRouteAndShedule());	
	}
}

package Depot;

import Base.IBus;

public class BusDepot {
	private IBus bus;
	
	public BusDepot() {
		
	}
	
	public void setBus(IBus bus) {
		this.bus = bus;
	}
	
	public IBus getBus() {
		return this.bus;
	}
}

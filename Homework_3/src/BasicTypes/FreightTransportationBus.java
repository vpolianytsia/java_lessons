package BasicTypes;

import Base.BaseBus;

public class FreightTransportationBus extends BaseBus {
	protected String transportationType = "Freight transportation";
	protected double loadCapacity;
	
	public FreightTransportationBus(String transportNumber, String startPoint, String endPoint, double loadCapacity) {	
		super(transportNumber, startPoint, endPoint);
		this.loadCapacity = loadCapacity;
	}
}

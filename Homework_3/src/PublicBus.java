
public abstract class PublicBus extends HumanTransportationsBus {
	protected int routeNumber;
	
	public PublicBus(String transportNumber, String startPoint, String endPoint, int passangersCount, int routeNumber) {
		super(transportNumber, startPoint, endPoint, passangersCount);
		this.routeNumber = routeNumber;
	}
}

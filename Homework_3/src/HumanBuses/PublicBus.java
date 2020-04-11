package HumanBuses;
import BasicTypes.HumanTransportationsBus;

public class PublicBus extends HumanTransportationsBus {
	protected int routeNumber;
	protected String arrivalTime;
	protected String dispatchTime;
	
	public PublicBus() {
		
	}
	
	public PublicBus(String transportNumber, String startPoint, String endPoint, int passangersCount) {
		super(transportNumber, startPoint, endPoint, passangersCount);
	}
	
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public String getArrivalTime() {
		return this.arrivalTime;
	}
	
	public void setDispatchTime(String dispatchTime) {
		this.dispatchTime = dispatchTime;
	}
	
	public String getDispatchTime() {
		return this.dispatchTime;
	}
	
	public void setRouteNumber(int routeNumber) {
	    this.routeNumber = routeNumber;	
	}
	
	public int getRouteNumber() {
		return this.routeNumber;
	}
	
	public String getFormattedShedule() {
		return this.dispatchTime + " - " + this.arrivalTime;
	}
	
	public String getStartPointAndTime() {
		return this.dispatchTime + " " + this.startPoint;
	}
	
	public String getEndPointAndTime() {
		return this.arrivalTime + " " + this.endPoint;
	}
	
	public final String getRouteAndShedule() {
		return this.getStartPointAndTime() + " - " + this.getEndPointAndTime();
	}
	
	public String getFormattedRoute() {	
		return this.startPoint + " ---  " + this.endPoint;
	}
	
	public void runCommand(String command) {
		System.out.println("Accepted, I'll do " + command);
	}
	
	public void runCommand(int stationId) {
		System.out.println("I'll go to " + stationId + " station");
	}
	
	public void runCommand(double time) {
		System.out.println("I'll be there at " + time);
	}
}

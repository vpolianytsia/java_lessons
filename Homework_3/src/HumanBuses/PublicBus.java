package HumanBuses;
import BasicTypes.HumanTransportationsBus;

/** 
 * Class with fields <b>routeNumber</b>, <b>arrivalTime</b>, <b>dispatchTime</b>
 * @author Vita Polianytsia
*/

public class PublicBus extends HumanTransportationsBus {
	/** Field route number */
	protected int routeNumber;
	/** Field arrival time */
	protected String arrivalTime;
	/** Field dispatch time */
	protected String dispatchTime;
	
	 /** 
     * non-parameterized constructor
     * @see PublicBus#PublicBus(String, String, String, int)
     */
	public PublicBus() {
		
	}
	
	/** 
     * Constructor with parameters
     * @param transportNumber - transport number
     * @param startPoint - start point
     * @param endPoint - end point
     * @param passangersCount - passangers count
     * @see PublicBus#PublicBus()
     */
	public PublicBus(String transportNumber, String startPoint, String endPoint, int passangersCount) {
		super(transportNumber, startPoint, endPoint, passangersCount);
	}
	
	 /**
     * Setter for arrival time {@link PublicBus#arrivalTime}
     * @param arrivalTime
     */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	 /**
     * Getter for arrival time {@link Product#arrivalTime}
     * @return arrivalTime
     */
	public String getArrivalTime() {
		return this.arrivalTime;
	}
	
	 /**
     * Setter for dispatch time {@link PublicBus#dispatchTime}
     * @param dispatchTime
     */
	public void setDispatchTime(String dispatchTime) {
		this.dispatchTime = dispatchTime;
	}
	
	public String getDispatchTime() {
		return this.dispatchTime;
	}
	
	 /**
     * Setter for route number {@link PublicBus#routeNumber}
     * @param routeNumber
     */
	public void setRouteNumber(int routeNumber) {
	    this.routeNumber = routeNumber;	
	}
	
	public int getRouteNumber() {
		return this.routeNumber;
	}
	
	 /**
     * Method for getting formatted shedule 
     * @return formatted shedule 
     */
	public String getFormattedShedule() {
		return this.dispatchTime + " - " + this.arrivalTime;
	}
	
	 /**
     * Method for getting start point and time
     * @return start point and time 
     */
	public String getStartPointAndTime() {
		return this.dispatchTime + " " + this.startPoint;
	}
	
	 /**
     * Method for getting end point and time
     * @return end point and time 
     */
	public String getEndPointAndTime() {
		return this.arrivalTime + " " + this.endPoint;
	}
	
	 /**
     * Method for getting route and shedule
     * @return route and shedule
     */
	public final String getRouteAndShedule() {
		return this.getStartPointAndTime() + " - " + this.getEndPointAndTime();
	}
	
	 /**
     * Method for getting formatted route
     * @return formatted route
     */
	public String getFormattedRoute() {	
		return this.startPoint + " ---  " + this.endPoint;
	}
	
	/**
     * Method for command execution
     * @param command
     */
	public void runCommand(String command) {
		System.out.println("Accepted, I'll do " + command);
	}
	
	/**
     * Method for arrival to the station
     * @param stationId
     */
	public void runCommand(int stationId) {
		System.out.println("I'll go to " + stationId + " station");
	}
	
	/**
     * Method for arrival at the specified time
     * @param time
     */
	public void runCommand(double time) {
		System.out.println("I'll be there at " + time);
	}
}

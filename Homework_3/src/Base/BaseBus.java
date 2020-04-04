package Base;

public abstract class BaseBus implements IBus {
	final String BusStationNumber = "10";
	private  String transportNumber;
	protected String startPoint;
	protected String endPoint;
	protected String transportationType;
	
	public BaseBus() {
		
	}
	
	public BaseBus(String transportNumber, String startPoint, String endPoint) {
		this.transportNumber = transportNumber;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public void setTransportNumber(String value) {
		this.transportNumber = value;
	}
	
	public String getTransportNumber() {
		return this.transportNumber;
	}
	
	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getStartPoint() {
		return this.startPoint;
	}
	
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	
	public String getEndPoint() {
		return this.endPoint;
	}
	
	public String getFormattedRoute() {	
		return this.startPoint + " -  " + this.endPoint;
	}
	
	
}

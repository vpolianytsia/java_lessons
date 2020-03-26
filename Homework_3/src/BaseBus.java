
public abstract class BaseBus {
	private String transportNumber;
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
	
	public String getStartPoint() {
		return this.startPoint;
	}
	
	public String getEndPoint() {
		return this.endPoint;
	}
}

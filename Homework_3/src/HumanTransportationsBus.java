
public abstract class HumanTransportationsBus extends BaseBus {
	protected String transportationType = "Human transportation";
	protected int passangersCount;
	
	public HumanTransportationsBus() {
		
	}
	
	public HumanTransportationsBus(String transportNumber, String startPoint, String endPoint, int passangersCount) {
		super(transportNumber, startPoint, endPoint);
		this.passangersCount = passangersCount;
	}
	
	public int getPassangersCount() {
		return this.passangersCount;
	}
}

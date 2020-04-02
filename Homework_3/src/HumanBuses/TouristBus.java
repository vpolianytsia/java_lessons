package HumanBuses;

public final class TouristBus extends SpecialBus {
	protected boolean socketFlag = false;
	
	public TouristBus() {
			
	}

	public TouristBus(String transportNumber, String startPoint, String endPoint, int passangersCount) {
		super(transportNumber, startPoint, endPoint, passangersCount);
	}
	
	public void setSocketFlag(boolean value) {
		this.socketFlag = value;
	}
	
	public boolean getSocketFlag() {
		return this.socketFlag;
	}
}

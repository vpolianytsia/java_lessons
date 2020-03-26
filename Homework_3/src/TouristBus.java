
public final class TouristBus extends SpecialBus {
	protected boolean socketFlag = false;
	
	public TouristBus() {
			
	}

	public TouristBus(String transportNumber, String startPoint, String endPoint, int passangersCount, boolean socketFlag) {
		super(transportNumber, startPoint, endPoint, passangersCount);
		this.socketFlag = socketFlag;
	}
}

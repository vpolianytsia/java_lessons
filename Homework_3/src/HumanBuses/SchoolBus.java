package HumanBuses;

public final class SchoolBus extends SpecialBus {
	protected int schoolNumber;
	
	public SchoolBus() {
		
	}
	
	public SchoolBus(String transportNumber, String startPoint, String endPoint, int passangersCount) {		
		super(transportNumber, startPoint, endPoint, passangersCount);
	}
	
	public void setSchoolNumber(int value) {
		this.schoolNumber = value;
	}
	
	public int getSchoolNumber() {
		return this.schoolNumber;
	}
}

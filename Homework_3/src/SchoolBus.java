
public final class SchoolBus extends SpecialBus {
	protected int schoolNumber;
	
	public SchoolBus() {
		
	}
	
	public SchoolBus(String transportNumber, String startPoint, String endPoint, int passangersCount, int schoolNumber) {
		super(transportNumber, startPoint, endPoint, passangersCount);
		this.schoolNumber = schoolNumber;
	}
	
	public int getSchoolNumber() {
		return this.schoolNumber;
	}
}

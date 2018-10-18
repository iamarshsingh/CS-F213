
public class BedRoom extends Room implements IOperatingCost{
	
	private Bed bed;
	private boolean acState;
	private boolean sleepState;
	private int electricityBill;
	
	public BedRoom(int roomLength, int roomWidth, int roomHeight, Bed bed) {
		super(roomLength, roomWidth, roomHeight);
		this.bed = bed;
		this.electricityBill=0;
		this.sleepState=false;
		this.acState=false;
	}
	
	public boolean getSleepState() {
		return this.sleepState;
	}
	
	public boolean getAcState() {
		return this.acState;
	}
	
	public int maintenanceCost() {
		return bed.getCost();
	}
	
	public int getBill() {
		return this.electricityBill;
	}
	
	public void use​(java.lang.String name) {
		
		if(name.equals("AC")){
			if(this.acState==true) {
				this.acState=false;
			}
			else {
				this.acState=true;
				this.electricityBill+=(10*super.getVolume());
			}
		}
		else if(name.equals("Bed")){
			if(this.sleepState==true) {
				this.sleepState=false;
			}
			else {
				this.sleepState=true;
			}
		}
		
	}

}

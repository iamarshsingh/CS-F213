
public class WashRoom extends Room implements IOperatingCost {

	private int waterBill;
	
	public WashRoom(int roomLength, int roomWidth, int roomHeight) {
		super(roomLength, roomWidth, roomHeight);
		this.waterBill=0;
	}
	
	public int getBill() {
		return this.waterBill;
	}
	
	public int maintenanceCost() {
		return 42;
	}
	
	public void use​(java.lang.String name) {
		
		if(name.equals("Shower")){
			this.waterBill+=10;
		}
		else if(name.equals("Wash Basin")){
			this.waterBill+=3;
		}
		
	}

}

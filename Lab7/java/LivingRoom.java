
public class LivingRoom extends Room implements IOperatingCost{

	private boolean tvState;
	private int electricityBill;

	public LivingRoom(int roomLength, int roomWidth, int roomHeight) {
		super(roomLength, roomWidth, roomHeight);
		this.electricityBill = 0;
		this.tvState = false;
	}
	
	public int getBill() {
		return this.electricityBill;
	}
	
	public boolean getTvState() {
		return this.tvState;
	}
	
	public void use​(java.lang.String name) {
		if(name.equals("TV")) {
			if(this.tvState==true) {
				this.tvState=false;
			}
			else {
				this.tvState=true;
				this.electricityBill+=10;
			}
		}
	}
	
}

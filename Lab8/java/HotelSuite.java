
public class HotelSuite {
	public WashRoom w;
	public LivingRoom l;
	public BedRoom[] br;
	public int totalCost;
	
	public HotelSuite(WashRoom w, LivingRoom l, BedRoom... br) {
		this.w = w;
		this.l = l;
		this.br = new BedRoom[br.length];
		for(int i=0;i<br.length;i++) {
			this.br[i] = br[i];
		}
		this.totalCost = 0;
	}
	
	public int calculateCost() {
		this.totalCost = w.maintenanceCost() + l.maintenanceCost();
		for(int i=0;i<br.length;i++) {
			this.totalCost = this.totalCost + br[i].getBill() + br[i].maintenanceCost();
		}
		return this.totalCost;
	}
}


public class Hotel {
	
	public HotelSuite hotelroom[];
	public int totalCost;
	
	public Hotel(HotelSuite... hotelroom) {
		this.hotelroom = new HotelSuite[hotelroom.length];
		for(int i=0;i<hotelroom.length;i++) {
			this.hotelroom[i] = hotelroom[i];
		}
	}
	
	public int getHotelCost() {
		for(int i=0;i<hotelroom.length;i++) {
			this.totalCost = this.totalCost + this.hotelroom[i].calculateCost();
		}
		return this.totalCost;
	}
}

/**
 * Simulates a hotel suite. A HotelSuite will have one WashRoom, one LivingRoom
 * and multiple BedRoom's.
 * 
 * @author Shubham Paralikar, Anand Batra
 *
 */
public class HotelSuite {
	/**
	 * Instance of WashRoom class
	 */
	private WashRoom w;
	/**
	 * Instance of LivingRoom class
	 */
	private LivingRoom l;
	/**
	 * Array of instances of Bedroom class
	 */
	private BedRoom[] br;

	/**
	 * Total cost of the hotel suite, i.e. sum of bills from all the rooms in the
	 * hotel suite.
	 */
	private int totalCost;

	/**
	 * Initializes instances of WashRoom, LivingRoom and Bedroom classes and
	 * totalCost to 0
	 * 
	 * @param w  Instance of WashRoom class
	 * @param l  Instance of LivingRoom class
	 * @param br Instances of BedRoom class
	 */
	public HotelSuite(WashRoom w, LivingRoom l, BedRoom... br) {
		this.w = w;
		this.l = l;
		this.br = br;
		this.totalCost = 0;
	}

	/**
	 * Calculates total cost of the hotel suite. Note: Total cost is the sum of
	 * bills of all the rooms.
	 * 
	 * @return Total cost of the hotel suite
	 */
	public int calculateCost() {
		this.totalCost = 0;
		for (int i = 0; i < br.length; i++) {
			if(br[i] != null) {
				this.totalCost += br[i].getBill();				
			}
		}
		this.totalCost += this.w.getBill() + this.l.getBill();
		return this.totalCost;
	}
}

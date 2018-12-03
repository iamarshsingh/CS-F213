/**
 * This class simulates a Hotel
 *
 * @author Shubham Paralikar, Anand Batra
 */
public class Hotel {

	/**
	 * Stores the cost of the hotel
	 */
	private int hotelCost;

	/**
	 * Array of hotel rooms
	 */
	private HotelSuite hotelSuites[];

	/**
	 * Initialize all fields of the class.
	 * <ul>
	 * <li>Initializes hotelSuites</li>
	 * <li>Iniitializes hotelCost to 0</li>
	 * </ul>
	 * 
	 * @param hotelSuites Variable number of hotelSuite
	 */
	public Hotel(HotelSuite... hotelSuites) {
		this.hotelSuites = hotelSuites;
		this.hotelCost = 0;
	}

	/**
	 * Calculates cost of each hotel room
	 * 
	 * @return Total cost of the hotel
	 */
	public int getHotelCost() {
		this.hotelCost = 0;
		for (int i = 0; i < this.hotelSuites.length; i++) {
			if(hotelSuites[i] != null) {				
				this.hotelCost += this.hotelSuites[i].calculateCost();
			}
		}
		return this.hotelCost;
	}

}

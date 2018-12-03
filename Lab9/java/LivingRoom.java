/**
 * This class simulates a Living Room.
 *
 * @author Shreyas Bhat, Mayur Jartarkar(Edited)
 */
public class LivingRoom extends Room {

	/**
	 * Stores the electricity bill for the livingroom.
	 */
	private int electricityBill;

	/**
	 * Initialize all fields of the class.
	 * <ul>
	 * <li>Set electricityBill as (roomWidth x roomLength x 5).</li>
	 * </ul>
	 *
	 * @param roomLength Length of the livingroom.
	 * @param roomWidth  Width of the livingroom.
	 * @param roomHeight Height of the livingroom.
	 */
	public LivingRoom(int roomLength, int roomWidth, int roomHeight) {
		super(roomLength, roomWidth, roomHeight);
		this.electricityBill = roomWidth * roomLength * 5;
	}

	/**
	 * Fetches the electricity bill amount.
	 * 
	 * @return Electricity bill for a Living Room.
	 */
	public int getBill() {
		return electricityBill;
	}
}

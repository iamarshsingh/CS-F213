/**
 * This class simulates a bedroom.
 *
 * @author Shreyas Bhat, Mayur Jartarkar(Edited)
 */
public class BedRoom extends Room {

	/**
	 * To keep track of the electricity bill for the bedroom.
	 */
	private int electricityBill;

	/**
	 * Initialize all fields of the class.
	 * <ul>
	 * <li>Set electricityBill as (roomWidth x roomLength x 2).</li>
	 * </ul>
	 *
	 * @param roomLength Length of the bedroom.
	 * @param roomWidth  Width of the bedroom.
	 * @param roomHeight Height of the bedroom.
	 */
	public BedRoom(int roomLength, int roomWidth, int roomHeight) {
		super(roomLength, roomWidth, roomHeight);
		this.electricityBill = roomWidth * roomLength * 2;
	}

	/**
	 * Returns the electricity bill for the room.
	 * 
	 * @return The electricity bill.
	 */
	public int getBill() {
		return this.electricityBill;
	}

}

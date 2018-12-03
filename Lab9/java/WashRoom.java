/**
 * This class simulates a washroom.
 *
 * @author Shreyas Bhat, Mayur Jartarkar(Edited)
 */

public class WashRoom extends Room {

	/**
	 * To keep track of the waterbill of the washroom.
	 */
	private int waterBill;

	/**
	 * Initialize all fields of the class.
	 * <ul>
	 * <li>Set waterBill as (roomWidth x roomLength)</li>
	 * </ul>
	 *
	 * @param roomLength Length of the washroom.
	 * @param roomWidth  Width of the washroom.
	 * @param roomHeight Height of the washroom.
	 */
	public WashRoom(int roomLength, int roomWidth, int roomHeight) {
		super(roomLength, roomWidth, roomHeight);
		this.waterBill = roomWidth * roomLength;
	}

	/**
	 * @return The waterbill for a washroom.
	 */
	public int getBill() {
		return waterBill;
	}

}

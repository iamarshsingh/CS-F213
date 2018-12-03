/**
 * This class is a general representation of a room.
 *
 * @author Shreyas Bhat, Mayur Jartarkar(Edited)
 */
public abstract class Room {

	/**
	 * Length of the room
	 */
	protected int roomLength;
	/**
	 * Width of the room
	 */
	protected int roomWidth;
	/**
	 * Height of the room
	 */
	protected int roomHeight;

	/**
	 * A room has a length, width, and height. Initialize all fields of the class.
	 *
	 * @param roomLength Length of the room.
	 * @param roomWidth  Width of the room.
	 * @param roomHeight Height of the room.
	 */
	public Room(int roomLength, int roomWidth, int roomHeight) {
		this.roomLength = roomLength;
		this.roomWidth = roomWidth;
		this.roomHeight = roomHeight;
	}

	/**
	 * An abstract method that computes the room's bill.
	 *
	 * @return Bill for the room.
	 */
	public abstract int getBill();
}
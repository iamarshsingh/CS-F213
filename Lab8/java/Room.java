/**
 * This class is a general representation of a room.
 *
 * @author Anand Batra, Shubham Paralikar
 */
public abstract class Room implements IRoom {

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
	 * 
	 */
	public Room(int roomLength, int roomWidth, int roomHeight) throws InvalidDimensionException{
		if(roomLength<=0 || roomWidth<=0 || roomHeight<=0) {
			throw new InvalidDimensionException(roomLength, roomWidth, roomHeight);
		}
		this.roomLength = roomLength;
		this.roomWidth = roomWidth;
		this.roomHeight = roomHeight;
	}

	/**
	 * Computes the volume of the room <br>
	 * <ul>
	 * <li>Volume is computed as (roomLength * roomWidth * roomHeight).</li>
	 * </ul>
	 *
	 * @return Volume of the room.
	 */
	protected int getVolume() {
		return (this.roomLength * this.roomWidth * this.roomHeight);
	}

	/**
	 * Computes the surface area of the room. <br>
	 * <ul>
	 * <li>Surface Area is calculated as 2*(length * width + width * height + height
	 * * length).</li>
	 * </ul>
	 * 
	 * @return Surface area of the room.
	 */
	protected int getSurfaceArea() {
		return (2 * this.roomHeight * (this.roomLength + this.roomWidth) + 2 * this.roomLength * this.roomWidth);
	}

	/**
	 * An abstract method that computes the room's bill.
	 *
	 * @return Bill for the room.
	 */
	public abstract int getBill();
}
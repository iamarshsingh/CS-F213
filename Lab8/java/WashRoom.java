/**
 * This class simulates a washroom.
 *
 * @author Anand Batra, Shubham Paralikar
 */

public class WashRoom extends Room implements IOperatingCost {

	/**
	 * To keep track of the waterbill of the washroom.
	 */
	private int waterBill;

	/**
	 * Initialize all fields of the class.
	 * <ul>
	 * <li>Set waterBill as 0</li>
	 * </ul>
	 *
	 * @param roomLength Length of the washroom.
	 * @param roomWidth Width of the washroom.
	 * @param roomHeight Height of the washroom.
	 * @throws InvalidDimensionException 
	 */
	public WashRoom(int roomLength, int roomWidth, int roomHeight) throws InvalidDimensionException{
		super(roomLength, roomWidth, roomHeight);
		this.waterBill = 0;
	}

	/**
	 * Returns the water bill for the washroom.
	 * @return The waterbill for the washroom.
	 */
	public int getBill() {
		return waterBill;
	}

	/**
	 * This method overrides the maintenance cost method of the IRoom interface.
	 * 
	 * @return 42.
	 */
	@Override
	public int maintenanceCost() {
		return 42;
	}

	/**
	 * In a bath room, you can use the plumbing fixtures "<b>Shower</b>", "<b>Wash
	 * Basin</b>". Using these fixtures will lead to increase in the water bill.
	 * <br>
	 * Usage for this method is:
	 * <ul>
	 * <li>For "<b>Shower</b>", increase the waterbill by 10</li>
	 * <li>For "<b>Wash Basin</b>", increase the waterbill by 3</li>
	 * </ul>
	 * No other plumbing fixtures can be used in the bath room.
	 * 
	 * @param name
	 *            Name of the plumbing fixtures. 
	 * @throws InvalidUsageException 
	 */
	@Override
	public void use(String name) throws InvalidUsageException{
		try {
			if (name.equals("Shower")) {
				this.waterBill += 10;
			} 
			else if (name.equals("Wash Basin")) {
				this.waterBill += 3;
			}
			else if(name.equals(null)) {
				throw new NullPointerException();
			}
			else {
				throw new InvalidUsageException("WashRoom", name);
			}
		}
		catch(NullPointerException e) {
			
		}
	}

}

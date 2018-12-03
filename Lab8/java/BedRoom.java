/**
 * This class simulates a bedroom.
 *
 * @author Anand Batra, Shubham Paralikar
 */
public class BedRoom extends Room implements IOperatingCost {

	/**
	 * Beds for the room.
	 */
	private Bed[] beds;

	/**
	 * To keep track whether the AC is on or not. True if AC is on else false.
	 */
	private boolean acState;

	/**
	 * To track whether the occupant is sleeping or not. True if occupant is asleep
	 * else false.
	 */
	private boolean sleepState;

	/**
	 * To keep track of the electricity bill for the bedroom.
	 */
	private int electricityBill;

	/**
	 * Initialize all fields of the class.
	 * <ul>
	 * <li>Set electricityBill as 0.</li>
	 * <li>Set default values for sleepState and acState as false.</li>
	 * <li>Initialize e</li>
	 * </ul>
	 *
	 * @param roomLength Length of the bedroom.
	 * @param roomWidth  Width of the bedroom.
	 * @param roomHeight Height of the bedroom.
	 * @param beds       And array of beds in the bedroom.
	 * @throws InvalidDimensionException 
	 */
	public BedRoom(int roomLength, int roomWidth, int roomHeight, Bed[] beds) throws InvalidDimensionException{
		super(roomLength, roomWidth, roomHeight);
		this.electricityBill = 0;
		this.sleepState = false;
		this.acState = false;
		this.beds = beds;
	}

	/**
	 * Return the sleep state of the bedroom
	 *
	 * @return sleepState
	 */
	public boolean getSleepState() {
		return sleepState;
	}

	/**
	 * Return the ac state of the bedroom
	 *
	 * @return acState
	 */
	public boolean getAcState() {
		return acState;
	}

	/**
	 * Returns the cost of the room given by the average cost of bed.
	 * 
	 * @return Average cost of a bed in the bedroom.
	 */
	@Override
	public int maintenanceCost() {
		try {
			int sum = 0;
			for(int i = 0; i < this.beds.length; i++) {
				sum += this.beds[i].getCost();
			}
			return sum / this.beds.length;
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
			return 0;
		}
	}

	/**
	 * Returns the electricity bill for the room.
	 * 
	 * @return The electricity bill.
	 */
	public int getBill() {
		return this.electricityBill;
	}

	/**
	 * In a bed room, you can use the appliance "<b>AC</b>" and furniture
	 * "<b>Bed</b>". Using the AC will lead to increase in the electricity bill,
	 * while using the Bed will allow the occupant to sleep. <br>
	 * Usage for this method is: 1. For AC:
	 * <ul>
	 * <li>If the AC is off, turn it on and increment the electricity by 10 * volume
	 * of the room.</li>
	 * <li>Otherwise if the AC was on, turn it off.</li>
	 * </ul>
	 * 2. For Bed:
	 * <ul>
	 * <li>If the occupant is awake, then make the occupant sleep.
	 * <li>Otherwise if the occupant is already asleep, then wake up.
	 * </ul>
	 * No other appliances / furnitures can be used in the bed room.
	 * 
	 * 
	 * @param name Name of the appliance / furniture.
	 * @throws InvalidUsageException 
	 */
	@Override
	public void use(String name) throws InvalidUsageException {
		try {
			if (name.equals("Bed")) {
				this.sleepState = !this.sleepState;
			} 
			else if (name.equals("AC")) {
				if (!this.acState) {
					this.electricityBill += 10 * this.getVolume();		
				}
				this.acState = !this.acState;
			}
			else if(name.equals(null)) {
				throw new NullPointerException();
			}
			else {
				throw new InvalidUsageException("BedRoom", name);
			}
		}
		catch(NullPointerException e) {
			
		}
	}
}

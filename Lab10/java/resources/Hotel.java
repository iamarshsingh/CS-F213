package resources;

/**
 * This class represents a Hotel in a City.
 * 
 * @author Ronak, Kunal, Hrishikesh, Alish
 * @version 20-November, 2018
 * 
 */
public class Hotel {

	/**
	 * The rating of the Hotel.
	 */
	private final int rating;

	/**
	 * The fare the Hotel charges.
	 */
	private final int cost;

	/**
	 * Number of rooms available in the Hotel at a given time.
	 */
	private int roomsAvailable;

	/**
	 * Total Number of rooms available in the Hotel.
	 */
	private int totalNumberOfRooms;

	/**
	 * Number of guests who have completed their stay at the Hotel (have checked out
	 * of the Hotel).
	 */
	public int totalVisitors;

	public Hotel(int rating, int totalNumberOfRooms, int cost) {
		this.rating = rating;
		this.totalNumberOfRooms = totalNumberOfRooms;
		this.cost = cost;
		this.roomsAvailable = this.totalNumberOfRooms;
		this.totalVisitors = 0;
	}
	

	/**
	 * Returns the number of rooms available.
	 * 
	 * @return the number of rooms available.
	 */
	public int getRoomsAvailable() {
		return roomsAvailable;
	}

	/**
	 * Returns the fare the Hotel charges.
	 * 
	 * @return cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * Returns the rating of the Hotel.
	 * 
	 * @return rating
	 */
	public int getRating() {
		return rating;
	}
	
	public synchronized boolean checkIn() {
		if(this.roomsAvailable>0){
			this.roomsAvailable--;
			return true;
		}
		return false;
	}
	
	public synchronized void checkOut() {
		if(this.roomsAvailable<this.totalNumberOfRooms) {
			this.roomsAvailable++;
			this.totalVisitors++;
		}
	}
	
}

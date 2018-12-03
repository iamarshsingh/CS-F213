package simulator;
import resources.*;
/**
 * This class uses the classes in the Resources package to simulate tourists
 * coming to the city.
 * 
 * @author Ronak, Kunal, Hrishikesh, Alish
 * @version 20-November, 2018
 * 
 */
public class City {

	/**
	 * A Hotel with three star rating.
	 */
	public Hotel threeStarHotel;

	/**
	 * A Hotel with four star rating.
	 */
	public Hotel fourStarHotel;

	/**
	 * A Hotel with five star rating.
	 */
	public Hotel fiveStarHotel;

	/**
	 * A DiningHall
	 */
	public DiningHall diningHall;

	/**
	 * An array of Guests.
	 */
	public Guest[] guests;

	/**
	 * An array of Threads which are to be initialized with the guests.
	 */
	public Thread[] threads;

	public City(int numberOfRoomsInEachHotel,int baseRate, int diningHallCapacity, int[] wealth, int[] minHotelPreference) {
		threeStarHotel = new Hotel(3, numberOfRoomsInEachHotel, 3 * baseRate);
		fourStarHotel = new Hotel(4, numberOfRoomsInEachHotel, 4 * baseRate);
		fiveStarHotel = new Hotel(5, numberOfRoomsInEachHotel, 5 * baseRate);
		diningHall = new DiningHall(diningHallCapacity);
		this.threads = new Thread[wealth.length];
		this.guests = new Guest[wealth.length];
		for(int i = 0; i < this.guests.length; i++) {
			guests[i] = new Guest(wealth[i], minHotelPreference[i]);
			threads[i] = new Thread();
		}
	}

	public void simulateCity() {
		for(int i = 0; i < guests.length; i++) {
			guests[i].initResources​(threeStarHotel, fourStarHotel, fiveStarHotel, diningHall);
			threads[i].setName("Guest "+threads[i].getId());
		}

		for(int i = 0; i < threads.length; i++) {
			try {
			    threads[i].start();
				threads[i].join();
			} catch(Exception e) {}
		}
	}
}
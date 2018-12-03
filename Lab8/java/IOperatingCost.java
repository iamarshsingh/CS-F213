/**
 * Interface that abstracts the operating cost of different types of rooms.
 *
 * @author Ankshit Jain
 * @version 15-Oct-2018
 */
public interface IOperatingCost {
	/**
	 * This method is an abstraction for operating various appliances / plumbing
	 * fixture.<br>
	 * Depending on the use case, various operating costs may be updated.<br>
	 * 
	 * @param name Determines which appliance / plumbing fixture has to be used.
	 * @throws InvalidUsageException 
	 */
	void use(String name) throws InvalidUsageException;
}

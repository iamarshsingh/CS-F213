
public class InvalidUsageException extends Exception {
	public InvalidUsageException(String roomType, String object) {
		super(roomType+" cannot have "+object);
	}
}

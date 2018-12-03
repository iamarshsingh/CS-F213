
public class InvalidDimensionException extends Exception {
	
	private int length;
	private int width;
	private int height;
	
	public InvalidDimensionException(int length, int width, int height) {
		this.length = length;
		this.width  = width;
		this.height = height;
	}
	
	public String getMessage() {
		if(length<1) return "Length value is invalid.";
		else if(width<1) return "Width value is invalid.";
		else if(height<1) return "Height value is invalid.";
		return null;
	}
}

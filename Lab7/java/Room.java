
public abstract class Room implements IRoom{
	
	protected int roomHeight;
	protected int roomLength;
	protected int roomWidth;
	
	public Room(int roomLength, int roomWidth, int roomHeight){
		this.roomHeight = roomHeight;
		this.roomLength = roomLength;
		this.roomWidth = roomWidth;
	}
	
	protected int getSurfaceArea() {
		return 2*((roomLength*roomWidth)+(roomHeight*roomWidth)+(roomLength*roomHeight));
	}
	
	protected int getVolume() {
		return (roomLength * roomWidth * roomHeight);
	}
	
	public abstract int getBill();
}

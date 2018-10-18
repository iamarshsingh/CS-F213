
public class SchoolMember {
	
	private java.lang.String name;
	private java.lang.String address;
	private int chanceOfPromotion;
	
	public SchoolMember(java.lang.String name, java.lang.String address){
		this.name = name;
		this.address = address;
	}
	
	protected void setChanceofPromotion(int chance) {
		this.chanceOfPromotion = chance;
	}
	
	public java.lang.String toString(){
		return (name+" ("+address+")");
	}
	
	public int promoted() {
		return this.chanceOfPromotion;
	}
}

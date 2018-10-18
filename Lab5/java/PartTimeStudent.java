
public class PartTimeStudent extends Student {

	public PartTimeStudent(java.lang.String name,java.lang.String address,int credits) {
		super(name, address);
		super.minCredits = credits;
	}
	
	public java.lang.String toString(){
		return ("PartTime"+super.toString());
	}

}

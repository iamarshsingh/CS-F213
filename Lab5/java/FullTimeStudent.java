
public class FullTimeStudent extends Student {

	public FullTimeStudent(java.lang.String name,java.lang.String address,int credits) {
		super(name, address);
		super.minCredits = credits;
	}

	public java.lang.String toString(){
		return ("FullTime"+super.toString());
	}
}

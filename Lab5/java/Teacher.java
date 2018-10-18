
public class Teacher extends SchoolMember {

	private int numCourses;
	private java.lang.String[] courses;
	private int[] credits;
	private int[] feedbacks;
	private static final int MAX_NUMBER_OF_COURSES=10;
	private static final int REQUIRED_PERCENTAGE_FOR_PROMOTION=60;
	
	public Teacher(java.lang.String name, java.lang.String address) {
		super(name, address);
		this.numCourses=0;
		this.courses = new java.lang.String[this.MAX_NUMBER_OF_COURSES];
		this.credits = new int[this.MAX_NUMBER_OF_COURSES];
		this.feedbacks = new int[this.MAX_NUMBER_OF_COURSES];
	}
	
	public java.lang.String toString() {
		return ("Teacher: "+super.toString());
	}
	
	public boolean floatCourse​(java.lang.String course, int credit) {
		int exist=0;
		for(int i=0;i<this.numCourses;i++) {
			if(this.courses[i].equals(course)==true) {
				exist=1;
			}
		}
		if(exist==1) {
			return false;
		}
		else {
			this.courses[this.numCourses]=course;
			this.credits[this.numCourses++]=credit;
			return true;
		}
	}
	
	public boolean addFeedback​(java.lang.String course, int feedback) {
		for(int i=0;i<this.numCourses;i++) {
			if(this.courses[i].equals(course)==true) {
				this.feedbacks[i]=feedback;
				return true;
			}
		}
		return false;
	}
	
	public int getAverageFeedback() {
		if(this.numCourses==0) {
			this.setChanceofPromotion(0);
			return 0;
		}
		else {
			int total=0,average=0;
			for(int i=0;i<this.numCourses;i++) {
				total += this.feedbacks[i];
			}
			average = total/this.numCourses;
			this.setChanceofPromotion(average);
			return average;
		}
	}
	
	public int promoted() {
		if(this.getAverageFeedback()>=this.REQUIRED_PERCENTAGE_FOR_PROMOTION) {
			return 1;
		}
		else return 0;
	}
}

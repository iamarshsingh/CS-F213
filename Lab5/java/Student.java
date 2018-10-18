public class Student extends SchoolMember{
	
	private int numCourses;
	private int numCredits;
	private java.lang.String[] courses;
	private int[] grades;
	private static final int MAX_NUMBER_OF_COURSES=4;
	private static final int MAX_CREDITS=20;
	protected int minCredits;
	private static final int REQUIRED_PERCENTAGE_FOR_PROMOTION=75;
	
	public Student(java.lang.String name, java.lang.String address) {
		super(name,address);
		this.numCourses = 0;
		this.courses = new java.lang.String[this.MAX_NUMBER_OF_COURSES];
		this.grades = new int[this.MAX_NUMBER_OF_COURSES];
		this.minCredits = 10;
	}
	
	public java.lang.String toString(){
		return ("Student: "+super.toString());
	}
	
	public boolean registerCourse​(java.lang.String course, int credit) {
		boolean t=true;
		for(int i=0;i<this.numCourses;i++) {
			if(course.equals(this.courses[i])==true)t=false;
		}
		if(this.numCourses<this.MAX_NUMBER_OF_COURSES && (this.numCredits+credit<this.MAX_CREDITS ) &&(t)) {
			this.courses[this.numCourses++] = course;
			this.numCredits += credit;
			return true;
		}
		else return false;
	}
	
	public boolean isRegistrationSuccessful() {
		if((this.numCredits<this.MAX_CREDITS)&&(this.numCredits>this.minCredits)&&(this.numCourses<=this.MAX_NUMBER_OF_COURSES)) {
			return true;
		}
		else return false;
	}
	
	public boolean addGrades​(java.lang.String course, int grade) {
		for(int i=0;i<this.numCourses;i++) {
			if(this.courses[i].equals(course)==true) {
				this.grades[i]=grade;
				return true;
			}
		}
		return false;
	}
	
	private boolean enoughCourseSlots() {
		if(this.numCourses<this.MAX_NUMBER_OF_COURSES) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean exceedsMaxCredits​(int credit) {
		if((this.numCredits+credit)>this.MAX_CREDITS)return true;
		else return false;
	}
	
	public int getAverageGrade() {
        int result = 100;
		int total=0;
		for(int i=0;i<this.numCourses;i++) {
			total += grades[i];
		}
		if(this.numCourses>0) {
			result = total/this.numCourses;
		}
		super.setChanceofPromotion(result);
		return result;
	
	}
	
	public int promoted() {
		if(getAverageGrade()>=this.REQUIRED_PERCENTAGE_FOR_PROMOTION) {
			return 1;
		}
		return 0;
	}
	
	public boolean removeCourse​(java.lang.String course) {
		int key=0;
		for(int i=0;i<this.numCourses;i++) {
			if(key==1) {
				this.courses[i-1] = this.courses[i];
				this.courses[i] = null;
			}
			else if(this.courses[i].equals(course)) {
				key=1;
			}
		}
		if(key==1) {
			this.numCourses--;
			return true;
		}
		else return false;
	}
	
	public int getMinCredits() {
		return this.minCredits;
	}
	
	public int getNumberOfCourses() {
		return this.numCourses;
	}
}

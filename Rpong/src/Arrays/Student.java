package Arrays;

public class Student extends Person {

	public static final String[] grades = {"Freshman","Sophomore","Junior","Senior","Super Senior"};
	
	private String grade;
	
	public Student(String first, String last, Borough home, int gradeLevel) {
		super(first, last, home);
		//super constructor is 1st bc a person must exist before a student can exist;
		int index = gradeLevel - 9;
		this.grade = grades[index];
	}

	public String toString() {
		//NOTE: If you want to call parent method, use super.example
		return super.toString() + " I am also a "+grade+".";
	}
}

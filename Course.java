
public class Course {

	private String courseCode;
	private String courseName;
	private int maxStudents;
	
	public Course(String courseCode, String courseName, int maxStudents) {
		this.courseCode=courseCode;
		this.courseName=courseName;
		this.maxStudents=maxStudents;
		
	}
	//method land yahoo
	
	public void setCourseCode(String input) {
		this.courseCode=input;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public void setCourseName(String input) {
		this.courseName=input;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setMaxStudents(int input) {
		maxStudents=input;
	}
	
	public int getMaxStudents() {
		return maxStudents;
	}
	
	public String toString() {
		return "Course Code: "+courseCode+" | Course Name: "+courseName+" | Max Students: "+maxStudents;
	}
	
}
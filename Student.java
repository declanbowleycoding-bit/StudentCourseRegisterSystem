
public class Student {

	private int id;
	private String name;
	private int gradeLevel;
	
	public Student(int id, String name, int gradeLevel) {
		this.id=id;
		this.name=name;
		this.gradeLevel=gradeLevel;
		
	}
	//method land yippee
	
	public void setStudentId(int input) {
		this.id=input;
	}
	
	public int getStudentId() {
		return id;
	}
	
	public void setStudentName(String input) {
		this.name=input;
	}
	
	public String getStudentName() {
		return name;
	}
	
	public void setStudentGradeLevel(int input) {
		this.gradeLevel=input;
	}
	
	public int getStudentGradeLevel() {
		return gradeLevel;
	}
	
	public String toString() {
		return "ID: "+id+" | Name: "+name+" | Grade Level: "+gradeLevel;
	}
	
}
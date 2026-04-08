
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
	
	public void setId(int input) {
		this.id=input;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String input) {
		this.name=input;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGradeLevel(int input) {
		this.gradeLevel=input;
	}
	
	public int getGradeLevel() {
		return gradeLevel;
	}
	
	public String toString() {
		return "ID: "+id+" | Name: "+name+" | Grade Level: "+gradeLevel;
	}
	
}
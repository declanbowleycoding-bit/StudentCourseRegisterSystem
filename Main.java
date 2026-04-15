import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main (String[] args) {

		ArrayList<Student> Students=new ArrayList<>();
		ArrayList<Course> Courses=new ArrayList<>();

		Scanner console=new Scanner(System.in);

		String choice;

		boolean looper=true;

		System.out.println("Welcome to the Codd Student Course Register System.");

		while (looper==true) {
			System.out.println("***************************************************");
			System.out.println("1) Add Student");
			System.out.println("2) Add Course");
			System.out.println("3) View All Students"); 
			System.out.println("4) View All Courses");
			System.out.println("5) Exit Program");
			System.out.println("***************************************************");

			choice=console.nextLine();

			if(choice.equals("1")) {
				System.out.println("Type in the student's ID number.");
				int intChoice=numberVerification();
				System.out.println(intChoice);
				System.out.println("Now type in the student's name.");
				choice=console.nextLine();
				System.out.println(choice);
				System.out.println("Finally type in the student's grade level.");
				int intChoice2=numberVerification();
				System.out.println(intChoice2);
				Students.add(new Student(intChoice, choice, intChoice2));
				System.out.println(Students.get((Students.size())-1));

			}else if(choice.equals("2")) {
				System.out.println("Type in the courses's code.");
				String choice2=console.nextLine();
				System.out.println(choice2);
				System.out.println("Now type in the course's name.");
				choice=console.nextLine();
				System.out.println(choice);
				System.out.println("Finally type in the maximum student capacity");
				int intChoice=numberVerification();
				System.out.println(intChoice);
				Courses.add(new Course(choice2, choice, intChoice));
				System.out.println(Courses.get((Courses.size())-1));

			}else if(choice.equals("3")) {
				if(Students.size()>0) {
					for(Student e: Students) {
						System.out.println(e);
					}
				}else {
					System.out.println("There are not students registered.");
				}
				
			}else if(choice.equals("4")) {
				if(Courses.size()>0) {
					for(Course e: Courses) {
						System.out.println(e);
					}
				}else {
					System.out.println("There are not courses registered.");
				}

			}else if(choice.equals("5")) {
				break;

			}else {
				System.out.println("Please try 1, 2, 3, 4, or 5");

			}

		}

		System.out.println("System ended");
	}
	//method land woohoo

	public static int numberVerification() {
		Scanner console=new Scanner(System.in);

		int intChoice=0;

		if (console.hasNextInt()) {
			intChoice=console.nextInt();

		}else {
			System.out.println("Please type a whole number.");
			intChoice=numberVerification();

		}

		return intChoice;
	}






}
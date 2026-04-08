import java.util.Scanner;
public class Main {

	public static void main (String[] args) {

		Scanner console=new Scanner(System.in);

		String choice;

		boolean looper=true;
		
		System.out.println("Welcome to the Codd Student Course Register System.");

		while (looper==true) {
			System.out.println("***************************************************");
			System.out.println("1) Add Student");
			System.out.println("2) Remove Student");
			System.out.println("3) Add Course");
			System.out.println("4) Remove Course");
			System.out.println("5) View All Students"); 
			System.out.println("6) View All Courses");
			System.out.println("7) Exit Program");
			System.out.println("***************************************************");

			choice=console.nextLine();

			if(choice.equals("1")) {
				System.out.println("Add student");


			}else if(choice.equals("2")) {
				System.out.println("Remove student");


			}else if(choice.equals("3")) {
				System.out.println("Add course");


			}else if(choice.equals("4")) {
				System.out.println("Remove course");


			}else if(choice.equals("5")) {
				System.out.println("View all students");


			}else if(choice.equals("6")) {
				System.out.println("View all courses");


			}else if(choice.equals("7")) {
				System.out.println("Exit program");
				break;

			}else {
				System.out.println("Please try 1, 2, 3, 4, or 5");

			}

		}


		System.out.println("System ended");
	}
	//method land woohoo








}
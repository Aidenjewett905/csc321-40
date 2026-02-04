//Aiden Jewett
//CSC-321-40
//2/3/2026

import java.util.Scanner;

public class ajewett4 {

	public static boolean validInput(int choice) {
		if(choice < 1 || choice > 4) { //1 - 4 are valid
			System.out.println("Error, invalid choice.");
			return false;
		}else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int userChoice = -1; //Initialize with a value that would cause an error so the verification catches it
		
		System.out.println("1. Golden Rule\n2. GIGO\n3. Tolkein\n4. Dogs");

		do{
			System.out.print("Enter your choice (1-4): ");
			userChoice = keyboard.nextInt();
		}while(!validInput(userChoice));

		switch(userChoice) {
			case 1:
				System.out.println("Do unto others as you want others to do unto you");
				break;
			case 2:
				System.out.println("Garbage in, Garbage out");
				break;
			case 3:
				System.out.println("Not all who wander are lost");
				break;
			case 4:
				System.out.println("All dogs go to heaven");
				break;
			default:
				System.out.println("DEBUG: Input Validation Failed.");
				break;
		}
	}
}

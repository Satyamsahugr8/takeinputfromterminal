import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of strings
        System.out.println("Enter 1 for PET");
        System.out.println("Enter 2 for REMOVE");
        System.out.println("Enter 3 for CT");
        System.out.println("Enter 0 for Exit");
	
	int number;
	do { 
	 number = scanner.nextInt();
		if (number == 1) {
			System.out.print("PET");
        	} else if (number == 2) {
			System.out.print("REMOVE");
        	} else if (number == 3) {
			System.out.print("CT");
        	} else if (number == 0) {
			System.out.print("EXIT");
        	} else {
			System.out.print("Enter correct input");
		}

	} while (number > 0);

        

        // Close the scanner
        scanner.close();
    }
}

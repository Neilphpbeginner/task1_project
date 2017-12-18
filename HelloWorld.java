import  java.util.Scanner; 																// Importing the scanner class to accept user input.
public class HelloWorld{																// Declaring HelloWorld Class.

	public static void main(String[] args) { 											// Declaining main method.
		String myString	=	"";															// Declaring myString variab;e
		Scanner scanner	=	new Scanner(System.in);										// Creating an instance of the class Scanner
		System.out.println("Please enter in the String you output to the console. ");	// Asking the user for the string he or she wishes to ouput to the console
		myString = scanner.nextLine();													// Saving the data entered
		System.out.println(myString);													// Printing the data out to the console
	}
}
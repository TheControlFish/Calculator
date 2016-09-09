import java.io.*;
import java.util.*;
public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Make your arithmetic selection from the choices below:\n");
			System.out.println("Addition (Enter \"A\" or \"a\")");
			System.out.println("Subtraction (Enter \"S\" or \"s\")");
			System.out.println("Multiplication (Enter \"M\" or \"m\")");
			System.out.println("Division (Enter \"D\" or \"d\")\n");
			System.out.print("Your choice?");
			Scanner kbReader = new Scanner(System.in);
			String str = kbReader.next();
			str = str.toLowerCase();
			char choice = str.charAt(0);
			System.out.print("\nEnter first operand. ");
			double op1 = kbReader.nextDouble();
			System.out.print("\nEnter second operand.");
			double op2 = kbReader.nextDouble();
			System.out.println("");
			switch(choice){
				case 'a': // addition
					System.out.println(op1 + " plus " +op2 + " = " + (op1 + op2));
					break;
				case 's': //subtraction
					System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
					break;
				case 'm': // multiplication
					System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
					break;
				case 'd':
					System.out.println(op1 + " divided by " + op2 + " = " + (op1/op2));
					break;
				default:
					System.out.println("Invalid Selection");
			}
	}
}

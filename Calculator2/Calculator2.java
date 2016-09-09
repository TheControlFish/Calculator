import java.io.*;
import java.util.*;
public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Make your arithmetic selection from the choices below:\n");
			System.out.println("Addition");
			System.out.println("Subtraction");
			System.out.println("Multiplication");
			System.out.println("Division\n");
			System.out.print("Your choice?");
			Scanner kbReader = new Scanner(System.in);
			String choice = kbReader.next();
			choice = choice.toLowerCase();
			System.out.print("\nEnter first operand. ");
			double op1 = kbReader.nextDouble();
			System.out.print("\nEnter second operand.");
			double op2 = kbReader.nextDouble();
			System.out.println("");
			switch(choice){
				case "addition": // addition
					System.out.println(op1 + " plus " +op2 + " = " + (op1 + op2));
					break;
				case "subtraction": //subtraction
					System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
					break;
				case "multiplication": // multiplication
					System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
					break;
				case "division":
					System.out.println(op1 + " divided by " + op2 + " = " + (op1/op2));
					break;
				default:
					System.out.println("Invalid Selection");
			}
	}
}
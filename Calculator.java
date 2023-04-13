import java.util.Scanner;

class Calculator {

public static void main(String [] args){
	
	/*
	int second_number=Integer.parseInt(args[1]);
	int first_number=Integer.parseInt(args[0]);
	*/

	Scanner input = new Scanner(System.in);
	System.out.println("Enter First Number: ");
	int first_number= input.nextInt();

	System.out.println("Enter Second Number: ");
	int second_number= input.nextInt();

	int sum=first_number + second_number;
	int subtract= first_number - second_number;
	int multiply= first_number * second_number;
	int divide= first_number/second_number;


	System.out.println("Sum is: "+sum);
	System.out.println("Subtract is: "+subtract);
	System.out.println("product is: "+multiply);
	System.out.println("division is: "+divide);

	}
}
import java.util.Scanner;

public class UserInput{

	Scanner scan= new Scanner(System.in);

	public double[] inputTwoNumbers(){
	double[] numbers= new double[2];

	System.out.println("enter first number: ");
	numbers[0]=scan.nextDouble();

	System.out.println("enter second number:");
	numbers[1]=scan.nextDouble();

	return numbers;
	}
}
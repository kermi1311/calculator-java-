/*kermi kotecha
  21070126049 
  AIML A3*/

public class Main{

	static double[] numbers=new double[2];
	static double[] result=new double[2];


	public static void main(String[] args){

		UserInput input = new UserInput();
		Calculator calculator=new Calculator();

		numbers=input.inputTwoNumbers();
		result=calculator.performAddition(numbers);


		System.out.println("first number is "+numbers[0]);
		System.out.println("first number is "+numbers[1]);
		System.out.println("addition is "+result[0]);

	}
}
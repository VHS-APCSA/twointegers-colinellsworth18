import java.util.Scanner;
public class TwoIntegersRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer!");
		int num1 = input.nextInt();
		System.out.println("Enter your second integer!");
		int num2 = input.nextInt();
		TwoIntegers twointegers = new TwoIntegers(num1, num2);
		boolean even = twoIntegers.isEven();
		System.out.println(twoIntegers.getNum1() + " and " + num2 + " are even = " + even));
		boolean multiple = twoIntegers.isMultiple();
		System.out.println(twoIntegers.getNum1() + " is multiple of " + num2 + " = " + multiple));
		String operators = twoIntegers.arithmetic();
		String compare = twoIntegers.comparingIntegers();
		System.out.println(compare);
	}
}

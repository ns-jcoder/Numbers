package devops.numbers;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ChangeNumberToString

{
	private Scanner scanner;
	public ChangeNumberToString(Scanner scanner) {
		
	}


	public ChangeNumberToString() {
	}


	public String convertNumToString(int number, String placeValue)
	{
		String rslt=null;
		/**
		 * Numbers which needs special treatment since they are one word.
		 * Leaving 1st value as empty so as to have correct array index against value. a[1]=one
		 */
		String specialNumbers[] = {
				" ", " one", " two", " three", " four", " five", " six", " seven",
				" eight", " nine", " ten", " eleven", " twelve", " thirteen",
				" fourteen", "fifteen", " sixteen", " seventeen", " eighteen",
		" nineteen" };

		String tensDigit[] = { " ", " ", " twenty", " thirty", " forty", " fifty",
				" sixty", "seventy", " eighty", " ninety" };
		
		/**
		 * If entered value is less than or equal to nineteen then fetch value from array specialNumbers
		 */
		if (number > 19) {
			rslt= tensDigit[number / 10] + " " + specialNumbers[number % 10];
			System.out.print(tensDigit[number / 10] + " " + specialNumbers[number % 10]);
		} else {
			rslt = specialNumbers[number];
			System.out.print(specialNumbers[number]);
		}
		if (number > 0){
			rslt = placeValue;
			System.out.print(placeValue);
			}
           return rslt;
	}


	public static void main(String[] args)

	{
		ChangeNumberToString numToString = new ChangeNumberToString();
		int inputNum = 0;
		inputNum = numToString.validateInput(inputNum);
		if (inputNum <= 0){
			System.out.print("Enter numbers greater than 0. Exiting the program.");

		}
		else
		{
			
			System.out.print("After conversion number in  is ::");
			numToString.wrapperForConversion( inputNum);
		}
	}


	  String wrapperForConversion( int inputNum) {
		
		String result =convertNumToString((inputNum / 1000000000), " Hundred")+
		convertNumToString((inputNum / 10000000) % 100, " crore")
		+
		convertNumToString(((inputNum / 100000) % 100), " lakh")+
		convertNumToString(((inputNum / 1000) % 100), " thousand")+
		convertNumToString(((inputNum / 100) % 10), " hundred")+
		convertNumToString((inputNum % 100), " ");
		return result;
	}


	protected  int validateInput(int inputNum) {
		 scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer number: ");
		try{
			inputNum = scanner.nextInt();
		}
		catch(InputMismatchException ime){
			System.out.println("Invalid input caused InputMismatchException");
		}
		catch(Exception ime){
			System.out.println("Invalid input Caused."+ ime.getMessage());
		}
		return inputNum;
	}
}

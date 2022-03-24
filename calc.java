package calculator;
import java.util.Scanner;

public class Program{
	public static void main(String[] args){
		// declaring the variables that I need
		char operator;
		double num1,num2;

		//Create an Object to take an input
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben sie den Operator ein: (+.-.*./)");
		operator = input.next().charAt(0);

		// ask the user for the 2 numbers
		System.out.println("Bitte geben Sie 2 Zahlen ein die berechnet werden sollen:");
		num1 = input.nextDouble();
		num2 = input.nextDouble();

		input.close();

		// switch to the correct operator
		// printf stands for print formatted

		switch(operator){
			case '+':
				System.out.printf("%f + %f = %f", num1,num2,(num1+num2));
				break;
			case '-':
				System.out.printf("%f - %f = %f", num1,num2,(num1-num2));
				break;
			case '*':
				System.out.printf("%f * %f = %f", num1,num2,(num1*num2));
				break;
			case '/':
				System.out.printf("%f / %f = %f", num1,num2,(num1*num2));
				break;
		}

	}
}

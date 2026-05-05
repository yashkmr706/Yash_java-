package my_java_project;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		double  num1 = sc.nextDouble();
		
		System.out.println("Enter Second Number");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter the Operator ( + , - , * , /):  ");
		char op = sc.next().charAt(0);
		
		//logic
		if (op == '+') {
			System.out.println("Result :" + (num1+num2));
		}
		else if (op == '-') {
			System.out.println("Result :" + (num1 - num2));
		}
		else if (op == '*') {
			System.out.println("Result : " + (num1 * num2));
		}
		else if (op == '/') {
			if (num2 != 0 ) {
				System.out.println("Result :" + (num1 / num2));
			}
			else {
				System.out.println("Cannot divide by zero!");
			}
		}
		else {
			 System.out.println("Invalid operator!");
		}
		sc.close();
	}

}

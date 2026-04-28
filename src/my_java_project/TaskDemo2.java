package my_java_project;

import java.util.Scanner;

public class TaskDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String fname = sc.next();
		ageInfo(age);
		yourName(fname);
		

	}
	
	static void ageInfo(int age) {
		System.out.println("Your Age :" + age);
	}
	static void yourName(String fname) {
		System.out.println("Your Name is :" + fname);
	}
	static 

}

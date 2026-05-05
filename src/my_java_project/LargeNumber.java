package my_java_project;

public class LargeNumber {

	public static void main(String[] args) {
		int a = 10, b = 40 , c = 30;
		
		if(a >= b && a >= c) {
			System.out.println(a);
		}
		else if(b>= a && b >= c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
		System.out.println("Main method ended!!");

	}

}

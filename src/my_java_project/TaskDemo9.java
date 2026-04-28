package my_java_project;

import java.util.Scanner;

public class TaskDemo9 {

	public static void main(String[] args) {
		Scanner oc = new Scanner(System.in);
		String arname = oc.next();
		getName(arname);

	}
	static void getName(String arname) {
		 System.out.println("Your designation :" + arname );
	}
	

}

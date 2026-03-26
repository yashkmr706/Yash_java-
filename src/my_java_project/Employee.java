package my_java_project;

public class Employee {

	public static void main(String[] args) {
		String employee = "Yashwanth";
		int empid = 1235;
		double sal = 5000;
		double pf = 0.03;
		double Gst = 0.07;
		double allowence = 0.05;
		double totalsalary = sal + allowence - pf - Gst;
		double inal = totalsalary*12;
		System.out.println(inal );
	}

}

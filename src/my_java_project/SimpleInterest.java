package my_java_project;

public class SimpleInterest {
	
	double calculateSi(double principle , double rate , double time) {
		double SI = (principle * rate * time) /100;
		return SI;
	}

	public static void main(String[] args) {
		SimpleInterest t3 = new SimpleInterest();
		double result = t3.calculateSi(5000, 2, 2);
		System.out.println("This is total intrest" + " " +  result);

	}

}

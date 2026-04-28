package my_java_project;

public class TaskDemo12 {
	
	void calculate(double price , int quantity , double delivery , double discount ) {
		double total = (price * quantity) + delivery - discount;
		System.out.println("Total Bill" +" "+ total);
	}

	public static void main(String[] args) {
		TaskDemo12 t12 = new TaskDemo12();
		t12.calculate(200, 2, 50, 30);

	}

}

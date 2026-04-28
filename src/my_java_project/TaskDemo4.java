package my_java_project;

public class TaskDemo4 {
	
	String brand;
	double price;
	
	TaskDemo4(){
		brand = "Mahindra";
		price = 1900000.00;
	}
	
	void display() {
		System.out.println("Brand " + brand);
		System.out.println("price " + price);
	}

	public static void main(String[] args) {
		TaskDemo4 t4 = new TaskDemo4();
		
		t4.display();

	}

}

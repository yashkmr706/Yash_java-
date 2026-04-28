package my_java_project;

public class ConstructorPerson {
	
	String name;
	int age;
	
	ConstructorPerson(String n , int a){
		name = n;
		age = a;
	}
	

	public static void main(String[] args) {
		ConstructorPerson p1 = new ConstructorPerson("Yash" , 25);
		System.out.println("my Name " + p1.name);
		System.out.println("my age " + p1.age);
		
	}

}

package my_java_project;

public class MethodDemo {
	
	void Obj1(){
		
		System.out.println("This is instance");
		
	}
	static void Obj2() {
		MethodDemo t = new MethodDemo();
		t.Obj1();
		System.out.println();
	}
	
	static {
		Obj2();
	}
	 public static void main(String[] args) {
		 
	    
	    }

}

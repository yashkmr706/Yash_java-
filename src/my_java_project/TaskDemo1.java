package my_java_project;

public class TaskDemo1 {
	
	static void Obj1() {
		System.out.println("This is Static ");
		Obj2();
	}
	static void Obj2() {
		System.out.println("This is Static ");
	}
	 void Obj3() {
		System.out.println("This is Instance ");
		 Obj4();
	}
	void Obj4() {
		System.out.println("This is Instance ");
		Obj1();
	}
	
	static {
		TaskDemo1 T3 = new TaskDemo1();
		T3.Obj3();

	}

	public static void main(String[] args) {
		
	}

}

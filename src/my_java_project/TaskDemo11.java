package my_java_project;

public class TaskDemo11 {
	
	int getInt() {
		return 10;
	}
	
	float getFloat() {
		return 25.5f;
	}
	
	double getDouble() {
		return 65.5;
	}
	
	char getChar() {
		return 'Y';
	}
	
	boolean getBoolean() {
		return true;
	}
	
	void show() {
		System.out.println(("This is int " + getInt()));
		System.out.println(("This is Float " + getFloat()));
		System.out.println(("This is Double " +  getDouble()));
		System.out.println(("This is Char " + getChar()));
		System.out.println(("This is Boolean " + getBoolean()));
	}

	public static void main(String[] args) {
		TaskDemo11  T11 = new TaskDemo11();
		T11.show();

	}

}

package JavaConcepts;

public class ConstructorExample {
	
	String name;
	//Default constructor
	public ConstructorExample() {
		System.out.println("Called");
	}
	//Parameterised constructor
	public ConstructorExample(int a, int b) {
		System.out.println(a+b);
	}
	
	public ConstructorExample(String name) {
		System.out.println(name);
	}
	//Copy constructor
	public ConstructorExample(ConstructorExample obj1) {
		this.name = name;
		System.out.println(obj1.name);
	}
	
	public static void main(String[] args) {
		ConstructorExample c = new ConstructorExample();
		ConstructorExample c1 = new ConstructorExample(10,20);
		ConstructorExample c2 = new ConstructorExample("Java");
		ConstructorExample c3 = new ConstructorExample("Python");
		
	
	}
	

}

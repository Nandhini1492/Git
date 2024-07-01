package JavaConcepts;

public class SingletonClass {
	
	private static SingletonClass sc = null;

	
	private SingletonClass() {
		String s = "Singleton Constructor";
		System.out.println(s);
	}
	
	public static SingletonClass getInstance() {
		return sc;
	}
	
	public static void main(String[] args) {
		SingletonClass ss = new SingletonClass();
		SingletonClass ss1 = new SingletonClass();
		if(ss.getInstance()==ss1.getInstance()) {
			System.out.println("same "+ss+" "+ss1);
		}else {
			System.out.println("different "+ss+" "+ss1);
		}
	}

}

package JavaConcepts;

public class Main extends Thread {

	 public void test() {
		    System.out.println("Threads are very helpful in java");
		  }
	 
	 public static void main(String[] args) {
		    Main test = new Main();
		    test.start();
		    System.out.println("Threads are very much helpful in java");
		  }
		  public void run() {
		    System.out.println("Threads are very helpful in java");
		  }

}

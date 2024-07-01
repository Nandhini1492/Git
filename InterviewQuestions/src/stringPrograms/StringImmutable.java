package stringPrograms;

public class StringImmutable {

	public static void main(String[] args) {
		//String values
				String x ="abc";
				String y="abc";
				x.concat(y);
				System.out.println(x);
				
				String x1 = x.replace("a", "b");
				System.out.println(x1);
	}
}

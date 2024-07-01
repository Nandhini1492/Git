package JavaConcepts;

public class StringExample {
	
	static String s = "Progra mming";

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder();
		s1.append("Nandy");
		s.concat("Java");
		System.out.println(s1);
		String r = s.replace("mm", "nn");
		System.out.println(r);
		String r1=s.replaceAll("\\s", "");
		System.out.println(r1);
		String aa = "Nandhini";
		String ab ="Nandhini";
		System.out.println(aa==ab);
		String sw = new String("Nandhini");
		String sq = new String("Nandhini");
		System.out.println(sw.equals(sq));
		System.out.println(aa.equals(ab));
		System.out.println(ab.substring(1,4));//n,n-1
	}

}

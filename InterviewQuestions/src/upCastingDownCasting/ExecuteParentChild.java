package upCastingDownCasting;

public class ExecuteParentChild {

	public static void main(String[] args) {
		//Upcasting or TopCasting
		ParentClass p =  new ChildClass();
	
		
		p.name = "Nandhini";
		p.showMsg();
		
		
		//Downcasting is not possible in java implicitly
		//ChildClass c1 = new ParentClass(); //Shows error at compile time
		
		//Explicitly downcasting
		ParentClass p1 = new ParentClass();
		ChildClass c = (ChildClass) p1;
		c.name ="Vaishu";
		c.age = 30;
		System.out.println(c.name+ " "+c.age);
		c.showMsg();
		
		
		
		
		
		

	}

}

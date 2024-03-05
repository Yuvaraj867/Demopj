package myCom;






public class Excercise8 {
	static int a ;
	static String name;
	public  void notice() {
		System.out.println("to get the actual value");
	}

	public static void main(String[] args) {
		Excercise8 def = new Excercise8();
		def.a=10;
		def.name="vishal";
		
		Excercise8 fan = new Excercise8();
		fan.a=20;
		fan.name="vicky";
		
		System.out.println(def.a);
		System.out.println(def.name);
		
		System.out.println(fan.a);
		System.out.println(fan.name);
		
		def.notice();
		
		
	
		
		 
	
		 
		

	}

}

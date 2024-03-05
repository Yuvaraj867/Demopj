package myCom;

public class Overloading {
	public  void test3( int a ) {
		System.out.println("to the child" +a);
	}
	public  void test3(int b, int c) {
		System.out.println("to the first child" + b + c);
	
	
	
	}
	public static void main(String[] args) {
	   Overloading c2 = new Overloading();
	   c2.test3(10);
	   c2.test3(20, 30);

	

}}

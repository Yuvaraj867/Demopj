package myCom;

public class Excercise5 {
	
int value(int a,int b) {
	return a+b;
}
int value(int a,int b,int c) {
	return a+b+c;
}
String value(String x , String y) {
	return x  +  y;
}
	
	


	public static void main(String[] args) {
		
Excercise5 demo = new Excercise5();

System.out.println(demo.value(10, 20));
System.out.println(demo.value(20, 30, 50));
	System.out.println(demo.value("first", "second"));	
	
		
	

	}

}

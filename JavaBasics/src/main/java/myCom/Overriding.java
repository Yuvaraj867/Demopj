package myCom;

public class Overriding extends Overloading {
	public void test3(int d) {
	System.out.println("test the work" + d);
	}

	public static void main(String[] args) {
		Overloading m1 = new Overloading();
		Overriding m2  = new Overriding();
		Overloading m3 = new Overriding();
		m1.test3(10);
		m1.test3(15, 17);
        m2.test3(19);
        m3.test3(90);
	}

}

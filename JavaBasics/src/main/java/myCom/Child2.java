package myCom;

public  class Child2 extends Child1{
	public  void test3() {
		System.out.println("let get start");
	}
	public void test66() {
		System.out.println("child2");
	}

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.test3();
		c2.test2();
		c2.test3();

	}

}

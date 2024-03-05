package myCom;

public class Child4 extends Parents implements GrandParents,Parent {
	public void Testting3() {
		System.out.println("Test child");
	}
	
	public void Test50() {
		System.out.println("Add implement2");
	}
	public void Test51() {
		System.out.println("Add implement3");
	}
	public void TestA() {
		System.out.println("Add abstract class");
	}

	public static void main(String[] args) {
		Child4 c4 = new Child4();
		c4.Testting3();
		c4.Test50();
		c4.Test51();
		c4.TestA();
		c4.TestB();
	}

	}


		
	


package myCom;

public class Testabstract1 extends Testabstract implements Test1,Test2 {

	@Override
	void tst2() {
		System.out.println("tst2");
		
	}
	
	@Override
	public void black() {
		System.out.println("black");
		
	}
	@Override
	public void red() {
		System.out.println("red");
		
	}
	@Override
	public void green() {
		System.out.println("green");
		
	}
	public static void main(String[] args) {

		Testabstract1 b11 = new Testabstract1();
		b11.tst1();
		b11.tst2();
		b11.green();
		b11.black();
		b11.red();


		}

}

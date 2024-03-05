package myCom;

public class Test implements Test1,Test2 {

	@Override
	public void black() {
		System.out.println("gives black colour");
	}

	@Override
	public void red() {
		System.out.println("gives red colour");
		
	}

	@Override
	public void green() {
		System.out.println("gives green colour");
		
	}
	public static void main(String[] args) {
		Test2 t1 = new Test();
		t1.black();
		//t1.red();
		//t1.green();
	}

}

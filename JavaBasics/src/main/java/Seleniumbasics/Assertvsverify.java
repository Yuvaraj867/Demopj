package Seleniumbasics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertvsverify {
	//timeouts
	@Test(timeOut =3000)
	public void assert1() throws InterruptedException {//Hard assert is assert
		Thread.sleep(2000);
		System.out.println("before fail");
		Assert.fail();//Assert.asserequals(true,false)
		System.out.println("After fail");
		}
	@Test(invocationCount = 3)
	public void verify() {//soft assert is verify
		SoftAssert a11 = new SoftAssert();
		System.out.println("before fail");
		a11.fail();
		System.out.println("After fail");
		
	}

}

package Logintc;

import org.testng.annotations.Test;

public class AlwaysRun {
	@Test(timeOut =2000)
	public void re1() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("to");
	}
	@Test(dependsOnMethods="re1",alwaysRun=true)
public void re2() {
	System.out.println("from");
}
}

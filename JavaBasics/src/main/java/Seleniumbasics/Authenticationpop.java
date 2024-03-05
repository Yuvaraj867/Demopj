package Seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//sending the username and password in the url
		driver.get(" http://admin:admin@the-internet.herokuapp.com/basic_auth"
				);
		
		
	}

}

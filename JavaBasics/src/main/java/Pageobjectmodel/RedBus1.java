package Pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedBus1 {
	
    @FindBy(xpath = "//div[@tabindex='1']")
	public static WebElement From;
    
    @FindBy(xpath = "//div[@tabindex='2']")
    public static WebElement To;
    
    @FindBy(xpath = "//div[@tabindex='3']")
    public static WebElement Date;
    
    
    
    
    //
	
}

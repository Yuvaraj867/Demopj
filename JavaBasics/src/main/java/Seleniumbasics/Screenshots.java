package Seleniumbasics;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		
		
		  TakesScreenshot screenimg = (TakesScreenshot)driver;
		  File filess =screenimg.getScreenshotAs(OutputType.FILE); 
		  File Location = new File("D://pic.png"); FileUtils.copyFile(filess, Location);
		
		
		/*
		 * Robot robot = new Robot(); Dimension size =
		 * Toolkit.getDefaultToolkit().getScreenSize(); Rectangle rect = new
		 * Rectangle(size); BufferedImage img = robot.createScreenCapture(rect); File
		 * Location = new File("D://screenshot.png"); ImageIO.write(img, "png",
		 * Location);
		 */
		
	}

}

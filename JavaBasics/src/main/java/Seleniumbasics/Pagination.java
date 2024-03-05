package Seleniumbasics;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {
	static String getname;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		driver.manage().window().maximize();

		List<String> attributename = new ArrayList<String>();
		int size12 = driver.findElements(By.xpath("//div[@id='dtBasicExample_paginate']//a")).size();
		System.out.println(size12);
		if (size12 > 0) {
			do {

				List<WebElement> getsize = driver
						.findElements(By.xpath("//table[@id='dtBasicExample']//following::td[@class='sorting_1']"));
				for (WebElement Newtext : getsize) {
					attributename.add(Newtext.getText());
				}

				WebElement nextbutton = driver.findElement(By.id("dtBasicExample_next"));
				getname = nextbutton.getAttribute("class");
				if (!getname.contains("disabled")) {
					nextbutton.click();
				} else {
					break;
				}
			}

			while (true);

		} else {
			System.out.println("No pagenation");
		}
		for (String all : attributename) {
			System.out.println(all);

		}
	}
}

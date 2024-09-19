package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
//	 tag_id combination
//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("shirts");
//	 tag_classname combination
//	driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("mac");
//	tag_attribute combination
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("mac");
//		 tag_classname[attribute=value]
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("mac");
	}

}

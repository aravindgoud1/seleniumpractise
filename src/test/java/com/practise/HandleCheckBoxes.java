package com.practise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement>element=driver.findElements(By.xpath("//input[@class='form-check-input' and @type=\"checkbox\"]"));
		
		for(WebElement checkbox: element) {
			checkbox.click();
		}
		Thread.sleep(3000);
		for(WebElement checkbox:element) {
			checkbox.isSelected();
			checkbox.click();
		
//			driver.close();
		}
		

	}

}

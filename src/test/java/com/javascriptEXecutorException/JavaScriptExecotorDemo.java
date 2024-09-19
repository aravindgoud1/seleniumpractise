package com.javascriptEXecutorException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecotorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// normal method for to send keys into the inputBox
		// driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Aravind");
		WebElement inputBox = driver.findElement(By.xpath("//input[@id=\"name\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','Aravind')", inputBox);
		
		//  normal method for Clicking radiobuttons
		// driver.findElement(By.xpath("//input[@id=\"male\"]")).click();
		WebElement radioButton = driver.findElement(By.xpath("//input[@id=\"male\"]"));
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()",radioButton );
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}

package com.practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
//		1)normal alert with ok button
//		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		
//		2) confirmation Alert ok & cancel

//		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
//		3) prompt alert input box
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("welcome AravindSingh");
		alert.accept();
		driver.close();
	
	}

}

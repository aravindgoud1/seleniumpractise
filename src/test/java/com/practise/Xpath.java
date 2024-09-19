package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
//		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("mac");
//		 xpath with innerText
		driver.findElement(By.xpath("//*[text()='Desktops']")).click();
		

	}

}

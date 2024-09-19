package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xptha1 {
	
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("AravindSingh");
}
}

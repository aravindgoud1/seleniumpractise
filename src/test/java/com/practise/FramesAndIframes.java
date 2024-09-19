package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndIframes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Aravind");
		driver.switchTo().defaultContent();
		WebElement element2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(element2);
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("singh");
		driver.switchTo().defaultContent();
		WebElement element3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		
		driver.switchTo().frame(element3);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("balasani");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@data-value=\"I am a human\"]")).click();
		
		
	}

}

package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	driver.findElement(By.linkText("Cart")).click();
//		driver.findElement(By.partialLinkText("car")).click(); not recommended partial links
//		List<WebElement> header=driver.findElements(By.tagName("a"));
////		System.out.println("total no.of header links are:"+ header.size());
//		List<WebElement> image=driver.findElements(By.tagName("img"));
//		System.out.println("the no.of images are:"+ image.size());
//		driver.close();

	}

}

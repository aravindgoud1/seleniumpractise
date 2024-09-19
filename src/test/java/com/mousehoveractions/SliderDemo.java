package com.mousehoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/slider.php");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//input[@id=\"ageInputId\"]"));

	}

}

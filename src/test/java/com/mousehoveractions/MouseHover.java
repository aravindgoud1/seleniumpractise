package com.mousehoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(desktops).moveToElement(mac).perform();
		Thread.sleep(3000);
		driver.close();

	}

}

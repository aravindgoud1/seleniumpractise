package com.mousehoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement stock = driver.findElement(By.xpath("//div[text()='Stockholm' and@id=\"box2\"]"));
		WebElement usa = driver.findElement(By.xpath("//div[text()='United States']"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(stock, usa).perform();
		Thread.sleep(3000);
		driver.close();
	}

}

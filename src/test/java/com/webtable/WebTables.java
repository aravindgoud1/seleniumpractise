package com.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		int rows = driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]/tbody/tr")).size();
		System.out.println("rows size is :" + rows);
		for (int i = 2; i <= rows; i++) {
			String value = driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]/tbody/tr[" + i + "]/td[1]"))
					.getText();
			System.out.println(value);
		

		}
	}

}

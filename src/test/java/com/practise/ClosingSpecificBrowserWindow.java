package com.practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowIds = driver.getWindowHandles();
		for (String str : windowIds) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
			if (title.equals("Human Resources Management Software | OrangeHRM\r\n" + "")) {
		driver.close();
			}
		}
		driver.close();

	}

}

package com.datepickersandcalenders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePiccker2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class=\'icon_calendar\' ]")).click();
		driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]")).click();
		driver.close();
	}

}

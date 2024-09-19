package com.datepickersandcalenders;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerWithMethods {
	static void selectFutureDate(WebDriver driver, String month, String year, String date) {
		while (true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			if (year.equals(currentyear) && (month.equals(currentmonth))) {
				break;
			}
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();// it clicks
																											// next year
		}
		List<WebElement> currentdate = driver
				.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td/a"));
		for (WebElement cdate : currentdate) {
			if (cdate.getText().equals(date)) {
				cdate.click();
				break;
			}
		}
	}

	static void selectPastDate(WebDriver driver, String month, String year, String date) {
		while (true) {
			String currentmonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			if (year.equals(currentyear) && (month.equals(currentmonth))) {
				break;
			}
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();// it clicks
																											// previous
																											// year
		}
		List<WebElement> currentdate = driver
				.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td/a"));
		for (WebElement cdate : currentdate) {
			if (cdate.getText().equals(date)) {
				cdate.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		// switch to the frame
		driver.switchTo().frame(0);
		// 1) by using SendKeys
		// driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("04/03/1997");
		// 2) By using DatePicker
		String year = "2022";
		String month = "January";
		String date = "25";
		// opens date picker
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
//		selectFutureDate(driver, month, year, date);
		selectPastDate(driver, month, year, date);
		driver.close();

	}

}

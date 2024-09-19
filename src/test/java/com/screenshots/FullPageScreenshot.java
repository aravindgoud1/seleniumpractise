package com.screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FullPageScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// 1) Takes FullPage Screenshot
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File srcfile =
		 * ts.getScreenshotAs(OutputType.FILE); File targetfile = new
		 * File(System.getProperty("user.dir") + "\\screenshots\\Fullpage1.png");//
		 * dynamic location // srcfile.renameTo(targetfile); Files.copy(srcfile,
		 * targetfile); driver.close();
		 */
		// 2) TakeScreenSht for a specific Area (or) Element
		WebElement footer = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
		File src = footer.getScreenshotAs(OutputType.FILE);
		File trg = new File(System.getProperty("user.dir") + "\\screenshots\\footer.png");
		Files.copy(src, trg);
		driver.close();

	}

}

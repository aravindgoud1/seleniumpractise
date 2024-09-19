package com.scrollingwebpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/computers");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// 1) scroll down by pixel page number
//		js.executeAsyncScript("window.scrollBy(0,1500)");

		// 2) scroll the page till the element is visible
//		WebElement element = driver.findElement(By.xpath("//strong[normalize-space()='Manufacturers']"));
//		js.executeAsyncScript("arguments[0].scrollIntoView()", element);

		// 3) scroll page till end of the page
		js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		// 4 )scroll page reverse of the page
		js.executeAsyncScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}

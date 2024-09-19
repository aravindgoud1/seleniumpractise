package com.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no.of links :" + links.size());
		int noofbrokenlinks = 0;
		for (WebElement linkElement : links) {
			String hrefvalue = linkElement.getAttribute("href");
			if (hrefvalue == null || hrefvalue.isEmpty()) {
				System.out.println("href value is null or empty. so not possible to check");
				continue;
			}
			// hit url to the server
			URL linkurl = new URL(hrefvalue);// converted href string value to url
			HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();// open connection to the server
			conn.connect();// connect to the server and sent request to the server
			if (conn.getResponseCode() >= 400) {
				System.out.println(hrefvalue + "Broken links");
				noofbrokenlinks++;
			} else {
				System.out.println("not a broken link");
			}

		}
		System.out.println("Total no.of BrokenLinks:" + noofbrokenlinks);

	}
	

}

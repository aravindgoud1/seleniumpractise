package com.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new EdgeDriver();
//		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		String act_title=driver.getTitle();
		if(act_title.equals("OpenCart - Demo")) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("test cae is failed");
		}
		driver.close();
		

		

	}

}

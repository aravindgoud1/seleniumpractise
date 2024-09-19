package com.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilesUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		// 1) Single FileUpload
		// driver.findElement(By.xpath("//input[@name=\"uploadfile_0\"]")).sendKeys("D:\\Photos\\Aravind1.jpg");
		// 2) Multiple Files Upload
		String file1 = "D:\\Files\\pancard.jpg";
		
		String file2 = "D:\\Files\\AADHAR.pdf";
		driver.findElement(By.xpath("//input[@name=\"uploadfile_0\"]")).sendKeys(file1 + "\n" + file2);
		Thread.sleep(5000);
		driver.close();
	}

}

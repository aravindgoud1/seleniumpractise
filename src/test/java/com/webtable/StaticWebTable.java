package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// count no.of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println("Total no.of rows in a table :" + rows);
		// count total no.of columns in a table
		int columns = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();

		System.out.println("Total no.of columns in a table :" + columns);
		// Read the data from all the rows and columns
//		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price" );
//		for(int i=2; i<=rows; i++) {
//			for(int j=1; j<=columns; j++) {
//				String value=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td["+j+"]")).getText();
//				System.out.print(value +"\t");
//			}
//			System.out.println();
//		}
		// print book names whose author name is mukesh
		for (int i = 2; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				String author = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[" + i + "]//td[2]"))
						.getText();
				if (author.equals("Mukesh")) {
					String bookName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[" + i + "]//td[1]"))
							.getText();
					System.out.println(bookName + "/t" + author);
				}
			}
		}
		driver.close();
	}

}

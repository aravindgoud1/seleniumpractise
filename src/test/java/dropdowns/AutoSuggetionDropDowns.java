package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetionDropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("selenium");
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role=\"option\"]"));
		for (WebElement elem : elements) {
			System.out.println(elem.getText());
		}
		Thread.sleep(3000);
		driver.close();

	}

}

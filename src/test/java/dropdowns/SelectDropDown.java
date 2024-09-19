package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement webElement = driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
		Select element = new Select(webElement);
		// select option from the dropdown
//		element.selectByVisibleText("Canada");
		// element.selectByValue("canada");
//		element.selectByIndex(3);
		// capture all the options from the dropdown
		List<WebElement> options = element.getOptions();
		// print size of the options
		System.out.println(options.size());
		// printing all the options
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}
	
		Thread.sleep(3000);
		driver.close();
	}
}

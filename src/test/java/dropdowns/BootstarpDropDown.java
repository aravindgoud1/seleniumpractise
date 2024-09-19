package dropdowns;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstarpDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		// 1) select single option
		driver.findElement(By.xpath("//span[@class=\"multiselect-selected-text\"]")).click();

		// 2) select multiple options
		List<WebElement> elements = driver
				.findElements(By.xpath("//ul[@class=\"multiselect-container dropdown-menu\"]//label"));

		System.out.println(elements.size());
		for (WebElement element : elements) {
			String eleme = element.getText();
			if (eleme.equals("Angular") || (eleme.equals("Java")) || (eleme.equals("c#"))) {
				element.click();
			}

		}

		Thread.sleep(3000);
		driver.close();

	}

}

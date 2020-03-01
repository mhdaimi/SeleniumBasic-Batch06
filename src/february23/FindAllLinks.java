package february23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FATEEMA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks);
		for (WebElement link : allLinks) {
			System.out.println(link.getText() + "-->" + link.getAttribute("href"));
		}
	}

}

package february23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropdown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FATEEMA\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement dd = driver.findElement(By.id("select-demo"));
		Select obj = new Select(dd);
		obj.selectByValue("Friday");
		
		Select multiDD = new Select(driver.findElement(By.name("States")));
		multiDD.selectByIndex(1);
		Thread.sleep(2000);
		multiDD.selectByValue("New York");
		Thread.sleep(2000);
		multiDD.selectByVisibleText("Washington");
		Thread.sleep(2000);
		
		multiDD.deselectAll();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}

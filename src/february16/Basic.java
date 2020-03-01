package february16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FATEEMA\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		
		WebElement textBox = driver.findElement(By.name("first_name"));
		
		textBox.sendKeys("Mohammad");*/
		
/*		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();*/
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Java Selenium");
		
		
		
	}

}

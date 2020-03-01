package february23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FATEEMA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/"); 
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mohammad");
	
		driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
		
		
		
	}

}

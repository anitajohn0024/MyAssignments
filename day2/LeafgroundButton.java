package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		WebElement elementClick = driver.findElement(By.xpath("//span[text()='Click']"));
		elementClick.click();
		
		if(driver.getTitle().contains("Dashboard")) {
			System.out.println("Moved to Next Page");
		}
		
		WebElement disabledButton = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']"));
		boolean enabledorDisabled = disabledButton.isEnabled();
		System.out.println(enabledorDisabled);
		
		
	}

}

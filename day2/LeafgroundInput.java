package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundInput {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		driver.manage().window().maximize();

		WebElement typeName = driver.findElement(By.name("j_idt88:name"));
		typeName.sendKeys("Anita John");

		WebElement ifTextBoxDisabled= driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']"));
		boolean enabled = ifTextBoxDisabled.isEnabled();
		System.out.println(enabled);

		//System.out.println(driver.findElement(By.name("j_idt88:j_idt95")).getAttribute("value"));

		WebElement clearTheText = driver.findElement(By.name("j_idt88:j_idt95"));
		clearTheText.clear();

	}

}

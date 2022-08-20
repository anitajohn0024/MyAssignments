package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignup {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement createNewAccount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	createNewAccount.click();
	
	WebElement elementFirstName = driver.findElement(By.xpath("(//input[@class = 'inputtext _58mg _5dba _2ph-'])[1]"));
	elementFirstName.sendKeys("Anita");
	
	WebElement elementLastName = driver.findElement(By.xpath("(//input[@class = 'inputtext _58mg _5dba _2ph-'])[2]"));
	elementLastName.sendKeys("John");
	
	WebElement elementMobileNo= driver.findElement(By.xpath("(//input[@class = 'inputtext _58mg _5dba _2ph-'])[3]"));
	elementMobileNo.sendKeys("+919345657687");
	
	WebElement elementNewPassword = driver.findElement(By.xpath("(//input[@class = 'inputtext _58mg _5dba _2ph-'])[5]"));
	elementNewPassword.sendKeys("!23$567&Avfd");
	
	WebElement elementDay = driver.findElement(By.xpath("//select[@id='day']"));
	Select dd1 = new Select(elementDay);
	dd1.selectByVisibleText("23");
	
	WebElement elementMonth = driver.findElement(By.xpath("//select[@id='month']"));
	Select dd2 = new Select(elementMonth);
	dd2.selectByIndex(9);
	
	WebElement elementYear = driver.findElement(By.xpath("//select[@id='year']"));
	Select dd3 = new Select(elementYear);
	dd3.selectByValue("1992");
	
	WebElement elementGender = driver.findElement(By.xpath("//input[@class = '_8esa']"));
	elementGender.click();
	
	
	
}
}

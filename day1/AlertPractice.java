package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractice {
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();
		driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		System.out.println(text1);
		alert1.accept();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		

		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
//		driver.findElement(By.xpath("(//a[@class = 'ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@aria-label = 'Close'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[5]")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Anita");
		alert3.accept();
		
		driver.findElement(By.xpath("(//span[text()='Delete']/ancestor::button")).click();
		driver.findElement(By.xpath("//span[text()='No']/ancestor::button")).click();
		
		
		driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[6]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-extlink']/ancestor::a)")).click();
		
		
	}
	

}


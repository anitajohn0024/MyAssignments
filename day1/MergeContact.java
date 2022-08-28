package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {
public static void main(String[] args) {
		
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 	
		 * 6. Click on Merge Contacts using Xpath Locator
		 * 
		 * 7. Click on Widget of From Contact
		 * 
		 * 8. Click on First Resulting Contact
		 * 
		 * 9. Click on Widget of To Contact
		 * 
		 * 10. Click on Second Resulting Contact
		 * 
		 * 11. Click on Merge button using Xpath Locator
		 * 
		 * 12. Accept the Alert
		 * 
		 * 13. Verify the title of the page
		 */
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
	
	WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
	elementPassword.sendKeys("crmsfa");
	
	WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	
	WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	elementCRMSFA.click();
	
	driver.findElement(By.linkText("Contacts")).click();
	
	driver.findElement(By.xpath("//a[text()='Merge Contacts']/parent::li")).click();
	
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
	Set<String> windowHandles1 = driver.getWindowHandles();
	List<String> list1 = new ArrayList<String>(windowHandles1);
	System.out.println(windowHandles1.size());
	
	driver.switchTo().window(list1.get(1));
	
	driver.findElement(By.xpath("//td//a[@class='linktext']")).click();
	driver.switchTo().window(list1.get(0));
	
	
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	
	Set<String> windowHandles2 = driver.getWindowHandles();
	List<String> list2 = new ArrayList<String>(windowHandles2);
	System.out.println(windowHandles2.size());
		
	driver.switchTo().window(list2.get(1));
	
	driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
	driver.switchTo().window(list2.get(0));
	
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	
//	if(driver.getTitle().contains("Merge Contacts")){
//		System.out.println("Came back to Merge Contacts Page");
//	}
			
		System.out.println(driver.getTitle());	
	

	}

}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadUsingXpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//driver.close();
		
//		WebElement elementUsername = driver.findElement(By.id("username"));
//		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementUsername = driver.findElement(By.xpath("//input[@type='text']"));
		elementUsername.sendKeys("Demosalesmanager");
		
//		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
//		elementPassword.sendKeys("crmsfa");
		
		WebElement elementPassword = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		elementPassword.sendKeys("crmsfa");
				
//		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
//		elementLogin.click();
		
		WebElement elementLogin = driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']"));
		elementLogin.click();
		
//		WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
//		String text = elementWelcomeMessage.getText();
//		System.out.println(text);
//		
//		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
//		elementCRMSFA.click();
		
		WebElement elementCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		elementCRMSFA.click();
		
//		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
//		elementLeads.click();
		
		WebElement elementLeads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		elementLeads.click();
		
		
//		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
//		elementCreateLead.click();
		
		WebElement elementCreateLead = driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));
		elementCreateLead.click();
		
//		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
//		elementCompanyName.sendKeys("Testleaf");
		
		
//		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
//		elementFirstName.sendKeys("John");
//		
//		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
//		elementLastName.sendKeys("Michael");
}
}

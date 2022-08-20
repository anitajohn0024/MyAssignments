package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement elementUsername = driver.findElement(By.xpath("//input[@type='text']"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin = driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']"));
		elementLogin.click();
		
		WebElement elementCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		elementCRMSFA.click();
		
		WebElement elementLeads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		elementLeads.click();
		
		WebElement elementFindLeads = driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]"));
		elementFindLeads.click();
		
		WebElement elementFindFirstName = driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]"));
		elementFindFirstName.sendKeys("John");
		
		WebElement elementFindLeadsButton = driver.findElement(By.xpath("(//button[@class = 'x-btn-text'])[7]"));
		elementFindLeadsButton.click();
		
		WebElement elementFirstRow = driver.findElement(By.xpath("(//table//tr/td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[@class='linktext'])[1]"));
		elementFirstRow.click();
		
		System.out.println(driver.getTitle());
		
		WebElement elementEdit = driver.findElement(By.xpath("//a[text() = 'Edit']"));
		elementEdit.click();
		
		WebElement elementEditCompanyName = driver.findElement(By.xpath("//input[@id = 'updateLeadForm_companyName']"));
		elementEditCompanyName.clear();
		elementEditCompanyName.sendKeys("TechM");
		
		WebElement elementUpdateButton = driver.findElement(By.xpath("(//input[@class = 'smallSubmit'])[1]"));
		elementUpdateButton.click();
		
		WebElement elementCompanyNameResult = driver.findElement(By.xpath("//span[@id = 'viewLead_companyName_sp']"));
		String textCompanyName = elementCompanyNameResult.getText();
		System.out.println(textCompanyName);
		
		driver.close();
		
	}

}

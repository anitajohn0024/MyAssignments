package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//driver.close();
		
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
		String text = elementWelcomeMessage.getText();
		System.out.println(text);
		
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Testleaf");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("John");
		
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Michael");
		
		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("John");
		
		WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartment.sendKeys("Logistics");
		
		WebElement elementSourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(elementSourceDD);
		dd.selectByIndex(3);
		
		WebElement elementMarketingCampaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd1 = new Select(elementMarketingCampaignDD);
		dd1.selectByVisibleText("Automobile");
		
		WebElement elementIndustryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 =new Select(elementIndustryDD);
		dd2.selectByValue("IND_MANUFACTURING");
		
		WebElement elementOwnershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		elementOwnershipDD.sendKeys("Sole Proprietorship");
		
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("This is for testing purpose only.");
		
		WebElement elementEmailId = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmailId.sendKeys("john.michael@gmail.com");
		
		WebElement elementStateProvinceDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd3 =new Select(elementStateProvinceDD);
		dd3.selectByVisibleText("New York");
		
		WebElement elementSubmitLead = driver.findElement(By.name("submitButton"));
		elementSubmitLead.click();
		
		System.out.println(driver.getTitle());
		
		WebElement elementDuplicateLead = driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicateLead.click();
		
		WebElement elementCompanyNameDuplicate = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyNameDuplicate.clear();
		elementCompanyNameDuplicate.sendKeys("TestleafDuplicate");
		
		WebElement elementFirstNameDuplicate = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstNameDuplicate.clear();
		elementFirstNameDuplicate.sendKeys("John(Duplicate)");
		
		WebElement elementCreateLeadInDuplicate = driver.findElement(By.name("submitButton"));
		elementCreateLeadInDuplicate.click();
		
		System.out.println(driver.getTitle());
		
}
}

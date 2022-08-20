package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
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

		WebElement elementFindLeads1 = driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]"));
		elementFindLeads1.click();

		WebElement elementPhone = driver.findElement(By.xpath("(//span[@class = 'x-tab-strip-text '])[2]"));
		elementPhone.click();

		//	WebElement elementAreaCode = driver.findElement(By.xpath("//input[@name='phoneAreaCode']"));
		//	elementAreaCode.sendKeys("040");

		WebElement elementPhoneNumber = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		elementPhoneNumber.sendKeys("99");

		WebElement elementFindLeadsButton1 = driver.findElement(By.xpath("(//button[@class = 'x-btn-text'])[7]"));
		elementFindLeadsButton1.click();
		Thread.sleep(1000);
		WebElement elementFirstLeadID = driver.findElement(By.xpath("//td//a[@class = 'linktext']"));
		String firstLeadID = elementFirstLeadID.getText();
		System.out.println(firstLeadID);

		elementFirstLeadID.click();

		WebElement elementDeleteButton = driver.findElement(By.className("subMenuButtonDangerous"));
		elementDeleteButton.click();

		WebElement elementFindLeads2 = driver.findElement(By.linkText("Find Leads"));
		elementFindLeads2.click();

		WebElement elementFindLeadID = driver.findElement(By.xpath("//input[@name='id']"));
		elementFindLeadID.sendKeys(firstLeadID);

		WebElement elementFindLeadsButton2 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elementFindLeadsButton2.click();

		WebElement noRecordsText = driver.findElement(By.xpath("//div[contains(text(), 'No records')]"));
		String noRecords = noRecordsText.getText();
		System.out.println(noRecords);

		driver.close();

	}
}

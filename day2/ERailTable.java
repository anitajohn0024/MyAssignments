package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERailTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		WebElement elementFrom = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		elementFrom.clear();
		elementFrom.sendKeys("MS",Keys.TAB);
		
		WebElement elementTo = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		elementTo.clear();
		elementTo.sendKeys("MDU",Keys.TAB);
		
		WebElement sortOnDateCheckBox = driver.findElement(By.xpath("//input[@id = 'chkSelectDateOnly']"));
		sortOnDateCheckBox.click();
		
		List <WebElement> elementRows = driver.findElements(By.xpath("//table[3]//tr"));
		List <WebElement> elementCols = driver.findElements(By.xpath("//table[3]//tr[1]/td"));
		
		for(int i=1; i<=elementRows.size();i++) {
			for(int j=1; j<=9;j++) {
				WebElement elementTrainInfo = driver.findElement(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']//tr["+i+"]/td["+j+"]"));
				String text = elementTrainInfo.getText();
				System.out.println(text+" ");
			}
			System.out.println();
		}
		
	
	}
}

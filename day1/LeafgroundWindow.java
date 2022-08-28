package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundWindow {


	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//span[text()='Open']/parent::button")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(list1.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(list1.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']/parent::button")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> list3 = new ArrayList<String>(windowHandles3);
		int count = list3.size()-1;
		System.out.println("The number of newly opened tabs are : "+count);


		driver.findElement(By.xpath("//span[text()='Close Windows']/parent::button")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(windowHandles2);
		for(String eachWindow: windowHandles2) {
			if(eachWindow!=list2.get(0)) {
				driver.switchTo().window(eachWindow);
				driver.close();
			}else {
				driver.switchTo().window(list2.get(0));
			}
		}

			
		driver.findElement(By.xpath("//span[text()='Open with delay']/parent::button")).click();
		driver.close();
		
		
		
	}
}

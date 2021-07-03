package qaclickacademy.Mavenjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void browserAutomation() {
		System.out.println("browserAutomation");
	}
	
	@Test
	public void elementsUI() {
		System.out.println("elementsUI");
	}
	
	@Test
	public void neaOnline() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://neabilling.com/viewonline/");
		
		WebElement location = driver.findElement(By.id("NEA_location"));
		
		Select neaLocation = new Select(location);
		
		neaLocation.selectByVisibleText("BELBARI");
//		neaLocation.selectByVisibleText("ITAHARI");
		
		driver.findElement(By.id("sc_no")).sendKeys("034.22.066");
		driver.findElement(By.id("consumer_id")).sendKeys("25603");
		
//		driver.findElement(By.id("sc_no")).sendKeys("035.09.020");
//		driver.findElement(By.id("consumer_id")).sendKeys("12272");
		
		driver.findElement(By.id("Fromdatepicker")).clear();
		driver.findElement(By.id("Todatepicker")).clear();
		
		driver.findElement(By.id("Fromdatepicker")).sendKeys("01/01/2021"); /// mm/dd/yy
		driver.findElement(By.id("Todatepicker")).sendKeys("07/01/2021");
		
		driver.findElement(By.xpath("//input[@value='Generate']")).click();
		
	}

}

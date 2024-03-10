package StepDep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class clander_demo {
	
	WebDriver driver;
	
	@Test
	public void clan() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
       driver = new ChromeDriver(); 
		driver.get("https://www.southwest.com/"); //OPEN APPLICATION URL
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();  
		
        JavascriptExecutor date = (JavascriptExecutor) driver;
		
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='08/15/2023'");
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='08/20/2023'");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div[3]/span/span/div/div/div[1]/button[6]/span")).click();
		
		Thread.sleep(10000);
		driver.quit();
		
	}
	// We can create object of the class
	// We can not create object of the interface
	// By Type crusting, we can create object of the interface

}

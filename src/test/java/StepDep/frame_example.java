package StepDep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class frame_example {
	WebDriver driver;
	@Test
	public void fraedemo() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
       driver = new ChromeDriver(); 
		driver.get("https://docs.oracle.com/javase/7/docs/api/"); //OPEN APPLICATION URL
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();  
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[6]/a")).click();
		
		Thread.sleep(10000);
		driver.quit();
		
		
	}
	
	
	

}

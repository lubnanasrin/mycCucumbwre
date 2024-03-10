package StepDep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDeffinations {
	 WebDriver driver;
	@Given("^Open application$")
	public void open_application() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\Chorme Driver\\chrome.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
       driver = new ChromeDriver(); 
		driver.get("https://demoblaze.com/"); //OPEN APPLICATION URL
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();  
	}

	@Then("^Click signup link$")
	public void click_signup_link() throws Throwable {
	    driver.findElement(By.id("signin2")).click();
	}

	@Then("^Enter Username$")
	public void enter_Username() throws Throwable {
	    driver.findElement(By.id("sign-username")).sendKeys("irdatx");
	}

	@Then("^Enter Password$")
	public void enter_Password() throws Throwable {
	    driver.findElement(By.id("sign-password")).sendKeys("Dallas12345");
	}

	@Then("^Click Signup button$")
	public void click_Signup_button() throws Throwable {
		
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Thread.sleep(2000);
	    driver.switchTo().alert().accept();
		
		driver.close();
	
	}



}

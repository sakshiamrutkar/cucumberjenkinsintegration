package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	WebDriver driver;
	@Given("user open application")
	public void user_open_application() {
	    // Write selenium coe to open browser and newtours app
		//System.out.println("Launch Chrome and Newtours application");
		
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe"); 
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com");
	}

	@When("user clicks on Registration")
	public void user_clicks_on_Registration() {
	   //System.out.println("Click on Registration");
	  // Actions a = new Actions(driver);
	   //a.moveToElement(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"))).click().perform();
		
		driver.findElement(By.linkText("REGISTER")).click();
	}

	@Then("users validates Registration page")
	public void users_validates_Registration_page() {
//		System.out.println("Validate - Registration");
//	    String expected = driver.getCurrentUrl();
//	    System.out.println("\n\n\n\n\n\n"+expected);
//		String actual = "http://newtours.demoaut.com/";
//		Assert.assertEquals(expected, actual);
		Assert.assertTrue(driver.getTitle().contains("Register"));
//		Assert.assertEquals(driver.getTitle(),"Register: Mercury Tours");
//		Assert.assertTrue(driver.getCurrentUrl().contains("http://newtours.demoaut.com/mercuryregister.php"));
//		System.out.println("Hey");
	}

	@When("user enter firstname")
	public void user_enter_firstname() {
//	    System.out.println("enter firstname");
//	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sakshi");
		driver.findElement(By.name("firstName")).sendKeys("Sakshi");
	}

	@When("user enter lastname")
	public void user_enter_lastname() {
		System.out.println("enter lastname");
		driver.findElement(By.name("lastName")).sendKeys("Amrutkar");
	}

	@When("user enter password")
	public void user_enter_password() {
		System.out.println("enter password");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcdef");
	}

	@When("user enter confirm password")
	public void user_enter_confirm_password() {
		System.out.println("enter confirm password");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("abcdef");
	}

	@When("user click on Register button")
	public void user_click_on_Register_button() {
		System.out.println("Click on Register");
		driver.findElement(By.xpath("//input[@name='register']")).click();
	}

	@Then("user validates Registration success")
	public void user_validates_Registration_success() {
		System.out.println("Validate Success");
		driver.close();
	}
   
}

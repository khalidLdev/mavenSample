package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStepsDefinition {
	
	static WebDriver driver;
	
	@Given("user is on login")
	public void user_is_on_login() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().getImplicitWaitTimeout();
	    driver.get("https://www.saucedemo.com/");
	}
	
	@When("user unter valid username and password")
	public void user_unter_valid_username_and_password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		
	}
	
	@And("clicks on button")
	public void clicks_on_button() {
	    driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	}
	
	
	@Then("user is nagivated to home page")
	public void user_is_nagivated_to_home_page() {
		driver.findElement(By.xpath("//div[@class='app_logo']")).getSize();
		
	}
	
	@And("close the browser")
	public void close_the_browser() {

		driver.close();
	}
}

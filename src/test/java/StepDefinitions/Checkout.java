package StepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout {
	
	WebDriver driver = new ChromeDriver();
	
	
	
	@When("user unter valid standard_user and secret_sauce")
	public void user_unter_valid_standard_user_and_secret_sauce() {
		driver.navigate().to("https://www.saucedemo.com/");
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Swag Labs"); 
		assertTrue(verifyTitle);
		
	}

	@When("user unter valid locked_out_user and secret_sauce")
	public void user_unter_valid_locked_out_user_and_secret_sauce() {
		
	}

	@When("user add one or lot of products")
	public void user_add_one_or_lot_of_products() {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();

	}

	@When("clicks on add to cart")
	public void clicks_on_add_to_cart() {
	    
	}

	@When("clicks on cart icon")
	public void clicks_on_cart_icon() {
	    
	}

	@When("clicks on checkout")
	public void clicks_on_checkout() {
	    
	}

	@Given("use add valid costumer informations")
	public void use_add_valid_costumer_informations() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("clicks on continue")
	public void clicks_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("clicks on finish")
	public void clicks_on_finish() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("have a confirmation message")
	public void have_a_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}

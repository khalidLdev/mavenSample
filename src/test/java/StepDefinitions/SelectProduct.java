package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectProduct {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("user is on the inventory page")
	public void user_is_on_the_inventory_page() {
		driver = new ChromeDriver();
	    driver.manage().timeouts().getImplicitWaitTimeout();
	    driver.get("https://www.saucedemo.com/");
	    
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	@When("user select a product")
	public void user_select_a_product() {
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
	}
	
	@Then("the product is added to the cart")
	public void the_product_is_added_to_the_cart() {
	    driver.findElement(By.id("shopping_cart_container")).click();
	}
	@Then("delete product from cart page")
	public void delete_product_from_cart_page() {
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
	}
	@Then("back to shopping")
	public void back_to_shopping() {
		driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
	}	
	
}

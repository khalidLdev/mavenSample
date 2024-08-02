package org.sample.mavensample;




import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void telecharger() {
		driver.get("https://meteofrance.com/");
		
		//accepter les cookies + traiment JS de la pop up 
   		WebElement element = driver.findElement(By.id("didomi-notice-agree-button"));
   		JavascriptExecutor executor = (JavascriptExecutor)driver;
   		executor.executeScript("arguments[0].click();", element);
   		
   		driver.findElement(By.xpath("//div[@class=\"block_map_vigilance\"]")).click();
   		//driver.findElement(By.xpath("//div[@class=\"top_content\"]//div[1]//a[1]")).click();
		
	}
}

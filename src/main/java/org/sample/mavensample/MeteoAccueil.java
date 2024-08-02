package org.sample.mavensample;

import org.openqa.selenium.WebElement;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class MeteoAccueil{
	WebDriver driver = new ChromeDriver();
	

	@Test
	public void accueil() {
		
		driver.get("https://meteofrance.com/");
		 
		 
     	//accepter les cookies + traiment JS de la pop up 
   		WebElement element = driver.findElement(By.id("didomi-notice-agree-button"));
   		JavascriptExecutor executor = (JavascriptExecutor)driver;
   		executor.executeScript("arguments[0].click();", element);
   		
   		driver.findElement(By.id("search_form_input")).sendKeys("maroc");
		driver.findElement(By.xpath("//*[@id=\"block-mfsearchform\"]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"search_result_poi_PAYS175\"]/a/p/b")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2050)", "");
		
		//driver.close();
		
	}
	
	@Test
	public void file() {
		
		 try{
		        Thread.sleep(10000);
		        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		        ImageIO.write(image, "jpg", new File("C:\\Users\\Dell\\OneDrive\\Images\\testselemnium/screenshot.jpg"));
		    }
		    catch(Exception e){
		        e.printStackTrace();
		    }
	}
	
	@Test
	public void screenshot() throws IOException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.lambdatest.com/dashboard");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		Files.copy(scrFile, new File("C:\\\\Users\\\\Dell\\\\OneDrive\\\\Images\\\\testselemnium/screenshot2.jpg"));
	}
}


package org.sample.mavensample;



import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
	
    public static void main( String[] args )
    {
    	System.out.println("test");
    }
    
    
	public void navigate() {
    	ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/tags/selenium/");
        
		}	
}

/**
 * 
 */
package BasicWeb;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author umutx
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	
	@Before
	public  void prep() throws Exception{ 
		
		// set path for driver executeble 
		System.setProperty("webdriver.chrome.driver", "/SeleniumWDDemo/Driver/geckodriver.exe");
		
		String baseURL = "https://www.amazon.com/";
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		
		//driver.get("https://www.google.com");
		
		
		
	}

	@Test
	public void Excute( ) throws Exception{
		
		String baseURL = "https://www.amazon.com/";
		WebDriver driver = new FirefoxDriver();
			
		driver.navigate().to(baseURL);
		
		WebElement el = driver.findElement(By.cssSelector("#nav-logo > a.nav-sprite.nav-logo-tagline.nav-prime-try"));
		el.getText();
		
		//driver.findElement(By.)
		driver.getTitle();
		
		
		if(el.equals("Try Prime")) {
			
			System.out.println("name has been found" + el);
			
			return; 
			
		}
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}

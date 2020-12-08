/**
 * 
 */
package Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author umutx
 *
 */
public class WaitTypes {

	
	WebDriver driver;
	private long timeouts; 
	
	
	public WaitTypes () {
		
		this.driver = driver; 
		
		
		
		
		
		
	}
	
	
	public List<WebElement> waitForElement(By locater, int timeout) {
		
		List<WebElement> element = null; 
		
		try {
			
			System.out.println(" Waiting for maxium :" + timeout + " seconds for element to be availible");
			
			WebDriverWait wait = new WebDriverWait(driver, timeouts);
			element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locater));
			
			System.out.println("Element appear on the web page!!!");
			
			
		} catch(Exception e) {
			
			
			System.out.println("Element not appear expected time on webpage!!!");
		}
		
		return element; 
		
		
	}
	
	
	
	
	
public void clickwhenElementready(By locater, int timeout) {
		
		
		
		try {
			
			WebElement element = null; 
			
			System.out.println(" Waiting for maxium :" + timeout + " seconds for element to be clickble");
			
			WebDriverWait wait = new WebDriverWait(driver, timeouts);
			element = wait.until(ExpectedConditions.elementToBeClickable(locater));
			element.click();
			System.out.println("Element Clcik on the web page!!!");
			
			
		} catch(Exception e) {
			
			
			System.out.println("Element not appear expected time on webpage!!!");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

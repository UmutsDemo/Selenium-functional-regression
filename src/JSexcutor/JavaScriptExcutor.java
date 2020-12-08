/**
 * 
 */
package JSexcutor;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author umutx
 *
 */
public class JavaScriptExcutor {
	
	private WebDriver driver;
	String baseURL;
	private JavascriptExecutor js;
	
	
	@Before
	public void setUp() throws Exception
	{
		
		driver = new ChromeDriver();
		baseURL= "https://learn.letskodeit.com/pages/practice";
		js = (JavascriptExecutor) driver;
		
		// Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void JSexecutor() throws Exception
	{
		
		//driver.get(baseURL);
		js.executeScript("window.location = 'https://learn.letskodeit.com/pages/practice';");
		
		// find elements by JS executor !!!
		//WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
		//textBox.sendKeys("test");
		
		
		// get size of the window 
		long hight = (Long) js.executeScript("return window.innerHeight;");
		long width = (Long) js.executeScript("return window.innerWidth");
				
		System.out.println(" hight is: " + hight );
		System.out.println(" width is: " + width);
		
		
		// Scroll Down
		js.executeScript(" window.scrollBy(0, 1900)");
		Thread.sleep(3000);
		
		// Scroll Up
		js.executeScript("window.scrollBy(0, -1900)");
		
		// Scroll element into view
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -190)");
		
		// JS executor Click
		//WebElement checkBoxElement = driver.findElement(By.id(""));
		//js.executeScript("arguments[0].click();", checkBoxElement);
		
		
		
	}
	
	
	@Test
	public void JSexecutorClick() throws Exception
	{
		
		//driver.get("https://www.retailmenot.com/");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@After
	public void TearDown() throws Exception
	{
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

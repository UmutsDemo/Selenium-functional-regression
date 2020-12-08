/**
 * 
 */
package Autocomplete;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author umutx
 *
 */
public class AutoCompeleteFlight {
	
	private WebDriver driver; 
	private String BaseURL; 
	
	
	
	@Before
	public void SetUp() throws Exception
	{
		
		driver = new ChromeDriver();
		BaseURL = "https://www.goibibo.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(BaseURL);
		//driver.switchTo().alert().accept();
		
		
	}
	
	
	@Test
	public void testAutocompelete() throws Exception
	{
		
		
		
		String partialText = "LAX";
		String textToSelect = "Los Angeles,US (LAX)";
		
		WebElement textFiled = driver.findElement(By.id("gosuggest_inputSrc"));
		textFiled.sendKeys(partialText);
		
		WebElement ulElement = driver.findElement(By.id("react-autosuggest-1"));
		
		String innerHTML = ulElement.getAttribute("innerHTML");
		System.out.println("element has been found" + innerHTML);
		
		List<WebElement>LiElement = ulElement.findElements(By.tagName("li"));
		Thread.sleep(3000);
		for (WebElement element : LiElement )
		{
			if (element.getText().contains(textToSelect))
			{
				System.out.println("Selected:" + element.getText());
				element.click();
				break;
				
			}
			System.out.println(element.getText());
			
			
			
			
		}
		
	
		
		
		
		
		
		
		
	}
	
	
	@After
	public void TearDown() throws Exception
	{
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	



/**
 * 
 */
package BasicWeb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * @author umutx
 *
 */
public class FindListofElements {

	private WebDriver driver;
	private String BaseURL, BaseURL1;
	
	@Before
	public void SetUp() throws Exception
	{
		
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		BaseURL = "https://learn.letskodeit.com/pages/practice";
		BaseURL1 = "https://www.expedia.com";
		// max out driver 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(BaseURL);
		
		
	}
	
	@Test
	//(priority = 0)
	public void Excution() throws Exception
	{
		
		boolean ischecked = false; 
		List<WebElement> RadioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name, 'cars')]"));
		
		int size = RadioButtons.size();
		System.out.println("Size of the radio btn list is: " + size);
		for(int i=0; i<size; i++)
		{
			
			ischecked = RadioButtons.get(i).isSelected();
			
			
			if(!ischecked) {
				
				RadioButtons.get(i).click();
				Thread.sleep(3000);
			}
			
			
		}
		
		
		
	}
	
	
	@Test
	//(priority= 1)
	public void checkedDropdown() throws Exception 
	{
		
		driver.get(BaseURL);
		
		WebElement element = driver.findElement(By.id("carselect"));
		
		Select sel = new Select(element);
		
		Thread.sleep(3000);
		System.out.println("Select object by value");
		sel.selectByValue("benz");
		sel.deselectByValue("benz");
		
		Thread.sleep(3000);
		System.out.println("Select object by index");
		sel.selectByIndex(2);
		sel.deselectByIndex(2);
		
		Thread.sleep(3000);
		System.out.println("select by visible text");
		sel.selectByVisibleText("BMW");
		sel.deselectByVisibleText("BMW");
		
		Thread.sleep(2000);
		System.out.println("Print all list of options");
		List<WebElement> options = sel.getOptions();
		
		int size = options.size();
		
		for(int i= 0; i<size; i++)
		{
			String optionname = options.get(i).getText();
			
			System.out.println("print the option name" + optionname);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	@Test
	public void HiddenElement() throws Exception
	{
		
		driver.get(BaseURL);
		
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Test box Displayed: " + textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		WebElement hiddenButton = driver.findElement(By.id("hide-textbox"));
		
		hiddenButton.click();
		
		System.out.println("Clicked on hide button");
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		// show textbox
		WebElement ShowButton = driver.findElement(By.id("show-textbox"));
		
		ShowButton.click();
		
		System.out.println("Clicked on show button");
		System.out.println("Text Box Displayed: " + ShowButton.isDisplayed());
		
		
		
		
		
	}

	
	@Test
	public void Expedia() throws Exception
	{
		
		//driver.get(BaseURL1);
		WebElement childage = driver.findElement(By.id(""));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@After
	public void TearDown() throws Exception
	{
	
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

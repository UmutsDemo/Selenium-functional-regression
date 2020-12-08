/**
 * 
 */
package BasicWeb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author umutx
 *
 */
public class AutoChrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\umutx\\OneDrive\\Desktop\\WORKSPSCE\\driver\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String BaseURL = "https://www.guru99.com";
		
		driver.get(BaseURL);
		
		// switiching to alert to close alert pop up 
		//Alert al = driver.switchTo().alert();
		
		// capture alert pop up text
		//String alertMSG = driver.switchTo().alert().getText();
		//System.out.println(alertMSG);
		
		// dismiss alert msg
		//al.dismiss();
		
		
		// close dirver
		driver.quit();
	}

}

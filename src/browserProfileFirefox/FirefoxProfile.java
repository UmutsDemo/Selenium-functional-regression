/**
 * 
 */
package browserProfileFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.internal.ProfilesIni;

/**
 * @author umutx
 *
 */
public class FirefoxProfile {

	public static void main(String[] args)
			{
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\umutx\\OneDrive\\Desktop\\WORKSPSCE\\driver\\firefox\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		String BaseURL= "https://www.letskodeit.com";
		WebDriver driver; 
		
		ProfilesIni profile = new ProfilesIni();
		org.openqa.selenium.firefox.FirefoxProfile fxProfile = profile.getProfile("automationprofile");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(fxProfile);
		
		
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get(BaseURL);
		
		
		driver.quit();
		
		
		
		
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

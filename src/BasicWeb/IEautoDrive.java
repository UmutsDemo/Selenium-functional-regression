/**
 * 
 */
package BasicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author umutx
 *
 */
public class IEautoDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver driver;
		String BaseURL = "https://www.guru99.com";
		
		// need set Caps for IE driver to work it properly 
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\umutx\\OneDrive\\Desktop\\WORKSPSCE\\driver\\IE\\IEDriverServer.exe");
		
		 driver = new InternetExplorerDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.get(BaseURL);
		
		
		
		
		
		
		
		
		
		

	}

}

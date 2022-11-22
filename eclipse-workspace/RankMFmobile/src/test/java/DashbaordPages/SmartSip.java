package DashbaordPages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RankMFMobileAutomation.RankMFmobile.BaseClass;
import RankMFMobileAutomation.RankMFmobile.Pageloadwait;

public class SmartSip extends BaseClass {
	
	public SmartSip(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    	
    }

	
	public static void smartsipsearch() throws InterruptedException 
	{
		
  WebElement search=driver.findElement(By.xpath("//android.widget.EditText[@bounds='[105,244][1080,375]']"));
  driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
     search.sendKeys("Uti Nifty 50");
     Thread.sleep(1000);
   search.sendKeys(Keys.ARROW_DOWN);
   Thread.sleep(2000);
    search.sendKeys(Keys.ENTER);
  
	 
	
	
	
	
	}

}

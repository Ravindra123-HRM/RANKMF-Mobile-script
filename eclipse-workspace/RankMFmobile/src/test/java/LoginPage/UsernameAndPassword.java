package LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import DashbaordPages.Dashboard;
import RankMFMobileAutomation.RankMFmobile.BaseClass;



public class UsernameAndPassword extends BaseClass{
	
	
	
	public UsernameAndPassword(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    	
    }

	


	public static  void setusernamepassword() throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement b=driver.findElement(By.xpath("//android.widget.EditText[@bounds='[67,1006][894,1133]']"));
		b.sendKeys("RR34434");
		Thread.sleep(2000);
		WebElement c=driver.findElement(By.xpath("//android.widget.EditText[@bounds='[67,1196][894,1323]']"));
		c.sendKeys("Ravi@2022");
		Thread.sleep(2000);
		WebElement d=driver.findElement(By.xpath("//android.widget.TextView[@text='LOGIN']"));
		d.click();
	
	}
		
}

		
	
		
		
	
         
	
	



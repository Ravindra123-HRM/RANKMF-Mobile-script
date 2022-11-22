package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import RankMFMobileAutomation.RankMFmobile.BaseClass;

public class SkipOnbaordingPage extends BaseClass {
	
	public SkipOnbaordingPage(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    	
    }
	
	public static void skipstep() throws InterruptedException
	{
		boolean isClicked  = true;
		if(isClicked)
		{
		Thread.sleep(5000);
		 WebElement text=driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
		 System.out.println(text.getText()); 
		  WebElement recommended=driver.findElement(By.xpath("//android.widget.TextView[@text='Skip']"));
		  Actions a=new Actions(driver);
		 a.moveToElement(recommended).click().build().perform();
		//Assert.assertFalse(driver.findElement(By.xpath("//android.widget.TextView[@text='Skip']")).isSelected());  
		//  System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Skip']")).isSelected());
		
		}
		
		else 
			{return;}
		
		
			
         
		// Thread.sleep(3000);
		
	          
		
		
	}
	

}

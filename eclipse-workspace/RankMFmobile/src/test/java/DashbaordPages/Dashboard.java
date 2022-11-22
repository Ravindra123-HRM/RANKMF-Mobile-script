package DashbaordPages;

import java.awt.Dimension;
import java.time.Clock;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import RankMFMobileAutomation.RankMFmobile.BaseClass;
import RankMFMobileAutomation.RankMFmobile.Pageloadwait;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class Dashboard extends BaseClass {
	static Pageloadwait wait;
	
	public Dashboard(WebDriver driver)
    {

    	PageFactory.initElements(driver, this);
    	
    	
    }


	public static void Onboardingpagelogin() throws InterruptedException
	{
		
		

		//Thread.sleep(3000);
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20, 1));
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        WebElement profilename=driver.findElement(By.xpath("//android.widget.TextView[@text='Hi, Ravindra Ramesh Chavan']"));
         // wait.until(ExpectedConditions.elementToBeClickable(profilename));
        System.out.println("Profile name of current profile "+profilename.getText());
       
		Thread.sleep(2000);
         WebElement totalvalue=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]"));
         System.out.println("Total value "+totalvalue.getText());
         
        Thread.sleep(2000);
        WebElement returns=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]"));
        System.out.println("Total invested value "+returns.getText());
        
        Thread.sleep(2000);
        WebElement currentreturns=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]"));
        System.out.println("Current return value "+currentreturns.getText());
         Thread.sleep(2000);
        WebElement source= driver.findElement(By.xpath("//android.widget.TextView[@text='Start an SmartSIP']"));
        source.click();
        System.out.println("Click on smart sip ");
        
        Thread.sleep(2000);	
        WebElement add_watchlist= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup"));
        add_watchlist.click();
        System.out.println("Click on addwatchlist ");
      //*[@id="screenshotContainer"]/div[2]/div/div/div/div/div[82]
      //*[@id="screenshotContainer"]/div[2]/div/div/div/div/div[83]
   
        
        Thread.sleep(2000);
        WebElement dashbaord=driver.findElement(By.xpath("//android.widget.TextView[@text='Dashboard']"));
        dashbaord.click(); 
        System.out.println("Click on dashbaord ");
        
        Thread.sleep(2000);
        WebElement evaluate_profile=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup[1]"));
        evaluate_profile.click();
        System.out.println("Click on Evaluate profile ");
        
        Thread.sleep(2000);
        WebElement evaluate_profile_backbutton_backbutton=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView"));
        evaluate_profile_backbutton_backbutton.click();
        System.out.println("Click on evalauate profile backbutton ");
        
        Thread.sleep(2000);
        WebElement click_mutual_fund_basket=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[4]/android.view.ViewGroup[1]"));
        click_mutual_fund_basket.click();
        System.out.println("Click on mutual fund basket equity scheme ");
        
        Thread.sleep(2000);
        WebElement dashbaord1=driver.findElement(By.xpath("//android.widget.TextView[@text='Dashboard']"));
        dashbaord1.click(); 
        System.out.println("Click on dasbaord page ");
        
    	
	}
	public static void dashbaord() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     //WebElement topcategories_commodity=driver.findElement(By.xpath("//android.widget.TextView"));
		Thread.sleep(3000);
		List<WebElement> lists=driver.findElements(By.xpath("//android.widget.TextView"));
		for(WebElement e: lists)
	
			System.out.println(e.getAttribute("Commodity"));
		       
			scroll((AndroidDriver) driver);
			
			///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText
			
		
	   
      // driver.findElement(By.linkText("Commodity")).click();
      //topcategories_commodity.click(); 
        // AndroidElement list=driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[116,1159][308,1352]']"));
       // System.out.println("Click on top categories equity ");

        
       // Thread.sleep(2000);
      //  WebElement topcategories_dashbaordbackpage=driver.findElement(By.xpath("//android.widget.TextView[@text='Dashboard']']"));
       // topcategories_dashbaordbackpage.click(); 
      //  System.out.println("Click on dashbaord page");
        
        
        
         
	}


	
	public static   void scroll(AndroidDriver driver) throws InterruptedException {
		org.openqa.selenium.Dimension dimension=driver.manage().window().getSize();
		int start_x=(int) (dimension.width*0.5);
		int start_y=(int) (dimension.height*0.8);
		
		int end_x=(int) (dimension.width*0.2);
		int end_y=(int) (dimension.height*0.2);
		
		
		TouchAction touch=new TouchAction(driver);
		touch.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(end_x, end_y)).release().perform();
		// TODO Auto-generated method stub
		//Thread.sleep(3000);
		
		
	}


	
	
	

}


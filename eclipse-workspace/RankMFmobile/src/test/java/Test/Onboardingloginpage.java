package Test;

import org.testng.annotations.Test;

import DashbaordPages.Dashboard;
import DashbaordPages.Equity_Lumpsum_and_Sip_order;
import DashbaordPages.SmartSip;
import LoginPage.SkipOnbaordingPage;
import LoginPage.UsernameAndPassword;
import RankMFMobileAutomation.RankMFmobile.BaseClass;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;




public class Onboardingloginpage extends BaseClass  {

	
	@BeforeClass
    public static  void SetInitialization() throws MalformedURLException 
	{
		driver=setup();
		
	}
	
	
	@Test
	public static void skippage() throws InterruptedException
	{
		
		
			SkipOnbaordingPage.skipstep();
			
	}
		
		
		
		
		
		
     

	/*@Test(groups= {"Regression"},dependsOnMethods= {"skippage"})
	public static void loginpage() throws InterruptedException
	{
	
			UsernameAndPassword.setusernamepassword();
			
			
		
		
	}*/
	@Test
	public static void dashbaordpage() throws InterruptedException
	{
		
		Dashboard.Onboardingpagelogin();
				
		
	}
	
	
	
	@Test(groups= {"Regression"},dependsOnMethods= {"dashbaordpage"})
	public static void explorepage() throws InterruptedException
	{
			
		Equity_Lumpsum_and_Sip_order.click_explore();
		
	}
	
	
	

}

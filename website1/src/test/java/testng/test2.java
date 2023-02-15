package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomMODULES.FANA;
import pomMODULES.GulFaizarchives;
import pomMODULES.Headers;
import pomMODULES.MyAccount;
import pomMODULES.cart;
import pomMODULES.checkout;
import pomMODULES.janab;

public class test2 {
	WebDriver driver1;
Headers x;
MyAccount y;
GulFaizarchives z;
		FANA p; 
		FANA k;
		cart c;
		checkout n;
      
	@BeforeClass
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver1 =new ChromeDriver();

		//Thread.sleep(4000);
		driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void loginApllication()
	{
		System.out.println("@BeforeMethod");
		driver1.get("https://www.heenakochhar.com/");
		
		
		 x= new Headers(driver1);
		x.clickOnmyacount();
		
		MyAccount y= new MyAccount(driver1);
		y.enterUserName();
		y.enterPassword();
		y.clickOnLogin();
		
		
	}
	
	@Test
	public void wishlist() throws InterruptedException
	{
		System.out.println("@test1");
	 x= new Headers(driver1);
		x.hoverOnCoolections();
		x.clickOngulfiz();
		
		z= new GulFaizarchives(driver1);
		z.clikOnimg1();
		
		 p= new FANA(driver1);
		p.clikOnplus();
		p.clikOnplus();
		p.clikOnminus();
		p.clikOnAddwishlist();
		 Thread.sleep(4000);

		x.hoverOnwishlisticon();
		
		 Thread.sleep(4000);

	}
	
	
	
	
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		
		System.out.println("@After Method");
		x.hoverOnMyAccount();
		
		
		x.clickOnLogout();
		
	}
	
	@AfterClass
	public void afterclass() throws InterruptedException
	{
		System.out.println("@After class");
		
		
		driver1.close();
		
		
	}
}

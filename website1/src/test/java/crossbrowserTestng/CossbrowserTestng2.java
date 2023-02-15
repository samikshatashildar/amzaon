package crossbrowserTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomMODULES.FANA;
import pomMODULES.GulFaizarchives;
import pomMODULES.Headers;
import pomMODULES.MyAccount;
import pomMODULES.cart;
import pomMODULES.checkout;

public class CossbrowserTestng2 {
	
	WebDriver driver1;
	Headers x;
	MyAccount y;
	GulFaizarchives z;
			FANA p; 
			FANA k;
			cart c;
			checkout n;


	
	@Parameters("browser123")
	@BeforeTest
	public void luanchbrowser(String browser) {
		System.out.println("aaaaaaaaa");
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver1 =new ChromeDriver();
			 
}
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			 driver1 =new FirefoxDriver();

}
		driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver1.manage().window().maximize();
	}
	 
	
	@BeforeClass
	public void createPomobjects() {
		x= new Headers(driver1);
		 y= new MyAccount(driver1);
		 z= new GulFaizarchives(driver1);
			 p= new FANA(driver1);
				k= new FANA(driver1);
				 c=new cart(driver1);
				 n= new checkout(driver1);
	}

	@BeforeMethod
	public void loginApllication()
	{
		System.out.println("@BeforeMethod");
		driver1.get("https://www.heenakochhar.com/");
		
		
		 x= new Headers(driver1);
		x.clickOnmyacount();
		
		 y= new MyAccount(driver1);
		y.enterUserName();
		y.enterPassword();
		y.clickOnLogin();
		
		
	}
	
	@Test
	public void wishlist()
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
		
		x.hoverOnwishlisticon();
		
	}
	

	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		
		System.out.println("@After Method");
		x.hoverOnMyAccount();
		
		
		x.clickOnLogout();
		
	}
	
	@AfterClass
	public void test123() {
		 x=null;
		 y=null;
		 z=null;
			 p=null; 
				k=null;
				c=null;
				 n=null;
	}
	@AfterTest
	public void afterclass() throws InterruptedException
	{
		System.out.println("@After class");
		
		
		driver1.close();
		driver1=null;
		System.gc();
		
	}
	
		

}

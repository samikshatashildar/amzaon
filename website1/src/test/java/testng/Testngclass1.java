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

public class Testngclass1 {
	
	WebDriver driver1;
Headers x;




	@BeforeClass
	public void luanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
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
	public void addTOCart()
	{
		System.out.println("@test1");
		Headers x= new Headers(driver1);
		x.hoverOnCoolections();
		x.clickOngulfiz();
		
		GulFaizarchives z= new GulFaizarchives(driver1);
		z.clikOnimg1();
		
		FANA p= new FANA(driver1);
		p.clikOnAddtocart();
		
		
	}
	
	@Test
	
	public void madeTOorder() throws InterruptedException
	{
		Thread.sleep(8000);
		x.hoverOnCoolections();
		x.clickOngulfiz();
		Thread.sleep(8000);
		GulFaizarchives z= new GulFaizarchives(driver1);
		z.clikOnimg1();
FANA k= new FANA(driver1);

Thread.sleep(8000);
		k.clikOnmadetoorder();
	
		k.clikOnKurtaLength();
		k.clikOnbackAcross();
		k.clikOnAcrossfront();
		k.clikOnShoulder();
		k.clikOnUpperbust();
		k.clikOnBust();
		k.clikOnUnderbust();
		k.clikOnWaist();
		k.clikOnHip();
		k.clikOnArmhole();
		k.clikOnBicep();
		k.clikOnElbow();
		k.clikOnWristcircumference();
		k.clikonSleevlenght();
		k.clikOnNeckdeepfront();
		k.clikOnNeckdeepback();
		k.clikOnBottomlength();
		k.clikOnBottomWaist();
		k.clikOnThigh();
		k.clikOnKnee();
		k.clikOnbottomCurcumferenceatangle();
		k.clikOnSubmit();
		Thread.sleep(4000);
		k.clikOnhomepag();
		Thread.sleep(4000);

	}
	
	@Test
	public void viewCartOption() throws InterruptedException {
		x.hoverOnCoolections();
		x.clickOngulfiz();
		Thread.sleep(8000);
		GulFaizarchives z= new GulFaizarchives(driver1);
		z.clikOnimg1();
		FANA k= new FANA(driver1);
		x.clickOnviewcart();
		k.clikOnviewcart();
		
		cart c=new cart(driver1);
		
		c.clickOnminus();
		c.clickOnupdate();
		Thread.sleep(4000);
		c.clickOnCheckout();
		Thread.sleep(4000);
		
		
		checkout n= new checkout(driver1);
		n.enterFirstname();
		n.enterLastname();
		n.clikOncompaneyname();
		n.clikOncountry();
		n.clikOnstreetaddress();
		n.clikOnappartmentname();
		n.clikOnTowncity();
		n.clikOnState();
		n.clikOnpostcode();
		n.clikOnPhonenum();
		Thread.sleep(4000);
		
		n.clikOnPlaceorder();
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



	
	
	
	
	


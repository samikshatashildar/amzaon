package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomMODULES.FANA;
import pomMODULES.GulFaizarchives;
import pomMODULES.Headers;
import pomMODULES.MyAccount;

public class Madeorder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver2 =new ChromeDriver();

		//Thread.sleep(4000);
		driver2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver2.get("https://www.heenakochhar.com/");
		
		Headers x= new Headers(driver2);
		x.clickOnmyacount();
		
		MyAccount y= new MyAccount(driver2);
		y.enterUserName();
		y.enterPassword();
		y.clickOnLogin();
		
		
		x.hoverOnCoolections();
		x.clickOngulfiz();
		
		GulFaizarchives z= new GulFaizarchives(driver2);
		z.clikOnimg1();
		
		FANA k= new FANA(driver2);
		
		k.clikOnmadetoorder();
		
		//k.clikOnYourname();
		//k.clikOnemail();
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
		Thread.sleep(20000);
		
		k.clikOnhomepag();
		
		x.hoverOnMyAccount();
		x.clickOnLogout();
		
		
	}

}

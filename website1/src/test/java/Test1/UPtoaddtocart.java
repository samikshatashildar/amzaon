package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomMODULES.FANA;
import pomMODULES.GulFaizarchives;
import pomMODULES.Headers;
import pomMODULES.MyAccount;
import pomMODULES.cart;

public class UPtoaddtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver1 =new ChromeDriver();

		//Thread.sleep(4000);
		driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver1.get("https://www.heenakochhar.com/");
		
		Headers x= new Headers(driver1);
		x.clickOnmyacount();
		
		cart c=new cart(driver1);
		
		MyAccount y= new MyAccount(driver1);
		y.enterUserName();
		y.enterPassword();
		y.clickOnLogin();
		
		
		x.hoverOnCoolections();
		x.clickOngulfiz();
		
		GulFaizarchives z= new GulFaizarchives(driver1);
		z.clikOnimg1();
		
		FANA p= new FANA(driver1);
		p.clikOnAddtocart();
		x.clickOnLogout();
		
	}

}

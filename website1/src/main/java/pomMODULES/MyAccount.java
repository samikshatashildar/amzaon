package pomMODULES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	//variable declare
	@FindBy (xpath="//input[@id='username']")
	private WebElement username ;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password ;
	
	@FindBy (xpath="//button[text()='Log in']")
	private WebElement login ;
	
	@FindBy (xpath="Remember me")
	private WebElement rememberme ;
	
	@FindBy (xpath="//a[text()='Lost your password?']")
	private WebElement lostuourpassword  ;
	
	
	@FindBy (xpath="//a[text()='Create an Account']")
	private WebElement createnewaccount  ;
	
	
	
	
	//variable initialise(constructor call)
	
	public  MyAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	
	//perform
	public void enterUserName () {
		username.sendKeys("sharda");
	}
	
	public void enterPassword () {
		password.sendKeys("Sharda@2021");
	}
	

	
	public void clickOnrememberbox() {
		rememberme.click();
		boolean result=rememberme.isSelected();
		if(result==true) {
			System.out.println("check box is selected" +result);
			rememberme.click();
		}else {
			
			System.out.println("check box is not selected" +result);
		}
				
		
	}
	
	public void clickOnLostYourPassword() {
		lostuourpassword .click();
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	
	
	public void clickOnCreateNewAccount() {
		createnewaccount.click();
	}
	
	

}

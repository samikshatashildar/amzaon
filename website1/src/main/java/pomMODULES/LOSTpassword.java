package pomMODULES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOSTpassword {

	
	
	@FindBy (xpath="//a[text()='Lost your password?']")
	private WebElement lostpasslink;
	
	@FindBy (xpath="//input[@name='user_login']")
	private WebElement usernmaeoremail;
	
	@FindBy (xpath="//button[text()='Reset password']")
	private WebElement resetbuuton ;
	
	
	
	//variable initialise(constructor call)
	
		public LOSTpassword(WebDriver driver) {
			PageFactory.initElements(driver, this);	
		}
			
		
		public void clickOnLostpasswordLink() {
				lostpasslink.click();
			}
			
		public void enterusername() {
			
			usernmaeoremail.sendKeys("vaibhav");
			
			
			
		}
		
		public void clickOnRestbutton() {
			 resetbuuton.click();
		}
		
	
	
}	
		

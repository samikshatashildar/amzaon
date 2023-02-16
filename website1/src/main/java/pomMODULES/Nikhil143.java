package pomMODULES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nikhil143 {
	/*private WebDriver driver1;
	Actions act;
	@FindBy (xpath="//input[@value='-']")
	private WebElement minusquantity;
	
	@FindBy (xpath="//button[@value='Update cart']")
	private WebElement updatecart;
	
	@FindBy (xpath="//div[@class='wc-proceed-to-checkout']")
	private WebElement checkout;*/
	
	
	
	
	
	
	
	public Nikhil143 (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver1= driver;
		act=new Actions(driver);
	}
	public void clickOnminus() {
		minusquantity.click();
	}
	public void clickOnupdate() {
		updatecart.click();
	}
	public void clickOnCheckout() {
		checkout.click();
	}
}

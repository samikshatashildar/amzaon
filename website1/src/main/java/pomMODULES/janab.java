package pomMODULES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class janab {
	private WebDriver driver1;
	Actions act;
	@FindBy (xpath="(//img[contains(@src,'https://www.heenakochhar.com/wp-content/uploads/2022/03/5F764B6D-9CBC-416E-9C')])[1]")
	private WebElement menskurta;
	
	
	@FindBy (xpath="//button[text()='Filter']")
	private WebElement filter;
	
	
	
	public janab  (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver1= driver;
		act=new Actions(driver);
	}
	
	public void clickOnfirstimg1() {
		menskurta.click();
		
	}
	public void clickOnfilter() {
		filter.click();
		
	}

}

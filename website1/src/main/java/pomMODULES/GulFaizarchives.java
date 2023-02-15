package pomMODULES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GulFaizarchives {
	@FindBy (xpath="(//div[@class='hover-img']//img)[1]")
	private WebElement img1;
	
	
	@FindBy (xpath="(//span[text()='Quick view'])[1]")
	private WebElement searchicon;
	
	@FindBy (xpath="//span[text()='Add to wishlist']")
	private WebElement wishlisticon;
	
	
	@FindBy (xpath="//a[text()='Best Sellers']")
	private WebElement bestseller;
	
	

	public  GulFaizarchives (WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void clikOnimg1() {
		img1.click();
	}
	public void clikOnBestseller() {
		bestseller.click();
	}
}

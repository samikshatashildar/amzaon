package pomMODULES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FANA {
	private WebDriver driver1;
	Actions act;
	Samiksha k;
	@FindBy (xpath="//div[@data-value='s']")
	private WebElement selectsizeS;
	
	@FindBy (xpath="//input[@value=\"+\"]")
	private WebElement additemquntity;

	@FindBy (xpath="//input[@value=\"-\"]")
	private WebElement  removequntity;

	@FindBy (xpath="//input[@id=\"quantity_63bb8999e2cf1\"]")
	private WebElement Enterquntitymanual ;

	@FindBy (xpath="(//span[text()='Add to wishlist'])[1]")
	private WebElement addwishlisticon;
	
	//@FindBy (xpath="//button[text()='Add to cart']")
	//private WebElement sizeguide;
	
	@FindBy (xpath="//a[text()='Made To Order']")
	private WebElement madetoorder;
	
	//MADETOORDER DDETAILS.........................................
	
	@FindBy (xpath="//div[@class='summary-inner']")
	private WebElement homepag;
	
	@FindBy (xpath="//input[@name='your-name']")
	private WebElement yourname;
	
	
	
	@FindBy (xpath="//input[@name='your-email']")
	private WebElement youremail;
	
	
	@FindBy (xpath="//input[@name='kurta-length']")
	private WebElement kurtalength ;
	
	@FindBy (xpath="//input[@name='across-back']")
	private WebElement acrossback ;
	
	@FindBy (xpath="//input[@name='across-front']")
	private WebElement acrossfront;
	
	@FindBy (xpath="//input[@name='shoulder']")
	private WebElement shoulder ;
	
	@FindBy (xpath="//input[@name='upper-bust']")
	private WebElement upperbust ;
	
	@FindBy (xpath="//input[@name='bust']")
	private WebElement bust ;
	
	@FindBy (xpath="//input[@name='under-bust']")
	private WebElement underbust ;
	
	
	
	
	
	@FindBy (xpath="//input[@name='waist']")
	private WebElement waist;
	
	@FindBy (xpath="//input[@name='hip']")
	private WebElement hip;
	
	
	@FindBy (xpath="//input[@name='arm-hole']")
	private WebElement armhole;
	
	@FindBy (xpath="//input[@name='bicep']")
	private WebElement bicep ;
	
	@FindBy (xpath="//input[@name='elbow']")
	private WebElement elbow;
	
	@FindBy (xpath="//input[@name='wrist-circumference']")
	private WebElement wristcircumference ;
	
	@FindBy (xpath="//input[@name='sleeve-length']")
	private WebElement sleevelength ;
	
	@FindBy (xpath="//input[@name='neck-deep-front']")
	private WebElement neckdeepfront ;
	
	@FindBy (xpath="//input[@name='neck-deep-back']")
	private WebElement neckdeepback ;
	
	@FindBy (xpath="//input[@name='bottom-length']")
	private WebElement bottomlength;
	
	@FindBy (xpath="//input[@name='bottom-waist']")
	private WebElement bottomwaist;
	
	
	
	@FindBy (xpath="//input[@name='thigh']")
	private WebElement thigh;
	
	@FindBy (xpath="//input[@name='knee']")
	private WebElement knee ;
	
	@FindBy (xpath="//input[@name='bottom-circumference-ankle']")
	private WebElement bottomcircumferenceankle ;
	
	@FindBy (xpath="(//input[@type='submit'])[1]")
	private WebElement submit ;
	
	
	@FindBy (xpath="//button[text()='Add to cart']")
	private WebElement addtocart;
	
	
	
	//view cart and checkout............................
	@FindBy (xpath="//a[text()='View cart']")
	private WebElement viewaddtocart;
	
	
	
	
	
	
	public FANA (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver1= driver;
		act=new Actions(driver);
	}
	
	
	public void clikOnsize() {
		selectsizeS.click();
	}
	
	public void clikOnplus() {
		additemquntity.click();
	}

	public void clikOnminus() {
		removequntity.click();
	}

	public void clikOnquntitynumber() {
		Enterquntitymanual.sendKeys("2");;
	}
	
	
	
	public void clikOnAddtocart() {
		addtocart.click();
	}
	
	
	public void clikOnAddwishlist() {
		addwishlisticon.click();
		
	}
	//public void clickOnsizeguide() {
		//sizeguide.click();
	//}
	public void clikOnmadetoorder() {
		madetoorder.click();
	}
	
	//........................
	
	public void clikOnYourname() {
		yourname.sendKeys("samiksha");
	}
	
	public void clikOnemail() {
		youremail.sendKeys("samikshamrj67@gmail.com");
	}
	public void clikOnKurtaLength() {
		kurtalength.sendKeys("20");
	}
	public void clikOnbackAcross() {
		acrossback.sendKeys("10");
	}
	public void clikOnAcrossfront() {
		acrossfront.sendKeys("13");
	}
	public void clikOnShoulder() {
		shoulder.sendKeys("45");
	}
	public void clikOnUpperbust() {
		upperbust .sendKeys("28");
	}
	public void clikOnBust() {
		bust .sendKeys("32");
	}
	public void clikOnUnderbust() {
		 underbust.sendKeys("31");
	}
	public void clikOnWaist() {
		 waist.sendKeys("8");
	}
	public void clikOnHip() {
		 hip.sendKeys("27");
	}
	
	public void clikOnArmhole() {
		 armhole.sendKeys("34");
	}
	public void clikOnBicep() {
		 bicep.sendKeys("9");
	}
	public void clikOnElbow() {
		 elbow.sendKeys("10");
	}
	
	public void clikOnWristcircumference() {
		wristcircumference.sendKeys("34");
	}
	
	public void clikonSleevlenght() {
		sleevelength.sendKeys("10");
	}
	
	public void clikOnNeckdeepfront() {
		 neckdeepfront.sendKeys("10");
	}
	
	public void clikOnNeckdeepback() {
		 neckdeepback.sendKeys("10");
	}
	
	public void clikOnBottomlength(){
		 bottomlength.sendKeys("10");
	}
	
	public void clikOnBottomWaist() {
		 bottomwaist.sendKeys("15");
	}
	
	public void clikOnThigh() {
		 thigh.sendKeys("17");
	}
	
	public void clikOnKnee(){
		knee .sendKeys("15");
	}
	
	public void clikOnbottomCurcumferenceatangle() {
		bottomcircumferenceankle .sendKeys("28");
	}
	
	public void clikOnSubmit() {
		submit.click();
	}
	
	public void clikOnviewcart(){
		viewaddtocart.click();
	}
	
	

	public void clikOnhomepag() {
		Actions act= new Actions(driver1);
		act.moveToElement(homepag).click().build().perform();
	}
	
	
	
	
	
	
}

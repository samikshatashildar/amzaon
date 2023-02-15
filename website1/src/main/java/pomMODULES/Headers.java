package pomMODULES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headers {
	private WebDriver driver1;
	private Actions act;
	
	@FindBy (xpath="(//img[@alt='Heena Kochhar'])[1]")
	private WebElement logo ;
	
	@FindBy (xpath="(//span[text()='COLLECTIONS'])[1]")
	private WebElement collections ;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[3]")
	private WebElement gulfaiz ;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[4]")
	private WebElement hamnavs ;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[5]")
	private WebElement sawan ;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[6]")
	private WebElement sheerkhurma;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[7]")
	private WebElement chandbibi;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[8]")
	private WebElement alehda;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[9]")
	private WebElement gulnilofer ;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[10]")
	private WebElement sherbat;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[11]")
	private WebElement trruf;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[12]")
	private WebElement dhoopkinaray ;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[13]")
	private WebElement hussna ;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[14]")
	private WebElement khuld;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[15]")
	private WebElement mandna ;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[16]")
	private WebElement cchakori ;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[17]")
	private WebElement dastangoi ;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[18]")
	private WebElement dilnoor ;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[19]")
	private WebElement dilli ;
	
	
	@FindBy (xpath="(//span[text()='Janab'])[1]")
	private WebElement janab ;
	
//ACCESSORIES
	
	@FindBy (xpath="(//span[text()='Accessories'])[1]")
	private WebElement accsessories;
	@FindBy (xpath="(//a[text()='Parandi'])[1]")
	private WebElement parndi;
	@FindBy (xpath="(//a[text()='Potlis/jholas'])[1]")
	private WebElement potlis;
	@FindBy (xpath="(//a[text()='Juttis'])[1]")
	private WebElement juttis;
	
	//BRESTSELLER
	
	@FindBy (xpath="//a[text()='Best Sellers']")
	private WebElement bestseller;
	
	//BLOG
	@FindBy (xpath="(//span[text()='Blog'])[1]")
	private WebElement blog ;
	
	//HELP
	@FindBy (xpath="(//span[text()='Help'])[1]")
	private WebElement help ;
	
	@FindBy (xpath="(//span[text()='Help'])[1]")
	private WebElement about ;
	@FindBy (xpath="(//a[text()='FAQs'])[1]")
	private WebElement faqs ;
	@FindBy (xpath="(//a[text()='Contact'])[1]")
	private WebElement contact ;
	
	//MY ACCOUNT
	@FindBy (xpath="(//span[@class='wd-tools-icon'])[1]")
	private WebElement myacount ;
	
	
	@FindBy (xpath="(//span[text()='Logout'])[1]")
	private WebElement logout;
	
	//search
	@FindBy (xpath="(//a[@aria-label='Search'])[1]")
	private WebElement search ;
	
	//WISHLIST
	@FindBy (xpath="(//span[text()='Wishlist'])[1]")
	private WebElement wishlist ;
	
	//ADD TO CART
	@FindBy (xpath="(//span[@class='wd-cart-number wd-tools-count woodmart-cart-number'])[1]")
	private WebElement addtocart ;
	
	
	
	//88888888888888888888888
	

	//variable initialise(constructor call)
	
	public  Headers(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		this.driver1= driver;
		act=new Actions(driver);
	}
	
	
	public void clickOnlogo() {
		logo.click();
	}
	
	public void hoverOnCoolections() {
		//Actions act= new Actions(driverG);
		act.moveToElement(collections).perform();
		// collections.click();
	}
	public void clickOngulfiz() {
		gulfaiz.click();
	}
	public void clickOnhamnavs() {
		hamnavs.click();
	}
	
	public void clickOnmyacount() {
		myacount.click();
	}
	
	public void hoverOnMyAccount() {
		//Actions act= new Actions(driverG);
		act.moveToElement(myacount).perform();
		// collections.click();
	}
	
	public void clickOnLogout() {
		logout.click();
	}
	public void clickOnviewcart() {
		addtocart.click();
	}
	public void hoverOnwishlisticon() {
		//Actions act= new Actions(driverG);
		act.moveToElement(wishlist).click().build().perform();
		// collections.click();
	}
	
	public void hoverOnjanab() {
		//Actions act= new Actions(driverG);
		act.moveToElement(janab).click().build().perform();
		// collections.click();
	}
	
	
	
	
	
	
}

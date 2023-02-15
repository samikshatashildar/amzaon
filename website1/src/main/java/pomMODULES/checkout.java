package pomMODULES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout {
	private WebDriver driver1;
	Actions act;
	@FindBy (xpath="//input[@name='billing_first_name']")
	private WebElement firstname1 ;
	
	@FindBy (xpath="//input[@name='billing_last_name']")
	private WebElement lastname1 ;
	
	@FindBy (xpath="//input[@name='billing_company']")
	private WebElement companyname;
	
	@FindBy (xpath="//input[@class='select2-search__field']")
	private WebElement drpdown ;
	
	@FindBy (xpath="//li[text()='India']")
	private WebElement indiaoption ;
	
	@FindBy (xpath="//input[@id='billing_address_1']")
	private WebElement streetaddress ;
	
	@FindBy (xpath="//input[@id='billing_address_2']")
	private WebElement apartment ;
	
	@FindBy (xpath="//input[@id='billing_city']")
	private WebElement Towncity ;
	
	@FindBy (xpath="(//span[@class='select2-selection select2-selection--single'])[2]")
	private WebElement country  ;
	
	@FindBy (xpath="//input[@name='billing_postcode']")
	private WebElement postalcode ;
	
	@FindBy (xpath="//input[@name='billing_phone']")
	private WebElement phonenum ;
	
	@FindBy (xpath="//button[@value='Place order']")
	private WebElement placeorder ;
	
	//...................cunstructor
	
	public checkout (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver1= driver;
		act=new Actions(driver);
	}
	
	

	public void enterFirstname() {
		firstname1 .sendKeys("samiksaha");
	}
	
	public void enterLastname() {
		lastname1.sendKeys("tashildar");
	}

	public void clikOncompaneyname() {
		companyname.sendKeys("gbcikybdv");
	}

	public void clikOncountry() {
		country .sendKeys("india");
	}
	public void clikOnIndia() {
		indiaoption.click();
	}
	
	public void clikOnstreetaddress() {
		streetaddress.sendKeys("miraj chowk");;
	}
	
	public void clikOnappartmentname() {
		apartment.sendKeys("Budhwar peth galii 1");;
	}
	public void clikOnTowncity() {
		Towncity.sendKeys("sangali");;
	}
	public void clikOnState() {
		country.sendKeys("Maharashtra");
	}
		public void clikOnpostcode() {
			postalcode.sendKeys("416122");
		}
		public void clikOnPhonenum() {
			phonenum.sendKeys("8600041886");
		}
		public void clikOnPlaceorder() {
			placeorder.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

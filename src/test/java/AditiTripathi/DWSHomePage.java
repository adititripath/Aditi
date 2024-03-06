package AditiTripathi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePage {
	public DWSHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement register_link;
	
	
	@FindBy(xpath="//a[text()='Log in']")
	WebElement login;
	@FindBy(xpath="//span[text()='Shopping cart']")
	WebElement Shoping_cart;
	@FindBy(xpath="//span[text()='Wishlist']")
	WebElement wishlist;
	@FindBy(xpath="//input[@name='q']")
	WebElement search;
	@FindBy(xpath="//a[@href='/books']")
	WebElement book;
	@FindBy(xpath="//a[@href='/computers']")
	WebElement computers;
	@FindBy(xpath="//a[@href='/electronics']")
	WebElement electronics;
	@FindBy(xpath="//a[@href='/apparel-shoes']")
	WebElement Sh;
	@FindBy(xpath="//a[@href='/digital-downloads']")
	WebElement downlode;
	@FindBy(xpath="//a[@href='/jewelry']")
	WebElement jew;
	@FindBy(xpath="//a[@href='/gift-cards']")
	WebElement gift_cards;
	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
	WebElement img;
	@FindBy(xpath = "//label[text()='Excellent']")
	WebElement Exce;
	@FindBy(id="Email")
	WebElement log;
	@FindBy(id="Password")
	WebElement pass;
	@FindBy(id="RememberMe")
	WebElement reb;
	@FindBy(xpath="//input[@value='Log in']")
	WebElement log1;
	@FindBy(id="gender-female")
	WebElement gender;
	@FindBy(id="FirstName")
	WebElement Fname;
	@FindBy(id="LastName")
	WebElement lname;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement passw;
	@FindBy(id="ConfirmPassword")
	WebElement Confi;
	@FindBy(id="register-button")
	WebElement button;
    @FindBy(xpath="//input[@value='Add to cart']")
    WebElement addToCart;
    @FindBy(id="products-orderby")
    WebElement order;
    @FindBy(xpath="//input[@value='Add to cart']")
    WebElement add;
    @FindBy(xpath="//a[text()='Facebook']")
    WebElement facebook;
    @FindBy(xpath="//input[@fdprocessedid='5a8pwg']")
    WebElement add1;
}

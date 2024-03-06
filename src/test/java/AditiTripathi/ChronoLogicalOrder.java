package AditiTripathi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronoLogicalOrder {
	
		WebDriver driver=new ChromeDriver();
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
		
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void BeforeClass()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
	
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("tripathiaditi@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("1234556");
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		System.out.println("Before Method");
	}
	@Test
	public void Test()
	
	{
	  driver.findElement(By.xpath("//a[@href='/digital-downloads']")).click();
	  List<WebElement> AddToCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
	  for (WebElement web : AddToCart) {
		  web.click();
	  }
	  WebElement Cart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
	  if(Cart.isDisplayed())
	  {
		  Cart.click();
		  System.out.println("Shoping cart");
	  }
	  else
	  {
		  System.out.println(" not Shoping cart"); 
	  }
		
		System.out.println("test");
	}
	@AfterMethod
	public void AfterMethod()
	{
		WebElement logout = driver.findElement(By.xpath("//a[text()='Log out']"));
		if(logout.isEnabled())
		{
			logout.click();
			System.out.println("After method");
		}
		else
		{
			System.out.println("After not method");
		}
		System.out.println("After method");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After class");
	}
	@AfterTest
	public void AfterTest()
	{
	System.out.println("After Test");	
	
	}
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println("After Suit");
	}

}

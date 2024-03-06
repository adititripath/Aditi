package AditiTripathi;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
//launch Website alphabetical order and ASCII value
public class TestNgLaunch{
	@Test	
public void dws(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	//System.out.println("Hello Aditi");
	//use Reporter.log for printing statement
	Reporter.log("Hello Aditi",true);
	driver.close();
	}
	@Test
	public void csk()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.chennaisuperkings.com/");
		//use Reporter.log for printing statement
		Reporter.log("I am from csk",true);
		driver.close();
	}
	
	@Test
	public void rcb()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		//use Reporter.log for printing statement
		Reporter.log("I am from rcb",true);
		driver.close();
	}
	@Test

	public void MI()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.mumbaiindians.com/");
		//use Reporter.log for printing statement
		Reporter.log("I am from Mi",true);
		driver.close();
	}
}

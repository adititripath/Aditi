package AditiTripathi;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DigitalDownlode {
	@Test
	public void downlode() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	DWSHomePage dws=new DWSHomePage(driver);
	dws.downlode.click();
	dws.order.click();
	dws.add.click();
	//dws.facebook.click();1
	dws.add1.click();
	
	
	
	
	}
	

}

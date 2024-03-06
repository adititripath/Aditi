package AditiTripathi;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shoping_cart {
	@Test
	public void cart() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		DWSHomePage dws=new DWSHomePage(driver);
		dws.addToCart.click();
		Thread.sleep(2000);
		dws.Shoping_cart.click();
		
	}

}

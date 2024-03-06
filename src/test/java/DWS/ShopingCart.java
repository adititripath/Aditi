package DWS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AditiTripathi.DWSHomePage;

public class ShopingCart {
	@Test
	public void Cart() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/cart");
	DWSHomePage dws=new DWSHomePage(driver);
	
    
	}

}

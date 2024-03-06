package DWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDwsHomePage {
	@Test
	public void simple()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		DWSHomePage dws=new DWSHomePage(driver);
		dws.register_link.click();
	    dws.login.click();
	    dws.Shoping_cart.click();
	    dws.wishlist.click();
	    dws.search.sendKeys("gift");
	    dws.book.click();
	    dws.computers.click();
	    dws.electronics.click();
	    dws.Sh.click();
	    dws.downlode.click();
	    dws.jew.click();
	    dws.gift_cards.click();
	    dws.img.click();
	    dws.Exce.click();
	}

}

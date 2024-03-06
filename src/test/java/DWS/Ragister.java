package DWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ragister {
	@Test
	public void ragister()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		DWSHomePage dws=new DWSHomePage(driver);
		dws.gender.click();
		dws.Fname.sendKeys("aditi");
		dws.lname.sendKeys("Tripath");
		dws.email.sendKeys("adititripath@gmail.com");
		dws.passw.sendKeys("123456");
		dws.Confi.sendKeys("123456");
		dws.button.click();
	}

}

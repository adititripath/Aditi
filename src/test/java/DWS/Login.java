package DWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void login_page()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		DWSHomePage dws=new DWSHomePage(driver);
		dws.log.sendKeys("admin1@gmail.com");
		dws.pass.sendKeys("admin1");
		dws.reb.click();
		dws.log1.click();
	}

}

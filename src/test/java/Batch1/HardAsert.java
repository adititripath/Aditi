package Batch1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAsert {
	@Test
	public void Hard()
	{
		String expected="https://demowebshop.tricentis.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
	    String actual = driver.getCurrentUrl();
	   // assertEquals(expected, actual);
	    assertNotEquals(actual, expected);
	    System.out.println("My script is successful");
	}

}

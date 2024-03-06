package Batch1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Softassert {
	@Test
	public void assertAll()
    {
		String expectedHome="https://demowebshop.tricentis.com/";
		String expectedReg="https://demowebshop.tricentis.com/register";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Softassert soft =new Softassert();
	    String actualHome = driver.getCurrentUrl();
	    driver.findElement(By.xpath("//a[@href=\"/register\"]")).click();
	    String actualReg=driver.getCurrentUrl();
	    assertEquals(expectedHome, actualHome);
	    //assertNotEquals(actualHome, expectedHome);
	    assertEquals(actualReg, expectedReg);
	    System.out.println("My script is successful");
	}
		
	}


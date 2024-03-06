package Batch1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertFalseM {
@Test
public void assertF()
{
	String expected="https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html");
	
    String actual = driver.getCurrentUrl();
    assertEquals(actual, expected);
    System.out.println("My script is successful");
   WebElement jdk11 = driver.findElement(By.xpath("//a[text()='jdk-11.0.20_windows-x64_bin.exe']")); 
   assertTrue(jdk11.isDisplayed());
   jdk11.click();
   WebElement downlode = driver.findElement(By.xpath("//a[text()='Download jdk-11.0.20_windows-x64_bin.exe']"));
   assertTrue(downlode.isEnabled());
   //SoftAssert soft= new SoftAssert();
   //downlode.click();
   JavascriptExecutor js=(JavascriptExecutor) driver;
   js.executeScript("arguments[0].click();", downlode);
   driver.close();
  
    
    


}
}

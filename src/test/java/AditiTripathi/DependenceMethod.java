package AditiTripathi;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependenceMethod {
	public class HelperMethod {
		@Test(priority = 0,dependsOnMethods = "nike")
		// invocationCount show the web page for given number of times 
		public void dws(){
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			//use Reporter.log for printing statement
			Reporter.log("Hello Aditi",true);
			driver.close();
			}
			@Test(priority = 1)
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
			
			@Test(priority = 2)
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
			//@Test(priority = 3,enabled = true)
			// enabled=true show the web page
			// enabled =false, hide the web page
			@Test(priority = 3,enabled = false)
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
			



	}}

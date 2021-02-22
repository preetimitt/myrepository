package Seleniumexercise;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTitleTest {
		WebDriver driver;
		
		@BeforeMethod
		public void setup()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			
		}
		
		@Test
		public void googleTitleTest()
		{
			String title = driver.getTitle();
			System.out.println(title);
			//Assert.assertEquals(title, "Google123", "Title is not matching");
		}
		
		@Test
		public void googleLogoTest()
		{
			boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
			System.out.println(b);
			Assert.assertEquals(b, true);
			//Assert.assertTrue(b);		//both assertions are same
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		

	}




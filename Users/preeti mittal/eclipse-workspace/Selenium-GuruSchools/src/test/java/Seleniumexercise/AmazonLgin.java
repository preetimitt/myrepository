package Seleniumexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLgin {
	
	WebDriver driver=null;
	WebElement element= null;
	
	@BeforeClass
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void Url()
	{
		driver.get("https://www.amazon.com/");
	}
	
	@Test(priority=1)
	public void Iphone()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	@Test(priority=2)
	public void Hp()
	{
		WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
		 element.clear();
		 element.sendKeys("HP Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	@Test(priority=3)
	public void BestSeller()
	{
		
		driver.findElement(By.linkText("Best Sellers")).click();
	}
	
	//@AfterMethod
	
}
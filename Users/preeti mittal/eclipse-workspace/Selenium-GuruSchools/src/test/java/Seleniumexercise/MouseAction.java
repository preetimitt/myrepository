package Seleniumexercise;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		String URL = "https://s1.demo.opensourcecms.com/wordpress/wp-login.php";
		driver.get(URL);
	
		//Adding wait 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		Actions act = new Actions(driver);

		  driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
		  driver.findElement(By.id("user_pass")).sendKeys("opensourcecms");
		  driver.findElement(By.id("wp-submit")).click();
		  Thread.sleep(1000);
		
		 WebElement logoutOption = driver.findElement(By.xpath("//a[text()='Howdy, ']"));
		
		 act.moveToElement(logoutOption).perform();
		 
		 driver.findElement(By.xpath("//a[@class='ab-item'][text()='Log Out']")).click();;
		}


	}



package Seleniumexercise;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.google.com/");
		  Thread.sleep(2000);

		  driver.findElement(By.name("q")).sendKeys("Selenium");
		  Thread.sleep(3000);


		  List<WebElement> list = driver.findElements(By.xpath("//ul/li[@class='sbct']"));

		  for(int i = 0 ;i< list.size();i++)
		  {
		   System.out.println(list.get(i).getText());
		   
		   String searchText=list.get(i).getText();
		   
		   if(searchText.equals("selenium testing"))
		   {
		    list.get(i).click();
		    break;
		   }
		  }

		  driver.close();
	}

}

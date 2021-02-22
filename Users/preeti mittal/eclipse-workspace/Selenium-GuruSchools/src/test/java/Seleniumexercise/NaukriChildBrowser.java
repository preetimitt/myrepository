package Seleniumexercise;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		     WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.naukri.com");
				Set<String> window = driver.getWindowHandles();
				Thread.sleep(5000);
				System.out.println(window.size());
				
				ArrayList<String> al = new ArrayList<>(window);
				al.addAll(window);
				System.out.println(al.size());
				
				driver.switchTo().window(al.get(1));// control is present in "0" that is naukri so we are switching to L&T. so value we are giving here is "1"
				//System.out.println(driver.getTitle());// window name(LNT)
				Thread.sleep(5000);
				driver.manage().window().maximize();
				driver.close();
				// after closing window ypu can not perform any program, otherwise u get no such window exception//
				driver.switchTo().window(al.get(0));
				
				
				System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package Seleniumexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().getClass();
		WebDriver driver = new ChromeDriver();

		String URL="https://www.facebook.com/";
		driver.get(URL);
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT).sendKeys(txtUsername,"hello").
				                 keyUp(txtUsername, Keys.SHIFT).doubleClick(txtUsername).contextClick().build();
				
		seriesOfActions.perform();
	}

}

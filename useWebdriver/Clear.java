package useWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(Keys.chord(Keys.SHIFT, "packt publishing"));
		searchBox.clear();

	}

}
